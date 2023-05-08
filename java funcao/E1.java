import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {

        int hora = 0;
        int minuto = 0;
        int continuar = 1;
        boolean horacerta = false;
        boolean minutocerto = false ;
        Scanner leia = new Scanner(System.in);

        while(continuar != 0){
        while (horacerta == false){
        System.out.println("digite a hora: ");
        hora = leia.nextInt();
        if (hora < 0 || hora > 24) {
            System.out.println("hora invalida.");
        } else {
            horacerta = true;
        }

        }
        while (minutocerto == false) {
            System.out.println("digite os minutos: ");
            minuto = leia.nextInt();
            if (minuto < 0 || minuto > 59) {
                System.out.println("minuto invalido.");
            } else {
                minutocerto = true;
            }
        }
        if (hora == 12){
            if (minuto >= 0 && minuto <= 9){
                System.out.println(hora + ":0" + minuto + " PM");
            } else {
                System.out.println(hora + ":" + minuto + " PM");
            }
        } else if (hora < 12){
            if (minuto >= 0 && minuto <= 9){
                System.out.println(hora + ":0" + minuto + " AM");
            } else {
                System.out.println(hora + ":" + minuto + " AM");
            }
        } else {
            P(hora, minuto);
        }
        System.out.println("insira 0 para parar o programa: ");
        continuar = leia.nextInt();
    }
        leia.close();
    }
    static int P(int hora, int minuto){
        hora = hora - 12;
        if (minuto >= 0 && minuto <= 9){
            System.out.println(hora + ":0" + minuto + " PM");
        } else {
            System.out.println(hora + ":" + minuto + " PM");
        }
        return hora;
    }
}