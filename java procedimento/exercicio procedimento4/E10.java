import java.util.Scanner;

public class E4 {

static String frase;
static boolean acertou = false;

    public static void main (String[]args){

        Scanner leia = new Scanner(System.in);

        convercao();

        System.out.print(frase);
    }
    static void convercao() {
        System.out.print("insira um caracter");
        frase = leia.next().toUpperCase();
    }
}