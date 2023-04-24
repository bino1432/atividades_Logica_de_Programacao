package exercicio;

import java.util.Scanner;

public class E2 {
	
	static int valor;
	
	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.print("insira um numero: ");
		valor = leia.nextInt();
		
		absoluto();
		
		leia.close();
	}
	static void absoluto() {
		if (valor < 0) {
			valor = -(valor); 
		}
		System.out.print("o valor absoluto é "+valor);
	}
}
