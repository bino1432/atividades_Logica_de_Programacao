import java.util.Scanner;

public class E9 {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

      int n;

      System.out.printf("Informe o tamanho da figura: ");
      n = ler.nextInt();

      System.out.printf("\n");

      figura(n);

      System.out.printf("\n");
      ler.close();
    }

    public static void linha(char c, int n) {
      int i;
      for (i=1; i<=n; i++) {
        System.out.printf("%c", c);
      }
    }

    public static void figura(int n) {
      int i, j;
      System.out.printf("*"); linha('=', (2*n)+1); System.out.printf("*\n");
      for (i=1; i<=n; i++) {
        System.out.printf("* ");
        for (j=1; j<=(n-i); j++) {
          System.out.printf("  ");
        }
        for (j=1; j<=i; j++) {
          System.out.printf("%d ", i);
        }
        System.out.printf("*\n");
      }
      System.out.printf("*"); linha('=', (2*n)+1); System.out.printf("*\n");
      for (i=n; i>=1; i--) {
        System.out.printf("* ");
        for (j=1; j<=(n-i); j++) {
          System.out.printf("  ");
        }
        for (j=1; j<=i; j++) {
          System.out.printf("%d ", i);
        }
        System.out.printf("*\n");
      }
      System.out.printf("*"); linha('=', (2*n)+1); System.out.printf("*");
    }

}
