package exercicio;

import java.util.Scanner;

public class E4 {
	
	static int valor1, valor2;
	static boolean sim = false;
	
	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);
	
		System.out.print("insira o primeiro valor");
		valor1 = leia.nextInt();
		System.out.print("insira o segundo valor");
		valor2 = leia.nextInt();

		verificacao();
		
		if (sim == true) {
			System.out.print("o numero é divisivel");
		} else {
			System.out.print("o numero não é divisivel");
		}
		
		leia.close();
	}
	static void verificacao() {
		if (valor1 % valor2 == 0) {
			sim = true;
		}
	}
}
