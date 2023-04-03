import java.util.Scanner;

public class E4 {
    public static void main (String[]args){

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
    
        Scanner leia = new Scanner(System.in);
        for(int cont = 0; cont < vetor1.length; cont++){
            System.out.print("insira os valores do primeiro vetor: ");
            vetor1[cont] = leia.nextInt();
        }
        for(int cont = 0; cont < vetor2.length; cont++){
            System.out.print("insira os valores do segundo vetor: ");
            vetor2[cont] = leia.nextInt();
        }
        for(int cont = 0; cont < vetor1.length; cont++){
            if(vetor1[cont] == vetor2[cont]){
                System.out.println("na casa "+cont+" é igual");
            }else{
                System.out.println("na casa "+cont+" não é igual");
            }
        }
        leia.close();   
    }
}