package exercicio;

import java.util.Scanner;

public class E8 {
	
	static int valor;
	
	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("insira um valor: ");
		valor = leia.nextInt();
		
		fibonacci();
		
		leia.close();
	}
	static void fibonacci() {
		switch(valor){
		case 1:
			System.out.print("esta na primeira e na segunda casa");
			break;
		case 2:
			System.out.print("esta na terceira casa");
			break;
		case 3:
			System.out.print("esta na quarta casa");
			break;
		case 5:
			System.out.print("esta na quinta casa");
			break;
		case 8:
			System.out.print("esta na sexta casa");
			break;
		case 13:
			System.out.print("esta na setima casa");
			break;
		case 21:
			System.out.print("esta na oitava casa");
			break;
		case 34:
			System.out.print("esta na nona casa");
			break;
		case 55:
			System.out.print("esta na decima casa");
			break;
		default:
			System.out.print("numero nao encontrado");
			break;
		}
	}
}
