package exercicios;
import java.util.Scanner;

public class E14 {
	public static void main(String[]ards) {
		
		int valor1, valor2;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("insira um valor: ");
		valor1 = leia.nextInt();
		System.out.print("insira outro valor: ");
		valor2 = leia.nextInt();
		if(valor1 > valor2) {
			System.out.print("o primeiro valor � maior");
		}else if (valor1 < valor2) {
			System.out.print("o seugndo valor � maior");
		}else {
			System.out.print("eles s�o iguais");
		}
		leia.close();
	}
}
