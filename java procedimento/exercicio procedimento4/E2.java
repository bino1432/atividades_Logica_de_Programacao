package exercicios;

import java.util.Scanner;

public class E2 {
	
	static int valor1, valor2;
	
	public static void main(String []args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.print("qual o primeiro valor");
		valor1 = leia.nextInt();
		System.out.print("qual o segundo valor");
		valor2 = leia.nextInt();

		
		conta();
		
		leia.close();
	}
	static void conta() {
		 int cont = 1;
		 
		 while (cont < valor2) {
			 valor1 = valor1 + valor1;
			 System.out.print("o numero vezes "+cont+" é "+valor1);
			 cont++;
		 }
	}
}
