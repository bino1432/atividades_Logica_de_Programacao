package exercicios;
import java.util.Scanner;

public class E5 {
	public static void main (String[]ards) {
		
		String nome;
		Double nota, media = 0;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("qual o seu nome? ");
		nome = leia.next();
		for (int contador = 1;contador <= 3; contador++) {
			System.out.print("qual a sua nota? ");
			nota = leia.nextDouble();
			media = media + nota;
		}
		System.out.print("o seu nome é: "+nome);
		System.out.print("a sua media foi de: "+media);
		leia.close();
	}
}