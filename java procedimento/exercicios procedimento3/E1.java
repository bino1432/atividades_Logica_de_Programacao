package exercicio;

import java.util.Scanner;

public class E1 {
	
	static int valorinicial;
	
	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("isira um numero que deseja saber a tabuada: ");
		valorinicial = leia.nextInt();
		
		tabuada();
		
		leia.close();
	}
	static void tabuada() {
		
		int cont = 0;
		int valor;
		
		while(cont <= 10) {
			valor = valorinicial * cont;
			System.out.println("o "+valorinicial+" vezes o "+cont+" é "+valor);
			valor = 0;
			cont++;
		}
	}
}
