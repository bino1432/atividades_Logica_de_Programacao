package matriz4;

import java.util.Scanner;

public class E1 {

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
      System.out.printf("*"); linha('=', (2*n)+1); System.out.printf("*\n");
      for (linha=1; linha<=n; linha++) {
        System.out.printf("* ");
        for (coluna=1; coluna<=(n-linha); coluna++) {
          System.out.printf("  ");
        }
        for (coluna=1; coluna<=linha; coluna++) {
          System.out.printf("%d ", linha);
        }
        System.out.printf("*\n");
      }
      System.out.printf("*"); linha('*', (2*n)+1); System.out.printf("*\n");
      for (linha=n; linha>=1; linha--) {
        System.out.printf("* ");
        for (coluna=1; coluna<=linha; coluna++) {
          System.out.printf("%d ", linha);
        }
        for (coluna=1; coluna<=(n-linha); coluna++) {
          System.out.printf("  ");
        }
        System.out.printf("*\n");
      }

      System.out.printf("*"); linha('=', (2*n)+1); System.out.printf("*");
    }
}