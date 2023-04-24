package exercicio;

import java.util.Scanner;

public class E10 {
	
	static double altura;
	static int genero;
	static double peso;
	
	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);

		System.out.print("insira 1 para homem e 2 para mulher");
		genero = leia.nextInt();
		System.out.print("qual a sua altura");
		altura = leia.nextDouble();
		
		calculos();
		
		leia.close();
	}
	static void calculos() {
		if (genero == 1) {
			peso = (72.7 * altura) - 58;
			System.out.print("o peso ideal é "+peso);
		} else if (genero == 2) {
			peso = (62.1 * altura) - 44.7;
			System.out.print("o peso ideal é "+peso);
		} else {
			System.out.print("genero invalido");
		}
	}
}
