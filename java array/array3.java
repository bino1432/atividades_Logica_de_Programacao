package array;
import java.util.Arrays;
import java.util.Scanner;

public class array3 {
	public static void main (String []args) {
		
		int[] array = new int[10];
		int valor;
		
		Scanner leia = new Scanner(System.in);
		for(int contador = 0; contador <= 9; contador++) {
			System.out.print("insira um valor: ");
			valor = leia.nextInt();
			array[contador] = valor;
		}
		Arrays.sort(array);
		for(int num : array) {
			System.out.print(num + " ");
		}
	}
}
