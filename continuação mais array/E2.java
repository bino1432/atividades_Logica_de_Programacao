import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {

        int[] pares = new int[6];
        int[] impares = new int[6];
        int par = 0, impar = 0, numero = 0;

        Scanner leia = new Scanner(System.in);

        for (int cont = 0; cont < pares.length; cont++) {
            System.out.print("insira os numeros: ");
            numero = leia.nextInt();
            if (numero % 2 == 0) {
                pares[cont] = numero;
                par++;
            } else {
                impares[cont] = numero;
                impar++;
            }
        }
        for (int num : pares) {
            System.out.println("os numeros pares são: " + num);
        }
        for (int num : impares) {
            System.out.println("os numeros impares são: " + num);
        }
        System.out.println("tem " + par + " numeros pares");
        System.out.println("tem " + impar + " numeros impares");
        leia.close();
    }
}