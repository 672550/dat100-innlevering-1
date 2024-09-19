package o2;

import java.util.Scanner;

public class O2 {

	public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
System.out.println("Hva er din bruttoinntekt?");
double inntekt = scanner.nextDouble();
double skatt = 0;
double trinn1max = 1441.60;
double trinn2max = 15086;
double trinn3max = 36434.4;
double trinn4max = 68408.60;
	if (inntekt <= 208051) {
		System.out.println("Du betaler ikke trinnskatt!");
	}
	else if (inntekt <= 292850 && inntekt > 208051) {
		skatt = (inntekt-208051) * 0.017;
		System.out.println("Din trinnskatt er: "+skatt);
	}
	else if (inntekt <= 670000 && inntekt > 292850) {
		skatt = trinn1max + ((inntekt-292850) * 0.04);
		System.out.println("Din trinnskatt er: "+skatt);
	}
	else if (inntekt <= 937900 && inntekt > 670000) {
		skatt = trinn1max + trinn2max + ((inntekt-670000) * 0.136);
		System.out.println("Din trinnskatt er: "+skatt);
	}
	else if (inntekt <= 1350000 && inntekt > 937900) {
		skatt = trinn1max + trinn2max + trinn3max + ((inntekt-937900) * 0.166);
		System.out.println("Din trinnskatt er: "+skatt);
	}
	else if (inntekt > 1350000) {
		skatt = trinn1max + trinn2max + trinn3max + trinn4max + ((inntekt-1350000) * 0.176);
		System.out.println("Din trinnskatt er: "+skatt);
	}

		
	}

}
