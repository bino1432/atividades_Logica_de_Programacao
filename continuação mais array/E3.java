import java.util.Random;

public class E3 {
    public static void main(String[] args) {

        int[] temperatura = new int[121];
        int maior = 0, menor = 0, media = 0;

        Random aleatorio = new Random();

        for (int cont = 0; cont < temperatura.length; cont++) {
            temperatura[cont] = aleatorio.nextInt((40 - 15) + 1) + 15;
        }
        for (int cont = 0; cont < temperatura.length; cont++) {
            if (cont == 0) {
                maior = temperatura[cont];
                menor = temperatura[cont];
            } else if (temperatura[cont] > maior) {
                maior = temperatura[cont];
            } else if (temperatura[cont] < menor) {
                menor = temperatura[cont];
            }
            media = temperatura[cont] + media;
        }
        media = media / 121;
        System.out.println("o maior é: " + maior);
        System.out.println("o menor é: " + menor);
        System.out.println("a media é: " + media);
    }
}