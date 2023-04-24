package exercicio;

import java.util.Scanner;

public class E5 {
	
	static int ano;
	static boolean sim = false;
	
	public static void main (String[]args) {
	
		Scanner leia = new Scanner(System.in);
		
		System.out.print("insira um ano");
		ano = leia.nextInt();
		
		verificacao();
		
		if(sim == true) {
			System.out.print("o ano é bissexto");
		} else {
			System.out.print("o ano não é bissexto");
		}
		
		leia.close();
	}
	static void verificacao() {
		if (ano % 4 == 0) {
			sim = true;
		}
	}
}
