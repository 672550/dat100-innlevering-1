package O1;
import java.util.Scanner;
public class o1 {

	public static void main(String[] args) {
	
		for (int i=1; i<=10; i++) {
		
Scanner scanner = new Scanner(System.in);
System.out.println("Hva er din poengsum? ");
int poeng = scanner.nextInt();

	if (poeng <= 100 && poeng >= 90) {
		System.out.println("Du får karakteren A :)");
	}
	else if (poeng <= 89 && poeng >= 80) {
		System.out.println("Du får karakteren B");
	}
	else if (poeng <= 79 && poeng >= 60) {
		System.out.println("Du får karakteren C");
	}
	else if (poeng <= 59 && poeng >= 50) {
		System.out.println("Du får karakteren D");
	}
	else if (poeng <= 49 && poeng >= 40) {
		System.out.println("Du får karakteren E");		
	}
	else if (poeng <= 39 && poeng >= 0) {
		System.out.println("Du får karakteren F");
	}
	else {
		System.out.println("Ugyldig svar, mulige poengsummer er mellom 0 og 100, prøv igjen");
		i--;
	}

}


	
	}

}

