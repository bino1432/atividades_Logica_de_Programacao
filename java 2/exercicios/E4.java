package exercicios;
import java.util.Scanner;

public class E4 {
	public static void main(String[]ards) {
		
		String nome;
		double salario;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("qual o seu nome? ");
		nome = leia.next();
		System.out.print("qual o seu salario? ");
		salario = leia.nextDouble();
		System.out.print("o seu nome �: "+nome);
		System.out.print("o seu salario � de: "+salario);
		System.out.print("o seu salario com comiss�o � de: "+(salario *1.15));
		leia.close();	
		}
}
