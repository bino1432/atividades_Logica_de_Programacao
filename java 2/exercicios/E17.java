import java.util.Random;

public class E17 {
    public static void main (String []args){

        Random rand = new Random();
        int valor;

        for(int cont = 0; cont <= 80; cont++){
            valor = rand.nextInt(500);
            if (valor > 10 && valor < 150){
                System.out.println(valor);
            }
        }
    }
}