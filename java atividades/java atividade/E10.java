package exercicios;
import java.util.Scanner; 

public class E10 {
	public static void main (String[]ards) {
		
		double valor;
		Scanner leia = new Scanner(System.in);
		System.out.print("qual o valor da compra? ");
		valor = leia.nextDouble();
		System.out.print("cada prestação vai ser de: "+(valor / 5));
		leia.close();
	}
}