import java.util.Scanner;

public class E4 {

static String[] caracter = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", "m", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "N", "M", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}
static String digito;
static boolean acertou = false;

    public static void main (String[]args){

        Scanner leia = new Scanner(System.in);
        
        System.out.print("insira um caracter");
        digito = leia.next();

        verificacao();

        if (acertou == true) {
            System.out.print("caracter alfabetico");
        } else {
            System.out.print("caracter numerico");
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