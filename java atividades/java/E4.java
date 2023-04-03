package teste;
import java.util.Scanner;

public class E4 {
	public static void main(String[] ards) {
		
		int pedido, estoque, att;
		
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		System.out.println("quantos itens foram pedidos? ");
		pedido = leia.nextInt();
		System.out.println("quantos itens tem no estoque? ");
		estoque = leia2.nextInt();
		if (estoque >= pedido) {
			att = estoque - pedido;
			System.out.println("o estoque atualizado é de "+att);
		}else if (estoque < pedido) {
			System.out.println("quantidade de itens insuficiente");
		}
		leia.close();
		leia2.close();
	}
}