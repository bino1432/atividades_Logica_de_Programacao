import java.util.Scanner;

public class E4 {
    public static void main (String []args){

        int[] array = new int[20];
        int numero;
        Scanner leia = new Scanner(System.in);

        for (int cont = 0; cont < array.length;cont++) {
            System.out.println("insira o numero que deseja adicionar a lista: ");
            array[cont] = leia.nextInt();
        }

        System.out.print("digite um numero: ");
        numero = leia.nextInt();

        System.out.print("a ordem ficou: " + verificacao(array, numero));
        leia.close();
    }
    static int[] verificacao(int[] array, int numero) {
        
        int[] newArray = new int[20];

        for (int cont = 0; cont < array.length; cont++) {
            if(array[cont] == numero) {
                array[cont] = 0;
            }
        }
        for (int cont = 0; cont < array.length; cont++) {
            newArray[cont] = array[cont];
        }
        return newArray;
    }
}
