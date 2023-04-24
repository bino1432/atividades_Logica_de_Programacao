package exercicio;

import java.util.Scanner;

public class E9 {
	
	static int genero;
	static double peso;
	static int idade;
	static int altura;
	static double GEB;
	
	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("insira 1 para homem e 2 para mulher");
		genero = leia.nextInt();
		
		verificacao();
		
		leia.close();
	}
	static void verificacao() {
		if (genero == 1) {
			GEB = 66.47 + (13.75 * peso) + (5 * altura) - (6.76 * idade);
			System.out.print("o GEB é "+GEB);
		} else if (genero == 2) {
			GEB = 655.1 + (9.56 * peso) + (1.85 * altura) - (4.67 * idade);	
			System.out.print("o GEB é "+GEB);
		} else {
			System.out.print("genero invalido");
		}
	}
}
