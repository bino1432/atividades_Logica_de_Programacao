import java.util.Scanner;

public class E4 {
    public static void main (String[]args){

        int [] valores = new int[10];

        Scanner leia = new Scanner(System.in);
        for(int cont = 1; cont < 10; cont++){
            System.out.print("insira um numero: ");
            valores[cont] = leia.nextInt();
        }
        for(int num : valores){
            System.out.print("normal"+num+", ");
        }
        for(int contadorA = 0; contadorA < valores.length / 2; contadorA++) {
            int j = valores[contadorA];
            valores[contadorA] = valores[valores.length - contadorA - 1];
            valores[valores.length - contadorA - 1] = j;
        }
        for(int num : valores){
            System.out.print("invertido"+num+", ");
        }
        leia.close();
    }
}