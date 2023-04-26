package atividade;

import java.util.Scanner;

public class teste {
	public static void main (String[]args) {
		
		String nome = "";
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("qual o seu nome completo: ");
		nome = leia.nextLine();
		
		System.out.println("O sobrenome é: "+ sobrenome(nome));
		
		leia.close();
	}
	static String sobrenome(String nome) {
		return nome.split(" ")[nome.split(" ").length - 1];
	}
}
