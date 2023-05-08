import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {

        int quantidade = 0;

        System.out.print("o numero digitado tem " + verificacao(quantidade) + " digitos");
    }

    static int verificacao(int quantidade) {
        String numero;

        Scanner leia = new Scanner(System.in);

        System.out.print("insira um numero: ");
        numero = leia.next();
        for (int cont = 0; cont < numero.length(); cont++) {
            quantidade++;
        }
        leia.close();
        return quantidade;
    }
}