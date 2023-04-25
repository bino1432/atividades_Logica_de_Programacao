package exercicios;

import java.util.Scanner;

public class E1 {
	
	static double fahrenheit;
	static double Celsius;
	
	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);
		fahrenheit = leia.nextDouble();
		
		convercao();
		
		System.out.print("a temperatura convertida é de "+Celsius);
		
		leia.close();
	}
	static void convercao() {
		Celsius = 5 / 9 * ( fahrenheit -32 ); 
	}
}
