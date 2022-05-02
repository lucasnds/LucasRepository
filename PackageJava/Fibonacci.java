package PackageJava;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {

	    int n;
		int a=1;
		int soma = 0;
		int cont = 0;
		int b=1;

	Scanner scan = new Scanner(System.in);
		
		System.out.println("Posição da sequêcia de fibonacci");
		n = scan.nextInt();

		scan.close();

		for(a=1; cont!=n; a++) {
			a=b;
		    b=soma;
			soma = a+b;
			cont++;
			System.out.println(soma);
		}
		
	}

}
