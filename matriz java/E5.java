package matriz;

import java.util.Scanner;

public class E5 {
	public static void main (String []args) {
		
		int [][] matriz = new int [4][4];
		
		Scanner leia = new Scanner(System.in);
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.print("insira um numero para cololar na matriz ");
				matriz[linha][coluna] = leia.nextInt();
		
			}
		}
		System.out.println("os numeros da diagonal principal são: ");
		System.out.println(matriz[0][0]);
		System.out.println(matriz[1][1]);
		System.out.println(matriz[2][2]);
		System.out.println(matriz[3][3]);
		
		System.out.println("o resto é:");
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				if(linha != coluna) {
					System.out.print(" "+matriz[linha][coluna]+" ");
				}
			}
			System.out.println("");
		}
		leia.close();
	}
}
