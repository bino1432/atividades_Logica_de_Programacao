package exercicios;

import java.util.Scanner;

public class E3 {
	
	static int numeroinicial, potencia, numero = 0;
	
	public static void main(String []args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.print("insira o numero que deseja");
		numero = leia.nextInt();
		System.out.print("qual a potencia");
		potencia = leia.nextInt();

		conta();
		
		leia.close();
	}
	static void conta() {
		 int cont = 1;
		 
		 numero = numeroinicial;
		 while (cont < potencia) {
			 numero = numero * numeroinicial;
			 System.out.print("a potencia com base "+potencia+"tem como resposta "+numero);
			 cont++;
		 }
	}
}