import java.util.Scanner;
import java.util.Random;

public class E2 {
    public static void main (String []Args) {

        int[] codigo = new int[10];
        double[] preco = new double[10];

        Scanner leia = new Scanner(System.in);
        Random rand = new Random();
        for(int cont = 0; cont < codigo.length; cont++){
            codigo[cont] = rand.nextInt(100);
            System.out.println("qual é o preço do produto");
            preco[cont] = leia.nextDouble();
        }
        for(int contador = 0; contador < preco.length;contador++){
            for(int cont = 0; cont < preco.length - 1; cont++){
                if(preco[cont] < preco[cont]){
                    double aux = preco[contador];
                    preco[contador] = preco[cont];
                    preco[cont] = aux;
                    
                    int codi = codigo[contador];
                    codigo[contador] = codigo[cont];
                    codigo[cont] = codi;
                }
            }   
        }
        System.out.println("o codigo com maior preço é: "+codigo[9]);
        System.out.println("o codigo com  o 2 maior preço é: "+codigo[8]);
        System.out.println("o codigo com o 3 maior preço é: "+codigo[7]);
        leia.close();
    }
}