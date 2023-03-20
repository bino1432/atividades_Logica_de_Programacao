package array;
import java.util.Scanner;

public class array2 {
	public static void main(String []args) {
		
		String[] nome = { "jão", "pedro", "bernardo", "julio", "laura"};
		int[] telefone = {984215, 07655423, 876135, 8761235, 875125};
		int chave;
		
		for(int contador = 0; contador <= 4; contador++) {
			System.out.println("["+contador+"] "+nome[contador]);
		}
		
		Scanner leia = new Scanner(System.in);
		System.out.println("insira o numero do nome da pessoa: ");
		chave = leia.nextInt();
		System.out.print("o numero da pessoa é: "+telefone[chave]);
		leia.close();
	}
}
