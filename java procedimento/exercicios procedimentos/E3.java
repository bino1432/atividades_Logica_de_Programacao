package exercicios;

import java.util.Scanner;

public class E3 {
	public static void main (String[]args) {
		
		int valor;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("insira 1 para domingo, 2 para segudna, etc...");
		valor = leia.nextInt();
		switch (valor) {
		case 1: 
			domingo();
			break;
		case 2: 
			segunda();
			break;
		case 3: 
			terca();
			break;
		case 4: 
			quarta();
			break;
		case 5: 
			quinta();
			break;
		case 6: 
			sexta();
			break;
		case 7: 
			sabado();
			break;
		}
		
		leia.close();
	}
	static void segunda() {
		System.out.print("Monday, Maandag");
	}
	static void terca() {
		System.out.print("Tuesday, Dinsdag");
	}
	static void quarta() {
		System.out.print("Wednesday, Woensdag");
	}
	static void quinta() {
		System.out.print("Thursday, Donderdag");
	}
	static void sexta() {
		System.out.print("friday, Vrydag");
	}
	static void sabado() {
		System.out.print("Saturday, Saterdag");
	}
	static void domingo() {
		System.out.print("sunday, Sondag");
	}

}
