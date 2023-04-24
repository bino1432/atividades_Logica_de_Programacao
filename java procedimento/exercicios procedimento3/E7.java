package exercicio;

import java.util.Scanner;

public class E7 {
	
	static int valor;
	
	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("insira um valor");
		valor = leia.nextInt();
		
		fatorial();
		
		leia.close();
	}
	static void fatorial() {
		
		int cont = 1;
		
		System.out.println("os fatoriais são");
		while(cont <= valor) {
			System.out.println(cont);
			cont++;
		}
	}
}
