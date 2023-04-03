package teste;
import java.util.Scanner;

public class E2 {
	public static void main (String[]args) {
		
		int ano, nasc, idade = 0;
		
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		System.out.print("qual o ano atual? ");
		ano = leia.nextInt();
		System.out.print("qual o seu ano de nascimento? ");
		nasc = leia2.nextInt();
		idade = ano - nasc;
		if (idade >= 18) {
			System.out.print("voce pode votar");
		}else if (idade <= 18) {
			System.out.print("voce nao pode votar");
		}
		leia.close();
		leia2.close();
	}
}