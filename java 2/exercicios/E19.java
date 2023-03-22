import java.util.Scanner;

public class E19 {
    public static void main (String[]args){

        Scanner leia = new Scanner(System.in);
        int M, F, idade, genero;
        String nome;
    
        for (int cont = 1; cont <56; cont++){
            System.out.print("qual o seu nome? ");
            nome = leia.next();
            System.out.print("qual o seu genero?(1 para homem e 2 para mulher) ");
            genero = leia.nextInt();
            if (genero == 1){
                System.out.print("o seu nome é "+nome+"e voce é um homem");
                M++;
            }else if(genero == 2){
                System.out.print("o seu nome é "+nome+"e voce é uma mulher");
                F++;
            }
        }
        System.out.print("o total de homens é de "+M+" e o total de mulheres é de "+F);
        leia.close();
    }
}
