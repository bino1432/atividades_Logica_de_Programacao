import java.util.Random;

public class E5 {
    public static void main(String[] args) {

        int[][] valor = new int[5][5];

        Random rand = new Random();

        for (int linha = 0; linha < valor.length; linha++) {
            for (int coluna = 0; coluna < valor.length; coluna++) {
                valor[linha][coluna] = rand.nextInt(4);
            }
        }
        for (int linha = 0; linha < valor.length; linha++) {
            for (int coluna = 0; coluna < valor.length; coluna++) {
                if (linha == coluna) {
                    System.out.print(" " + valor[linha][coluna] + " ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println("");
        }
    }
}