import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {

        int[][] valores = new int[6][6];
        int valor, li = 0, co = 0;
        boolean achou = false;

        Scanner leia = new Scanner(System.in);

        for (int linha = 0; linha < valores.length; linha++) {
            for (int coluna = 0; coluna < valores.length; coluna++) {
                System.out.print("insira um valor para colocar na matriz: ");
                valores[linha][coluna] = leia.nextInt();
            }
        }
        System.out.print("escreva um valor que deseja verificar: ");
        valor = leia.nextInt();
        for (int linha = 0; linha < valores.length; linha++) {
            for (int coluna = 0; coluna < valores.length; coluna++) {
                if (valor == valores[linha][coluna]) {
                    achou = true;
                    li = linha;
                    co = coluna;
                }
            }
        }
        if (achou == true) {
            System.out.print("achou o numero, está na linha: " + li + " e na coluna: " + co);
        } else {
            System.out.print("não encontrado");
        }
        leia.close();
    }
}