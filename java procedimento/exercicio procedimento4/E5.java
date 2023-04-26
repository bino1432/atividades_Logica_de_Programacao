import java.util.Scanner;

public class E4 {

static String[] caracter = new String = {A, B, C, D, E, F, G, H, I, J, K, L, N, M, O, P, Q, R, S, T, U, V, W, X, Y, Z}
static String digito;
static boolean acertou = false;

    public static void main (String[]args){

        Scanner leia = new Scanner(System.in);
        
        System.out.print("insira um caracter");
        digito = leia.next();

        verificacao();

        if (acertou == true) {
            System.out.print("caracter maiusculo");
        } else {
            System.out.print("caracter numerico ou minusculo");
        }

    }
    static void verificacao() {
        for(int cont = 0; cont <= caracter.length; cont++){
            if(digito == caracter[cont]){
                acertou = true;
            }
        }
    }
}