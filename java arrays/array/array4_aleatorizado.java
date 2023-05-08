package array;
import java.util.Scanner;
import java.util.Random;

public class array4_aleatorizado {
	public static void main (String[]args) {
		
		int [] array = new int[10];
		int valorref, igual = 0, menor = 0;
		
		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();
		
		for(int contador = 0; contador <= 9; contador++) {
			int numero = aleatorio.nextInt(100);
			array[contador] = numero;
		}
		System.out.print("insira um valor de referencia: ");
		valorref = leia.nextInt();
		
		for(int contador = 0; contador <= 9; contador++) {
			if(array[contador] > valorref) {
				System.out.println(array[contador]+" � maior que o numero de referencia");
			}else if(array[contador] < valorref){
				menor++;
			}else {
				igual++;
			}
		}
		System.out.println("a quantidade de numeros menores � de: "+menor);
		System.out.println("a quantidade de numeros iguais � de: "+igual);

		leia.close();
	}
}