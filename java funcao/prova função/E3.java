import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {

        double valor = 0;
        Scanner leia = new Scanner(System.in);

        while (valor < 1 || valor > 9) {
            System.out.println("insira um valor real (1 a 9): ");
            valor = leia.nextDouble();
            if (valor < 1 || valor > 9) {
                System.out.println("numero invalido!");
            }
        }

        System.out.println("o inteiro é: " + inteiro(valor));
        System.out.println("o fracionário é: " + real(valor));
        leia.close();
    }

    static double inteiro(Double valor) {

        if (valor > 1 && valor < 2) {
            valor = 1.0;
        } else if (valor > 2 && valor < 3) {
            valor = 2.0;
        } else if (valor > 3 && valor < 4) {
            valor = 3.0;
        } else if (valor > 4 && valor < 5) {
            valor = 4.0;
        } else if (valor > 5 && valor < 6) {
            valor = 5.0;
        } else if (valor > 6 && valor < 7) {
            valor = 6.0;
        } else if (valor > 7 && valor < 8) {
            valor = 7.0;
        } else if (valor > 8 && valor < 9) {
            valor = 8.0;
        } else if (valor > 9 && valor < 10) {
            valor = 9.0;
        }

        return valor;
    }

    static double real(double valor) {

        double numero = 0;

        if (valor > 1 && valor < 2) {
            numero = 1.0;
        } else if (valor > 2 && valor < 3) {
            numero = 2.0;
        } else if (valor > 3 && valor < 4) {
            numero = 3.0;
        } else if (valor > 4 && valor < 5) {
            numero = 4.0;
        } else if (valor > 5 && valor < 6) {
            numero = 5.0;
        } else if (valor > 6 && valor < 7) {
            numero = 6.0;
        } else if (valor > 7 && valor < 8) {
            numero = 7.0;
        } else if (valor > 8 && valor < 9) {
            numero = 8.0;
        } else if (valor > 9 && valor < 10) {
            numero = 9.0;
        }

        valor = valor - numero;
        return valor;
    }
}
