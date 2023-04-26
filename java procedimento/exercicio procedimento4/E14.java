package atividade;

import java.util.Scanner;

public class E14 {
	
	static String frase = "";
	static boolean igual = false;
	
	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("insira uma frase: ");
		frase = leia.next();
		
		verificacao();
		
		if (igual == true) {
			System.out.print("é um palíndromo");
		} else {
			System.out.print("nao é um palíndromo");
		}
		
		leia.close();
	}
	static void verificacao() {
		
		String fraseInvertida = "";
		
		fraseInvertida = frase;
		if (frase == fraseInvertida) {
			igual = true;
		}
	}
}
