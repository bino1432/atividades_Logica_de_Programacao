package matriz;

import java.util.Random;

public class E3 {
	public static void main(String []args) {
		
		int[][]matriz = new int [5][5];
		int somaL = 0, somaC = 0, somaP = 0, somaS = 0, somatotal = 0;
		
		Random rand = new Random();
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = rand.nextInt(50);
				somatotal = somatotal + matriz[linha][coluna];
			}
		}
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.print(" "+matriz[linha][coluna]+" ");
				}
			System.out.println("");
		}
		for(int linha = 0; linha < matriz.length; linha++){
		somaL = somaL + matriz[3][linha];
		}
		System.out.println("a soma total é: "+somatotal);
		System.out.println("a soma da linha 4 é: "+somaL);
		for(int coluna = 0; coluna < matriz.length; coluna++) {
			somaC = somaC + matriz[coluna][1];
		}
		System.out.println("a soma da coluna 2 é: "+somaC);
		somaP = matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3] + matriz[4][4];
		System.out.println("a soma da diagonal principal é: "+somaP);
		somaS = matriz[0][4] + matriz[1][3] + matriz[2][2] + matriz[3][1] + matriz[4][0];
		System.out.println("a soma da diagonal secundaria é: "+somaS);
	}
}