package exercicio;

import java.util.Scanner;
import java.util.Random;

public class E1 {
	
	static int valor, obj;
	static boolean acerto = false;
	
	public static void main (String []args) {
		
		int cont = 0;
		
		Scanner leia = new Scanner(System.in);
		Random rand = new Random();
		obj = rand.nextInt(1000);
		
		while(acerto == false) {
			System.out.println("insira um numero");
			valor = leia.nextInt();
			numero();
			cont++;
		}
		leia.close();
	}
	static void numero() {
		if (valor < obj) {
			System.out.println("numero menor");
		} else if (valor > obj) {
			System.out.println("numero maior");
		} else {
			System.out.println("acertou");
			acerto = true;
		}
	}
}
