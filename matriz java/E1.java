package matriz;

import java.util.Scanner;

public class E1 {
public static void main (String[]args) {
	
	int [][] matriz = new int [3][3];
	int [][] matrizA = new int [3][3];
	int [][] matrizB = new int [3][3];
	int [][] matrizSoma = new int [3][3];
	int [][] matrizSub= new int [3][3];
	int [][] matrizMult = new int [3][3];
	int escolha = 5;
		
	Scanner leia = new Scanner(System.in);	
	for(int linha = 0; linha < matrizA.length; linha++){
			for(int coluna = 0; coluna < matrizA.length; coluna++) {
				System.out.print("insira um numero na matriz A");
				matrizA[linha][coluna] = leia.nextInt();
			}
		}
	for(int linha = 0; linha < matrizB.length; linha++){
		for(int coluna = 0; coluna < matrizA.length; coluna++) {
			System.out.print("insira um numero na matriz B");
			matrizB[linha][coluna] = leia.nextInt();
			}
		}
	while(escolha != 0) {
	System.out.println("(1) – Somar");
	System.out.println("(2) – Subtrair");
	System.out.println("(3) – Multiplicar");
	System.out.println("(0) - Sair");
	System.out.println("escolha a operação: ");
	escolha = leia.nextInt();
	
	if(escolha == 1) {
		for(int linha = 0; linha < matrizB.length; linha++){
			for(int coluna = 0; coluna < matrizA.length; coluna++) {
				matrizSoma[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
				matriz[linha][coluna] = matrizSoma[linha][coluna];
				}
			}
		}else if(escolha == 2) {
			for(int linha = 0; linha < matrizB.length; linha++){
				for(int coluna = 0; coluna < matrizA.length; coluna++) {
					matrizSub[linha][coluna] = matrizA[linha][coluna] - matrizB[linha][coluna];
					matriz[linha][coluna] = matrizSub[linha][coluna];
				}
			}
		}else if(escolha == 3) {
			for(int linha = 0; linha < matrizB.length; linha++){
				for(int coluna = 0; coluna < matrizA.length; coluna++) {
					matrizMult[linha][coluna] = matrizA[linha][coluna] * matrizB[linha][coluna];
					matriz[linha][coluna] = matrizMult[linha][coluna];
					}
				}
			}
		}
	for(int linha = 0; linha < matrizB.length; linha++){
		for(int coluna = 0; coluna < matrizA.length; coluna++) {
			System.out.print(" "+matriz[linha][coluna]+" ");
			}
		System.out.println("");
		}
	leia.close();
	}
}