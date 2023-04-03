package matriz;

import java.util.Scanner;

public class E4 {
public static void main (String []args) {
	
	int [][] matriz = new int [6][6];
	int numero, li = 0, co = 0;
	boolean achou = false;
	
	Scanner leia = new Scanner(System.in);
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.print("insira um numero para cololar na matriz ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		System.out.print("insira o numero que deseja procurar");
		numero = leia.nextInt();
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				if(numero == matriz[linha][coluna]) {
					achou = true;
					li = linha;
					co = coluna;
				}
			}
		}
		if(achou == true) {
			System.out.print("o numero está na linha: "+li+" e na coluna: "+co);
		}else {
			System.out.print("não encontrado");
		}
		leia.close();
	}
}