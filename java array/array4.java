package array;
import java.util.Arrays;
import java.util.Scanner;

public class array4 {
	public static void main (String[]args) {
		
		int [] array = new int[10];
		int valor, valorref, igual = 0, menor = 0;
		
		Scanner leia = new Scanner(System.in);
		for(int contador = 0; contador <= 9; contador++) {
			System.out.print("insira um valor");
			valor = leia.nextInt();
			array[contador] = valor;
		}
		System.out.print("insira um valor de referencia: ");
		valorref = leia.nextInt();
		
		for(int contador = 0; contador <= 9; contador++) {
			if(array[contador] > valorref) {
				System.out.println(array[contador]+" é maior que o numero de referencia");
			}else if(array[contador] < valorref){
				menor++;
			}else {
				igual++;
			}
		}
		System.out.println("a quantidade de numeros menores é de: "+menor);
		System.out.println("a quantidade de numeros iguais é de: "+igual);

		leia.close();
	}
}
