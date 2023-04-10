package matriz4;

import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);

      int numero;

      System.out.printf("Informe o tamanho da figura: ");
      numero = leia.nextInt();

      System.out.printf("\n");

      figura(numero);

      System.out.printf("\n");
      leia.close();
    }

    public static void linha(char c, int n) {
      int linha;
      for (linha=1; linha<=n; linha++) {
        System.out.printf("%c", c);
      }
    }

    public static void figura(int n) {
      int linha, coluna;
      for (linha=1; linha<=n; linha=linha+2) {
        for (coluna=1; coluna<=((n-linha) / 2); coluna++) {
          System.out.printf("  ");
        }
        for (coluna=1; coluna<=linha; coluna++) {
          System.out.printf("%d ", linha);
        }
        System.out.printf("\n");
      }
      linha('=', (2*n)-1);
    }

}