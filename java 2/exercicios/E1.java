package exercicios;
import java.util.Scanner;
public class E1 {
	public static void main(String[]ards) {
		
		int valor1, valor2;
		 Scanner leia = new Scanner(System.in);
		 System.out.print("qual o primeiro valor? ");
		 valor1 = leia.nextInt();
		 System.out.print("qual o segundo valor? ");
		 valor2 = leia.nextInt();
		 System.out.print("a soma é de "+(valor1 + valor2));
		 leia.close();
	}
}
