import java.util.Scanner;

public class E10 {

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
      System.out.printf("\n");
    }

    public static void figura(int n) {
      int i, j;
      for (i=1; i<=n; i++) {
        for (j=1; j<=(n-i); j++) {
          System.out.printf("  ");
        }
        for (j=1; j<=i; j++) {
          System.out.printf("%d ", i);
        }
        System.out.printf("* ");
        for (j=1; j<=i; j++) {
          System.out.printf("%d ", i);
        }
        for (j=1; j<=(n-i); j++) {
          System.out.printf("  ");
        }
        System.out.printf("\n");
      }
      linha('*', (4*n)+1);
      for (i=n; i>=1; i--) {
        for (j=1; j<=(n-i); j++) {
          System.out.printf("  ");
        }
        for (j=1; j<=i; j++) {
          System.out.printf("%d ", i);
        }
        System.out.printf("* ");
        for (j=1; j<=i; j++) {
          System.out.printf("%d ", i);
        }
        for (j=1; j<=(n-i); j++) {
          System.out.printf("  ");
        }
        System.out.printf("\n");
      }
    }

}
