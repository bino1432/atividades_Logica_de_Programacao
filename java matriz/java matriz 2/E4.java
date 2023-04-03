package matriz;

import java.util.Scanner;

public class E4 {
	public static void main (String[]args) {
		
		int [][]matriz = new int[5][5];
		int [][]cubo = new int[5][5];
		
		Scanner leia = new Scanner(System.in);
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.print("insira um numero");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		for(int linha = 0; linha < matriz.length;linha++) {
			for(int coluna = 0 ; coluna < matriz.length; coluna++) {
				cubo[linha][coluna] = matriz[linha][coluna] * matriz[linha][coluna] * matriz[linha][coluna];
			}
		}
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 4; coluna++) {
				System.out.print(" "+cubo[linha][coluna]+" ");
				}
			System.out.println("");
		}
		leia.close();
	}
}
