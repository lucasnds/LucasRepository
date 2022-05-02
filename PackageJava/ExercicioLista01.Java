package PackageJava;

import java.util.Scanner;

public class ExercicioLista01 {

	public static void main(String[] args) {

        double salarioantigo;		
		int cargo;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o salário atual e seu cargo usando 101 para Gerente, 102 para Engenheiro,103 para Técnico:");
		salarioantigo = scan.nextDouble();
		cargo = scan.nextInt();
		scan.close();
		if(cargo==101) {
			System.out.println((salarioantigo*0.10)+salarioantigo+" Reais, é o valor do seu novo salário Sr. Gerente."
					+ ""+salarioantigo+" Salario antigo, aumento de "+(salarioantigo*0.10));
		}else 
			if (cargo==102) {
			System.out.println((salarioantigo*0.20)+salarioantigo+" Reais, é o valor do seu novo salário Sr. Engenheiro."
					+ ""+salarioantigo+" Salario antigo, aumento de "+(salarioantigo*0.20));
		}else 
			if (cargo==103) {
			System.out.println((salarioantigo*0.30)+salarioantigo+" Reais, é o valor do seu novo salário Sr. Tecnico"
		+ ""+salarioantigo+" Salario antigo, aumento de "+(salarioantigo*0.30));
		}else {
			System.out.println((salarioantigo*0.40)+salarioantigo+" Reais, é o valor do seu novo salário Senhor(a)."
		+ ""+salarioantigo+" Salario antigo, aumento de "+(salarioantigo*0.40));
		}
    }
}
