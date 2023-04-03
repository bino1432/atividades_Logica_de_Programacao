package kunfu;
import java.util.Scanner;

public class E16 {
	public static void main (String[]ards) {
		
		double nota1, nota2, nota3, media = 0.0;
		String nome;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("qual o seu nome? ");
		nome = leia.next();
		System.out.print("qual a primeira nota? ");
		nota1 = leia.nextDouble();
		System.out.print("qual a segunda nota? ");
		nota2 = leia.nextDouble();
		System.out.print("qual a terceira nota?");
		nota3 = leia.nextDouble();
		media = (nota1 + nota2 + nota3) / 3;
		if(media >= 7 && media <= 10) {
			System.out.print("aluno: "+nome);
			System.out.print("aluno aprovado");
		}else if(media >= 5.1 && media <= 6.9) {
			System.out.print("aluno: "+nome);
			System.out.print("aluno em recuperação");
		}else {
			System.out.println("aluno: "+nome);
			System.out.println("aluno reprovado");
		}
		leia.close();
	}
}