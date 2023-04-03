package exercicios;
import java.util.Scanner;

public class E13 {
	public static void main (String[]ards) {
		
		int valor;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("qual o valor? ");
		valor = leia.nextInt();
		if(valor > 10) {
			System.out.print("valor maior que dez");
		}else {
			System.out.print("valor manor que dez");
		}
		leia.close();
	}
}