import java.util.Random;

public class E5 {
    public static void main(String[] args) {

        int dado1;
        int dado2;
        int resultado = 0;
        Random rand = new Random();

        dado1 = rand.nextInt(6);
        dado2 = rand.nextInt(6);

        System.out.println("caiu o numero: " + dado1 + " no primeiro dado");
        System.out.println("caiu o numero: " + dado2 + " no segundo dado");
        verificacao(dado1, dado2, resultado);
    }

    static int verificacao(int dado1, int dado2, int resultado) {
        int ponto = 0;
        boolean acabou = false;
        Random rand = new Random();

        if (dado1 + dado2 == 7 || dado1 + dado2 == 11) {
            System.out.println("você ganhou");
        } else if (dado1 + dado2 == 2 || dado1 + dado2 == 3 || dado1 + dado2 == 12) {
            System.out.println("você perdeu");
        } else {
            ponto = dado1 + dado2;
            while (acabou == false) {
                dado1 = rand.nextInt(6);
                dado2 = rand.nextInt(6);
                if (dado1 + dado2 == ponto) {
                    System.out.println("você ganhou");
                    acabou = true;
                } else if (dado1 + dado2 == 7) {
                    System.out.println("você perdeu");
                    acabou = true;
                }
            }
        }
        return resultado;
    }
}
