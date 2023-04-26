package atividade;

import java.util.Scanner; 

public class E15 {
	
	static boolean igual = false;
	static String frase;
	
	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("insira uma frase: ");
		frase = leia.next();
		
		verificacao();
		if(igual == true) {
			System.out.print("todos são maiusculos");
		} else {
			System.out.print("alguns nao sao maiusculos");
		}
		
		leia.close();
	}
	static void verificacao() {
		String maiusculo;
		
		maiusculo = frase.toUpperCase();
		if (frase == maiusculo) {
			igual = true;
		}
	}
}