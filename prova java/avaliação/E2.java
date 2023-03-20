package avaliação;

import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {

		int M = 0, F = 0, contador = 1, genero;
		String nome;

		Scanner leia = new Scanner(System.in);
		while (contador <= 56) {
			System.out.println("digite o seu nome: ");
			nome = leia.next();
			System.out.println("qual o seu genero? (digite 1 para masculino e 2 para feminino");
			genero = leia.nextInt();
			contador++;
			if (genero == 1) {
				System.out.println("o seu nome é: " + nome);
				System.out.println("e o seu genero é o masculino");
				M++;
			} else if (genero == 2) {
				System.out.println("o seu nome é: " + nome);
				System.out.println("e o seu genero é o feminino");
				F++;
			}
		}
		System.out.println("tem " + M + " Homens e " + F + " Mulheres");
		leia.close();
	}
}