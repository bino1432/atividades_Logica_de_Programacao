package atividade;

import java.util.Scanner;

public class E13 {
	
	static boolean sim = false;
	static String frase = "";

	public static void main (String[]args) {
				
		Scanner leia = new Scanner(System.in);
		
		System.out.print("insira um codigo: ");
		frase = leia.next();
		
		verificacao();
		
		if(sim == true) {
			System.out.print("é binario");
		} else {
			System.out.print("não é binario");
		}
		
		leia.close();
	}
	static void verificacao() {
		for (int cont = 0; cont <= frase.length(); cont++) {
			if(frase.charAt(cont) != 0 && frase.charAt(cont) != 1 && frase.length() == 8) {
				sim = true;
			}
		}
	}
}