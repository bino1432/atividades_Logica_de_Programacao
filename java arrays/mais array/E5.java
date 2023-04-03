import java.util.Random;
import java.util.Scanner;

public class E5 {
    public static void main (String []args){

        Random rand = new Random();
        int [] valor = new int [10];
        int digito;
        boolean acerto = false;

        Scanner leia = new Scanner(System.in);
        for(int cont = 0; cont < valor.length;cont++){
            valor[cont] = rand.nextInt(10);
        }
        System.out.print("insira um valor: ");
        digito = leia.nextInt();
        for (int cont = 1; cont < valor.length;cont++){
            if (digito == valor[cont]){
                System.out.print("Você acertou, o numero está na casa: "+cont);
                acerto = true;
            }
        }
        if(acerto == false){
        System.out.print("você não acertou");
        }
        leia.close();
    }
}