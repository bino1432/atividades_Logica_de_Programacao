package exercicios;

import java.util.Scanner;

public class E2 {
	
	static int dia = 24;
	static int mes = 4;
	static int ano = 2023;
	static int dias;
		
	public static void main (String []args) {
		
		Scanner leia = new Scanner (System.in);
		System.out.print("insira a quantidade de dias: ");
		dias = leia.nextInt();
		
		diacont();
		anocont();
		
		System.out.print("o dia é: "+dia+" / "+mes+" / "+ano);
		
	}
	static void diacont() {
		if (dias > 30)
			mes = mes + dias / 30;
			dia = dia + dias % 30;
	} 
	static void anocont() { 
		if (mes > 12) {
			ano = ano + mes / 12;
			mes = mes + ano % 12;
		}
	}
}
