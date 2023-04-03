package exercicios;
import java.util.Scanner;

public class E9 {
	public static void main (String[]ards) { 
		
		double valor;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("qual o valor? ");
		valor = leia.nextDouble();
		System.out.print("o rendimento após um mês será de: "+(valor * 1.70));
		leia.close();
	}
}