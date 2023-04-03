package exercicios;
import java.util.Scanner;

public class E11 {
	public static void main(String[]ards) {
		
		double custo, acre;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("qual o preço de custo? ");
		custo = leia.nextDouble();
		System.out.print("quanto de acréscimo voce deseja adicionar? ");
		acre = leia.nextDouble();
		System.out.print("o valor do priduto será de: "+(custo * acre));
		leia.close();
	}
}