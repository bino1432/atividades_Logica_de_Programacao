package teste;
import java.util.Scanner;

public class E1 {
	public static void main (String[] args) {
		
		int golA, golB;
		
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		System.out.print("quantos gols o time A fez? ");
		golA = leia.nextInt();
		System.out.print("quantos gols o time B fez? ");
		golB = leia2.nextInt();
		
		if (golA > golB) {
			System.out.print("time A ganhou");
		}else if(golA < golB) {
			System.out.print("time B ganhou");
		}else if(golA == golB) {
			System.out.print("empate");
		}
		leia.close();
		leia2.close();
	}
}