package exercicios;
import java.util.Scanner;

public class E12 {
	public static void main(String []ards) {
		
		double valor, valordist = 0, valorimpos = 0;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("qual o valor do carro? ");
		valor = leia.nextDouble();
		valordist = valordist + (valor * 1.28);
		valorimpos = valorimpos + (valor * 1.45);
		System.out.print("o valor do carro é de:"+(valor + valordist + valorimpos));
		leia.close();
	}
}
