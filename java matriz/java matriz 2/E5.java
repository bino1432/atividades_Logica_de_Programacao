package matriz;

import java.util.Scanner;

public class E5 {
	public static void main (String[]args) {
	int [][] matriz = new int [3][4];
	
	Scanner leia = new Scanner(System.in);
	
	for(int linha = 0; linha < 3; linha++) {
		for(int coluna = 0; coluna < 4; coluna++) {
			System.out.print("insira um numero");
			matriz[linha][coluna] = leia.nextInt();	
			}
		}
	for(int linha = 0; linha < 3; linha++) {
		for(int coluna = 0; coluna < 4; coluna++) {
			System.out.print(" "+matriz[linha][coluna]+" ");
			}
		System.out.println("");
		}
	System.out.println("o numero do canto superior esquedo é: "+matriz[0][0]);
	System.out.println("o numerdo canto inferior esquerdo é: "+matriz[2][0]);
	}
}
