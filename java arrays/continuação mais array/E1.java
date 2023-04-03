import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {

        int[] vendas = new int[10];
        double[] comissao = new double[10];
        String[] nomes = new String[10];
        double total = 0, maior = 0, menor = 0, porcentagem = 0;
        int quemmenor = 0, quemmaior = 0;

        Scanner leia = new Scanner(System.in);
        for (int cont = 0; cont < vendas.length; cont++) {
            System.out.print("qual o nome do tabalhador? ");
            nomes[cont] = leia.next();
            System.out.print("quantas vendas o trabalhador fez? ");
            vendas[cont] = leia.nextInt();
        }
        for (int cont = 0; cont < vendas.length; cont++) {
            System.out.print("qual a porcentagem da comissâo");
            porcentagem = leia.nextDouble();
            comissao[cont] = (vendas[cont] * porcentagem) / 100;
        }
        for (int cont = 0; cont < vendas.length; cont++) {
            total = vendas[cont] + total;
        }
        for (int cont = 0; cont < vendas.length; cont++) {
            if (cont == 0) {
                maior = comissao[cont];
                menor = comissao[cont];
            } else if (comissao[cont] > maior) {
                maior = comissao[cont];
                quemmaior = cont;
            } else if (comissao[cont] < menor) {
                menor = comissao[cont];
                quemmenor = cont;
            }
        }
        for (int cont = 0; cont < vendas.length; cont++) {
            System.out.println("tabalhador: " + nomes[cont] + " ganhou: R$" + comissao[cont]);
        }
        System.out.println("o total de vendas é: " + total);
        System.out.println("o maior valor é: " + maior + " do trabalhador: " + nomes[quemmaior]);
        System.out.println("o menor valor é :" + menor + " do trabalhador: " + nomes[quemmenor]);
        leia.close();
    }
}