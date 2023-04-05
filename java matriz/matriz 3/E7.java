import java.util.Random;
import java.util.Scanner;

public class E7 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Insira o tamanho da linha: ");
        int Tlinha = leia.nextInt();
        System.out.println("Insira o tamanho da coluna: ");
        int Tcoluna = leia.nextInt();

        int[][] matriz = new int[Tlinha][Tcoluna];

        for (int linha = 0; linha < Tlinha; linha++){
            for (int coluna = 0; coluna < Tcoluna; coluna++){
                matriz[linha][coluna] = rand.nextInt(100);
            }
        }


            for (int linha = 0; linha < Tlinha; linha++){
                for (int coluna = 0; coluna < Tcoluna; coluna++){
                    boolean lado = ((linha == 0 || linha == Tlinha - 1) && (coluna == 0 || coluna == Tcoluna - 1));
                    boolean meio = ((linha != 0 && coluna != 0) && (linha != Tlinha - 1 && coluna != Tcoluna - 1));
                    if (lado || meio) {
                        System.out.print(" "+ matriz[linha][coluna] + " ");
                    }else{
                        System.out.print(" - ");
                    }
                }
                System.out.println("");
            }
        


        leia.close();
    }
}