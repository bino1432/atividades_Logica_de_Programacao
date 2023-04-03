package matriz;

import java.util.Scanner;
import java.util.Random;

public class E2 {
	public static void main (String []args) {
	
		int[][]matriz = new int[7][4];
		int menor = 0, li = 0, co = 0;
		
	Scanner leia = new Scanner(System.in);
	Random rand = new Random();
	
	for(int linha = 0; linha < 7; linha++) {
		for(int coluna = 0; coluna < 4; coluna++) {
			matriz[linha][coluna] = rand.nextInt(50);
			} 
		}
	for(int linha = 0; linha < 7; linha++) {
		for(int coluna = 0; coluna < 4; coluna++) {
					if (linha == 0 && coluna == 0) {
					menor = matriz[linha][coluna];
					li = linha;
					co = coluna;
					}
					else if(matriz[linha][coluna] < menor) {
					menor = matriz[linha][coluna]; 
					li = linha;
					co = coluna;
					}
				}
			}
		
	System.out.println("o menor valor: "+menor);
	System.out.println("está na linha: "+li+" e na coluna: "+co);
	for(int linha = 0; linha < 7; linha++) {
		for(int coluna = 0; coluna < 4; coluna++) {
			System.out.print(" "+matriz[linha][coluna]+" ");
			}
		System.out.println("");
	}
	leia.close();
	}
}
