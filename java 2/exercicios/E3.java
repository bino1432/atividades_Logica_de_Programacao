package exercicios;
import java.util.Scanner; 

public class E3 {
	public static void main(String[]ards) {
		
		double gasolina, distancia;
		Scanner leia = new Scanner(System.in);
		System.out.print("qual a distancia percorida? ");
		distancia = leia.nextDouble();
		System.out.print("qual foi o gasto de gasolina? ");
		gasolina = leia.nextDouble();
		System.out.print("a media de gasolina gasta foi de: "+(gasolina / distancia));
		leia.close();
	}
}
