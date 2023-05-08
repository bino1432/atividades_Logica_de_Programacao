import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {

        int dia = 0;
        int ano = 0;
        int mes = 0;
        String mesPalavra = "";
        boolean diaCerto = false;
        boolean mesCerto = false;
        boolean anoCerto = false;
        Scanner leia = new Scanner(System.in);

        while (mesCerto == false) {
            System.out.println("insira o mês: ");
            mes = leia.nextInt();
            if (mes >= 1 && mes <= 12) {
                mesCerto = true;
            } else {
                System.out.println("mês invalido");
            }
        }

        while (diaCerto == false) {
            System.out.print("insira o dia: ");
            dia = leia.nextInt();
            if (mes == 2) {
                if (dia >= 1 && dia <= 29){
                    diaCerto = true;
                } else {
                    System.out.println("dia invalido");
                }
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia >= 1 && dia <= 31){
                    diaCerto = true;
                } else {
                    System.out.println("dia invalido");
                }   
            } else {
                if (dia >= 1 && dia <= 30){
                    diaCerto = true;
                } else {
                    System.out.println("dia invalido");
                }
            }
        }

        while (anoCerto == false) {
            System.out.println("insira o ano: ");
            ano = leia.nextInt();
            if (ano >= 1900 && ano <= 2023) {
                anoCerto = true;
            } else {
                System.out.println("ano invalido");
            }
        }
        System.out.print(dia + "/" + verificacao(mesPalavra, mes) + "/" + ano);
        leia.close();
    }
    static String verificacao(String mesPalavra, int mes){
        switch(mes){
            case 1:
            mesPalavra = "Janeiro";
            break;
            case 2:
            mesPalavra = "Fevereiro";
            break;
            case 3:
            mesPalavra = "Março";
            break;
            case 4:
            mesPalavra = "Abril";
            break;
            case 5:
            mesPalavra = "Maio";
            break;
            case 6:
            mesPalavra = "Junho";
            break;
            case 7:
            mesPalavra = "Julho";
            break;
            case 8:
            mesPalavra = "Agosto";
            break;
            case 9:
            mesPalavra = "Setembro";
            break;
            case 10:
            mesPalavra = "Outubro";
            break;
            case 11:
            mesPalavra = "Novembro";
            break;
            case 12:
            mesPalavra = "Dezembro";
            break;
        }
        return mesPalavra;
    }    
}