package matriz;

import java.util.Scanner; 

public class E3 {
	public static void main (String []args) {
		
		int[][] matriz = new int [4][4];
		
		Scanner leia = new Scanner(System.in);
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.print("insira um numero para cololar na matriz ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				if(matriz[linha][coluna] < 0) {
					matriz[linha][coluna] = 0;
				}
			}
		}
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
					System.out.print(" "+matriz[linha][coluna]+" ");
			}
			System.out.println("");
		}
		leia.close();
	}
}
