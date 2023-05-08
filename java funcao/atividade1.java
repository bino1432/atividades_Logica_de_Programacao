import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {

        int valor1;
        int valor2;
        int operacao;

        Scanner leia = new Scanner(System.in);

        System.out.print("insira o primeiro numero: ");
        valor1 = leia.nextInt();
        System.out.print("insira o segundo numero: ");
        valor2 = leia.nextInt();

        System.out.println("1) adição");
        System.out.println("2) subtração");
        System.out.println("3) divisão");
        System.out.println("4) multiplcação");
        System.out.println("================");
        System.out.println("Escolha uma operação");
        operacao = leia.nextInt();

        switch (operacao) {

            case 1:
                System.out.print("a resposta é:" + soma(valor1, valor2));
                break;
            case 2:
            System.out.print("a resposta é:" + subtracao(valor1, valor2));
                break;
            case 3:
            System.out.print("a resposta é:" + divisao(valor1, valor2));
                break;
            case 4:
            System.out.print("a resposta é:" + multiplicacao(valor1, valor2));
                break;
            default:
                System.out.print("operação invalida.");
        }
        leia.close();
    }

    static int soma(int valor1, int valor2) {
        int resposta;
        resposta = valor1 + valor2;
        return (resposta);
    }

    static int subtracao(int valor1, int valor2) {
        int resposta;
        resposta = valor1 - valor2;
        return (resposta);
    }

    static int divisao(int valor1, int valor2) {
        int resposta;
        resposta = valor1 / valor2;
        return (resposta);
    }

    static int multiplicacao(int valor1, int valor2) {
        int resposta;
        resposta = valor1 * valor2;
        return (resposta);
    }
}