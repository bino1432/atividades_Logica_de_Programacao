package exercicios;
import java.util.Scanner;

public class E15 {
	public static void main (String[]ards) {
		
		int valor;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("qual o valor? ");
		valor = leia.nextInt();
		if (valor >= 150 && valor <= 200) {
			System.out.print("o valor est� entre 150 e 200");
		}else {
			System.out.print("o valor n�o est� entre 150 e 200");
		}
		leia.close();
	}
}
