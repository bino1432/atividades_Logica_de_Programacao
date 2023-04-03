package matriz;

import java.util.Scanner;

public class E2 {
	public static void main (String[]args) {
		
		int [][] matriz = new int [5][5];
		int numero;
		boolean igual = false;
		
		Scanner leia = new Scanner(System.in);
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.print("insira um numero para colocar na matriz");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		System.out.print("fale um numero");
		numero = leia.nextInt();
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				if (numero == matriz [linha][coluna]) {
				igual = true;
				}
			}
		}
		if(igual == true) {
			System.out.print("igual");
		}else {
			System.out.print("não igual");
		}
		leia.close();
	}
}
