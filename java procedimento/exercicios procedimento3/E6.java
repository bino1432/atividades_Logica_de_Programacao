package exercicio;

import java.util.Scanner;

public class E6 {
	
	static int mes;
	
	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("insira um numero");
		mes = leia.nextInt();
		
		verificacao();
		
		leia.close();
	}
	static void verificacao() {
		switch (mes) {
		case 1:
			System.out.print("o mes � janeiro");
			break;
		case 2:
			System.out.print("o mes � fevereiro");
			break;
		case 3:
			System.out.print("o mes � mar�o");
			break;
		case 4:
			System.out.print("o mes � abril");
			break;
		case 5:
			System.out.print("o mes � maio");
			break;
		case 6:
			System.out.print("o mes � junho");
			break;
		case 7:
			System.out.print("o mes � julho");
			break;
		case 8:
			System.out.print("o mes � agosto");
			break;
		case 9:
			System.out.print("o mes � setembro");
			break;
		case 10:
			System.out.print("o mes � outubro");
			break;
		case 11:
			System.out.print("o mes � novembro");
			break;
		case 12:
			System.out.print("o mes � dezembro");
			break;
		case 13:
			System.out.print("mes invalido");
			break;
		}
	}
}
