package exercicios;
import java.util.Scanner;

public class E7 {
	public static void main(String[]ards) {
		
		int temp;
		Scanner leia = new Scanner(System.in);
		System.out.print("qual a temperatura? ");
		temp = leia.nextInt();
		System.out.print("a temperatura em farenheit é de: "+((9 * temp + 160) / 5));
		leia.close();
	}
}