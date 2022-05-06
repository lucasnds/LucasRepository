package PackageJava;

import java.util.Scanner;

public class Prova01 {

	public static void main(String[] args) {
		
		int a; 
		int b;
		int x = 1;
		int soma=0;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Determine valores positivos para A e B: ");
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a<b) {
		do {
		if(x%a==0) {
		soma = soma + x;
		}
		x++;
		}while(x!=b);
		
		System.out.println("A soma dos múltiplos de A menores que B é = " + soma);
		
		System.out.println("Fim");
		
		}else
			System.out.println("Números Inválidos");		
		
		scan.close();
		}
		}
