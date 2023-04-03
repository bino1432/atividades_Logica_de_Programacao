package teste;
import java.util.Scanner;

public class E3 {
	public static void main (String[] args) {
	
		int genero;
		String nome="";
		
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		System.out.print("qual o seu genero?(1 para M e 2 para F) ");
		genero = leia.nextInt();
		System.out.print("qual o seu nome? ");
		nome = leia2.next();
		if(genero == 1) {
			System.out.print("Exelentissimo Sr "+nome);
		}else if(genero == 2) {
			System.out.print("exelentissa Sra "+nome);
		}else {
			System.out.print("genero invalido");
		}
		leia.close();
		leia2.close();
	}
}