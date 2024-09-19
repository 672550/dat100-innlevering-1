package o3;

import java.util.Scanner;

public class O3 {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("skriv inn tallet du vil finne fakultetet av");
long tall = scanner.nextLong();
long fakultet = 1;		
	for (long i = 2; i <= tall; i++) {
		fakultet = fakultet * i;

	}
	System.out.println("fakultetet av tallet er: "+fakultet);
	}

}
