package avaliação;

import java.util.Scanner;

public class E5 {
	public static void main(String[] args) {

		int contador = 1, idade, valor, media = 0, regular = 0, contadorOtimo = 1, contadorBom = 0;

		Scanner leia = new Scanner(System.in);
		while (contador <= 15) {
			System.out.println("qual a sua idade? ");
			idade = leia.nextInt();
			System.out.println("qual a sua nota sobre o filme? (3 para ótimo, 2 para bom e 1 para regular)");
			valor = leia.nextInt();
			contador++;
			if (valor == 3) {
				media = media + idade;
				contadorOtimo++;
			} else if (valor == 2) {
				contadorBom++;
			} else if (valor == 1) {
				regular++;
			}
		}
		System.out.println("a media de idades que acharam o filme ótimo é de: " + (media / contadorOtimo));
		System.out.println(regular + " pessoas acharam regular");
		System.out.println("a porcentagem de pessoas que acharam o o filme bom foi de: " + (contadorBom * 6.66) + "%");
		leia.close();
	}
}