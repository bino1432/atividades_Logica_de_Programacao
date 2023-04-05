import java.util.Random;

public class E6 {
    public static void main(String[] args) {

        int[][] valor = new int[5][5];

        Random rand = new Random();

        for (int linha = 0; linha < valor.length; linha++) {
            for (int coluna = 0; coluna < valor.length; coluna++) {
                valor[linha][coluna] = rand.nextInt(50);
            }
        }
        for (int linha = 0; linha < valor.length; linha++) {
            for (int coluna = 0; coluna < valor.length; coluna++) {
                if ((linha == 0 || linha == valor.length - 1) && (coluna == 0 || coluna == valor.length - 1)) {
                    System.out.print(" " + valor[linha][coluna] + " ");
                } else if (linha == (valor.length - 1) / 2 && coluna == (valor.length - 1) / 2) {
                    System.out.print(" " + valor[linha][coluna] + " ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println("");
        }
    }
}
