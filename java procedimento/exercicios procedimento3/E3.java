package exercicio;

import java.util.Scanner;

public class E3 {
	
	static int valor;
	static boolean par = false;
	
	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.print("insira uma valor: ");
		valor = leia.nextInt();
		
		verificacao();
		
		if (par == true) {
			System.out.print("o numero é par");
		} else {
			System.out.print("o numero é impar");
		}
		
		leia.close();
	}
	static void verificacao() {
		if (valor % 2 == 0) {
			par = true;
		}
	}
}
