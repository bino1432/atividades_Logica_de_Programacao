package avaliação;

import java.util.Scanner;

public class E4 {
	public static void main(String[] args) {

		int valor, pagamento, vista = 0, prazo = 0, total = 0, contador = 1;

		Scanner leia = new Scanner(System.in);
		while (contador <= 15) {
			System.out.println("qual o valor da sua compra? ");
			valor = leia.nextInt();
			System.out.println("insira 1 para compras a vista e 2 para compras a prazo: ");
			pagamento = leia.nextInt();
			contador++;
			if (pagamento == 1) {
				vista = vista + valor;
				total = total + valor;
			} else if (pagamento == 2) {
				prazo = prazo + valor;
				total = total + valor;
				System.out.println("o valor da primeira parcela será de: " + (valor / 3));
			}
		}
		System.out.println("o valor total das compras à vista é de: " + vista);
		System.out.println("o valor total das compras a prazo é de: " + prazo);
		System.out.println("o valor total das compras é de: " + total);
		leia.close();
	}
}