package matriz;

import java.util.Random;

public class E1 {
	public static void main(String []args) {
		
		int[][] matriz = new int[5][5];
		int soma = 0, numeros = 0;
		
		Random rand = new Random();
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = rand.nextInt(50);
				if(matriz[linha][coluna] % 2 == 0) {
					soma = soma + matriz[linha][coluna];
					numeros++;
				}
			} 
		}
		soma = soma / numeros;
		System.out.print("a media é: "+soma);
	}
}
