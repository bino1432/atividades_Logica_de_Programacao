
import java.util.Random;

public class E2 {
    public static void main(String[] args) {

        int[][] valores = new int[4][4];

        Random rand = new Random();
        for (int linha = 0; linha < valores.length; linha++) {
            for (int coluna = 0; coluna < valores.length; coluna++) {
                valores[linha][coluna] = rand.nextInt(50);
            }
        }
        System.out.println("diagonal principal");
        for (int linha = 0; linha < valores.length; linha++) {
            for (int coluna = 0; coluna < valores.length; coluna++) {
                if (linha == coluna) {
                    System.out.print(" " + valores[linha][coluna] + " ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println("");
        }
        System.out.println("menos diagonal principal");
        for (int linha = 0; linha < valores.length; linha++) {
            for (int coluna = 0; coluna < valores.length; coluna++) {
                if (linha == coluna) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + valores[linha][coluna] + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("diagonal secundaria");
        for (int linha = 0; linha < valores.length; linha++) {
            for (int coluna = 0; coluna < valores.length; coluna++) {
                if (coluna == valores.length - 1 - linha) {
                    System.out.print(" " + valores[linha][coluna] + " ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println("");
        }
        System.out.println("menos diagonal secundaria");
        for (int linha = 0; linha < valores.length; linha++) {
            for (int coluna = 0; coluna < valores.length; coluna++) {
                if (coluna == valores.length - 1 - linha) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + valores[linha][coluna] + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("as duas diagonais");
        for (int linha = 0; linha < valores.length; linha++) {
            for (int coluna = 0; coluna < valores.length; coluna++) {
                if (coluna == valores.length - 1 - linha || linha == coluna) {
                    System.out.print(" " + valores[linha][coluna] + " ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println("");
        }
        System.out.println("manos as duas diagonais");
        for (int linha = 0; linha < valores.length; linha++) {
            for (int coluna = 0; coluna < valores.length; coluna++) {
                if (coluna == valores.length - 1 - linha || linha == coluna) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + valores[linha][coluna] + " ");
                }
            }
            System.out.println("");
        }
    }
}
