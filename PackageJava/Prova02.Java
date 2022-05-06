package PackageJava;

import java.util.Scanner;

public class Prova02 {

	public static void main(String[] args) {
		
		int n;
		int x=0;
		int cont=0;
		int soma=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Determine valor para n: ");
		n = scan.nextInt();
		
		do {
		x++;
		if(x%2!=0) {
		soma = soma + x;
		cont++;
		}
		}while(cont!=n);
		
		System.out.println("O valor de " + n + "² é igual a " + soma);
		System.out.println("End.");
		scan.close();
		}
		}
        