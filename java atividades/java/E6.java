package teste;
import java.util.Scanner;


public class teste {
	public static void main (String[] args) {
		
			int valor=0,valor2=2;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.print("digite um valor");
			valor = leia.nextInt();
			System.out.println("o valor é: "+valor);
			
			if(valor==2) {
				System.out.println("valor igual a dois");
			}else if(valor !=2) {
				System.out.println("valor diferente de dois");
			}
			leia.close();
	}
}