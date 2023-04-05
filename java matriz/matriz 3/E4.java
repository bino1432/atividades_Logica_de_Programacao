import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {

        int[][] valores = new int[4][4];

        Scanner leia = new Scanner(System.in);

        for (int linha = 0; linha < valores.length; linha++) {
            for (int coluna = 0; coluna < valores.length; coluna++) {
                System.out.print("insira um valor para colocar na matriz: ");
                valores[linha][coluna] = leia.nextInt();
            }
        }
        for (int linha = 0; linha < valores.length; linha++) {
            for (int coluna = 0; coluna < valores.length; coluna++) {
                if (valores[linha][coluna] < 0) {
                    System.out.print(" 0 ");
                } else {
                    System.out.print(" " + valores[linha][coluna] + " ");
                }
            }
            System.out.println("");
        }
        leia.close();
    }
}
