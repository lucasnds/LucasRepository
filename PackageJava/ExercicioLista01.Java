package PackageJava;

import java.util.Scanner;

public class ExercicioLista01 {

	public static void main(String[] args) {

		int a,b,c;

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe três coeficientes,a,b & c, respectivamente:");

		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		int delta = b^2-4*a*c;
		double xpositivo = (-b)+Math.sqrt(delta)/(2*a);
		double xnegativo = (-b)-Math.sqrt(delta)/(2*a);
		
        if (delta<0) {
			System.out.println("Não existe raízes reais");
		}else if (delta==0) {
			System.out.println((-b)+Math.sqrt(delta)/(2*a));
		}else if (delta>0) {
			System.out.printf("%.2f\n",xpositivo);
			System.out.printf("%.2f\n",xnegativo);
		}
		scan.close();
		

	}

}
