package array;
import java.util.Scanner;

public class pedra_papel_tesoura {
	public static void main (String []args) {
		
		int contadorPontos1 = 0, contadorPontos2 = 0, jogada1, jogada2;
		
		Scanner leia = new Scanner(System.in);
		while (contadorPontos1 < 2 | contadorPontos2 <  2) {
			System.out.println("qual a jogada do jogador 1? (1 papel, 2 tesoura, 3 pedra)");
			jogada1 = leia.nextInt();
			System.out.println("qual a jogada do jogador 2? (1 papel, 2 tesoura, 3 pedra)");
			jogada2 = leia.nextInt();
			if(jogada1 == 1 && jogada2 ==3) {
				contadorPontos1++;
				System.out.println("o jogador 1 ganhou");
			}else if(jogada1 == 2 && jogada2 == 1) {
				contadorPontos1++;
				System.out.println("o jogador 1 ganhou");
			}else if(jogada1 == 3 && jogada2 == 2) {
				contadorPontos1++;
				System.out.println("o jogador 1 ganhou");
			}else if(jogada2 == 1 && jogada1 ==3) {
				contadorPontos2++;
				System.out.println("o jogador 2 ganhou");
			}else if(jogada2 == 2 && jogada1 == 1) {
				contadorPontos2++;
				System.out.println("o jogador 2 ganhou");
			}else if(jogada2 == 3 && jogada1 == 2) {
				contadorPontos2++;
				System.out.println("o jogador 2 ganhou");
			}else {
				System.out.println("ninguem ganhou");
			}
			
			if(contadorPontos1 >= 2 || contadorPontos2 >= 2) {
				break;
			}
		}
		
		if(contadorPontos1 == 2) {
			System.out.println("o jogador 1 ganhou a partida");
		}else if(contadorPontos2 == 2) {
			System.out.println("o jogador 1 ganhou a partida");
		}
		leia.close();
	}
}
