package teste;
import java.util.Scanner;

public class E5 {
	public static void main (String[] ards) {
		
		int senha = 4693, tentativa = 0;
		
		Scanner leia = new Scanner(System.in);
		while(tentativa != senha) {
			System.out.print("qual a senha? ");
			tentativa = leia.nextInt();			
			if (senha == tentativa) {
				System.out.print("senha correta");
			}else {
				System.out.println("senha incorreta, tente novamente");
			}
		}
	 leia.close();
	}
}