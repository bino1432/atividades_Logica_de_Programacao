import java.util.Scanner;

public class E4 {

static int[] digito = new String = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}
static int digitado;
static boolean acertou = false;

    public static void main (String[]args){

        Scanner leia = new Scanner(System.in);
        
        System.out.print("insira um caracter");
        digitado = leia.next();

        verificacao();

        if (acertou == true) {
            System.out.print("caracter minusculo");
        } else {
            System.out.print("caracter numerico ou maiusculo");
        }

    }
    static void verificacao() {
        for(int cont = 0; cont <= caracter.length; cont++){
            if(digitado == digito[cont]){
                acertou = true;
            }
        }
    }
}