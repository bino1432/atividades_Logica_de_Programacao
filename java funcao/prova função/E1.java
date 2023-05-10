import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {

        int quantidade = 0;
        int numero;
        Scanner leia = new Scanner(System.in);

        System.out.print("insira a quantidade de numeros que haverá: ");
        quantidade = leia.nextInt();

        int[] array = new int[quantidade];

        for (int cont = 0; cont < array.length;) {
            System.out.println("insira o numero que deseja adicionar a lista (1 a 5): ");
            numero = leia.nextInt();
            if (numero >= 1 && numero <= 5) {
                array[cont] = numero;
                cont++;
            } else {
                System.out.println("numero invalido!");
            }
        }

        System.out.print("O numero que se repete mais vezes é o: " + verificacao(array));
        leia.close();
    }

    static int verificacao(int[] array) {

        int quantidade1 = 0;
        int quantidade2 = 0;
        int quantidade3 = 0;
        int quantidade4 = 0;
        int quantidade5 = 0;
        int maior = 0;
        int maisVezes;

        for (int cont = 0; cont < array.length; cont++) {
            if (array[cont] == 1) {
                quantidade1 += 1;
            } else if (array[cont] == 2) {
                quantidade2 += 1;
            } else if (array[cont] == 3) {
                quantidade3 += 1;
            } else if (array[cont] == 4) {
                quantidade4 += 1;
            } else if (array[cont] == 5) {
                quantidade5 += 1;
            }
        }
        maior = quantidade1;
        maisVezes = 1;
        if (maior < quantidade2) {
            maior = quantidade2;
            maisVezes = 2;
        } else if (maior < quantidade3) {
            maior = quantidade3;
            maisVezes = 3;
        } else if (maior < quantidade4) {
            maior = quantidade4;
            maisVezes = 4;
        } else if (maior < quantidade5) {
            maior = quantidade5;
            maisVezes = 5;
        }

        return maisVezes;
    }
}