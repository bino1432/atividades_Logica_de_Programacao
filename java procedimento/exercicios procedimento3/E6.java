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
			System.out.print("o mes é janeiro");
			break;
		case 2:
			System.out.print("o mes é fevereiro");
			break;
		case 3:
			System.out.print("o mes é março");
			break;
		case 4:
			System.out.print("o mes é abril");
			break;
		case 5:
			System.out.print("o mes é maio");
			break;
		case 6:
			System.out.print("o mes é junho");
			break;
		case 7:
			System.out.print("o mes é julho");
			break;
		case 8:
			System.out.print("o mes é agosto");
			break;
		case 9:
			System.out.print("o mes é setembro");
			break;
		case 10:
			System.out.print("o mes é outubro");
			break;
		case 11:
			System.out.print("o mes é novembro");
			break;
		case 12:
			System.out.print("o mes é dezembro");
			break;
		case 13:
			System.out.print("mes invalido");
			break;
		}
	}
}
