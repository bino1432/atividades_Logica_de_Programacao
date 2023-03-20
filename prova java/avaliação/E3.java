package avaliação;

import java.util.Scanner;

public class E3 {
	public static void main(String[] args) {

		int valor;

		Scanner leia = new Scanner(System.in);
		System.out.print("insira um valor: ");
		valor = leia.nextInt();
		if (valor >= 80) {
			System.out.print("Numero maior que 80");
		} else if (valor <= 25) {
			System.out.print("Numero menor que 25");
		} else if (valor == 40) {
			System.out.print("Numero igual a 40");
		}
		leia.close();
	}
}