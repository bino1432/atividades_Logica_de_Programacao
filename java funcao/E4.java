import java.util.Scanner;

public class E4 {
    public static void main (String []args){

        String numeroinvertido = "";

        System.out.print("o numero invertido é: " + invertido(numeroinvertido));
    }
    static String invertido(String numeroinvertido) {
        String numero = " ";
        
        Scanner leia = new Scanner(System.in);

        System.out.print("insira um numero: ");
        numero = leia.next();
        for (int cont = numero.length(); cont > 0; cont--){
            numero += numero.substring(cont -1, cont);
        } 
        leia.close();
        return numero;
    }
}
