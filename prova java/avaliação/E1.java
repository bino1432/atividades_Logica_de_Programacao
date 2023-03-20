package avaliação;

import java.util.Scanner;

public class E1 {
	public static void main(String[] args) {

		int valor, contador = 1, numeroentre = 0;

		Scanner leia = new Scanner(System.in);
		while (contador <= 80) {
			System.out.print("insira um numero: ");
			valor = leia.nextInt();
			contador++;
			if (valor >= 10 && valor <= 150) {
				numeroentre++;
			}
		}
		System.out.print("tem " + numeroentre + " numeros entre 10 e 150");
		leia.close();
	}
}