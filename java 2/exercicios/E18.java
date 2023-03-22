import java.util.Random;

public class E18 {
    public static void main (String []args){

        int idade;
        Random rand = new Random();

        for(int cont = 0; cont <= 75; cont++){
            idade = rand.nextInt(35);
            if (idade >= 18){
                System.out.println("maior de idade");
            }else{
                System.out.println("menor de idade");
            }
        }
    }
}
