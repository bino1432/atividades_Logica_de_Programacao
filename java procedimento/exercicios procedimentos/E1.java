package exercicios;

import java.util.Scanner;

public class E1 {
	
	static double valor;
	
	public static void main (String[]args ) {
		
		int escolha;	
		
		Scanner leia = new Scanner(System.in);
		System.out.print("qual o valor que deseja converter: ");
		valor = leia.nextInt();
		System.out.print("insira 1 para converter para dolar e 2 para yen: ");
		escolha = leia.nextInt();
		
		if(escolha == 1) {
			converterDolar();
			System.out.print("o valor convertido é: "+valor);
		} else if (escolha == 2) {
			converterYen();
			System.out.print("o valor convertido é: "+valor);
		} else {
			System.out.print("valor conversao invalido");
		}
		
		leia.close();
	}
	
	static void converterDolar() {
		valor = valor * 0.30;
	}
	static void converterYen() {
		valor = valor * 30;
	}
}
