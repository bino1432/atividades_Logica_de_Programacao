import java.util.Scanner;

public class E3 {
    public static void main(String[] Args) {

        int[] numeros = new int[15];

        Scanner leia = new Scanner(System.in);
        for (int cont = 0; cont < numeros.length; cont++) {
            System.out.print("insira os numeros: ");
            numeros[cont] = leia.nextInt();
        }
        for (int cont = 0; cont < numeros.length; cont++) {
            if (numeros[cont] < 0) {
                numeros[cont] = 0;
            }
        }
        for (int num : numeros) {
            System.out.print(num + ", ");
        }
        leia.close();
    }
}