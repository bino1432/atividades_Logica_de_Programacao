package exercicios;
import java.util.Scanner;

public class E8 {
	public static void main(String[]ards) {
		
		Double dolar, cotacao;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("qual a cotação do dolar? ");
		cotacao = leia.nextDouble();
		System.out.print("qual o valor em dolar que você deseja converter? ");
		dolar = leia.nextDouble();
		System.out.print("o valor em reias é: "+(dolar * cotacao));
		leia.close();
	}
}
