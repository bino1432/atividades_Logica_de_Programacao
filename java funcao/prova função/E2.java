import java.util.Scanner;
import java.lang.Math;

public class E2 {
    public static void main(String[] args) {

        double nota1;
        double nota2;
        double nota3;
        String operacao;
        Scanner leia = new Scanner(System.in);

        System.out.println("insira a primeira nota: ");
        nota1 = leia.nextDouble();
        System.out.println("insira a segunda nota: ");
        nota2 = leia.nextDouble();
        System.out.println("insira a terceira nota: ");
        nota3 = leia.nextDouble();
        System.out.println("qual a operação que deseja: ");
        System.out.println("A) Média Aritimética");
        System.out.println("P) Média Ponderada");
        System.out.println("H) Média Harmônica");
        System.out.println("======================");
        operacao = leia.next();

        switch (operacao) {
            case "A":
                System.out.print("a sua média é: " + calculoAritimetica(nota1, nota2, nota3));
                break;
            case "P":
                System.out.print("a sua média é: " + calculoPonderada(nota1, nota2, nota3));
                break;
            case "H":
                System.out.print("a sua média é: " + calculoHarmonica(nota1, nota2, nota3));
                break;
            default:
                System.out.print("operação invalida!");
        }

        leia.close();

    }

    static double calculoAritimetica(double nota1, double nota2, double nota3) {

        double media = 0;

        media = (nota1 + nota2 + nota3) / 3;

        return media;
    }

    static double calculoPonderada(double nota1, double nota2, double nota3) {

        double media = 0;
        double nota1Ponderada;
        double nota2Ponderada;
        double nota3Ponderada;

        nota1Ponderada = nota1 * 5;
        nota2Ponderada = nota2 * 3;
        nota3Ponderada = nota3 * 2;
        media = (nota1Ponderada + nota2Ponderada + nota3Ponderada) / 10;

        return media;
    }

    static double calculoHarmonica(double nota1, double nota2, double nota3) {

        double media = 0;
        double nota1Harmonica;
        double nota2Harmonica;
        double nota3Harmonica;

        nota1Harmonica = Math.pow(nota1, -1);
        nota2Harmonica = Math.pow(nota2, -1);
        nota3Harmonica = Math.pow(nota3, -1);
        media = 3 / (nota1Harmonica + nota2Harmonica + nota3Harmonica);

        return media;
    }
}