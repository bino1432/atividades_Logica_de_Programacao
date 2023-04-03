import java.util.Arrays;
import java.util.Scanner;

public class E1 {
	public static void main(String[]args) {
		
		int [] numeros = new int [12];
		int [] impar = new int[12];
		int [] par = new int [12];
		
		Scanner leia = new Scanner(System.in);
		for (int cont = 1; cont < numeros.length; cont++){
			System.out.print("insira um digito");
			numeros[cont] = leia.nextInt();
		}
		for(int contador = 1;contador < numeros.length; contador++) {
			if (numeros[contador] % 2 == 0) {
				par [contador] = numeros[contador];
			}else {
				impar [contador] = numeros[contador];
		        }
			}
            Arrays.sort(par);
            Arrays.sort(impar);
		        for(int contadorA = 0; contadorA < impar.length / 2; contadorA++) {
		            int j = impar[contadorA];
		            impar[contadorA] = impar[impar.length - contadorA - 1];
		            impar[impar.length - contadorA - 1] = j;
		}
        for (int num : par){
		System.out.println("numeros pares: "+num);
        }
        for (int num : impar){
		System.out.println("numeros impares: "+num);
        }
		leia.close();
	}
}