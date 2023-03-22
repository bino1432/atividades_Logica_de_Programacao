import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {

        String[] mes = { "Janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro",
                "outubro", "novembro", "dezembro" };
        int[] temp = new int[12];
        double maior = 0, menor = 0;
        String nomemaior = "", nomemenor = "";

        Scanner leia = new Scanner(System.in);
        for (int cont = 0; cont < temp.length; cont++) {
            System.out.print("qual a temperatura media do mês?");
            temp[cont] = leia.nextInt();
        }
        for (int cont = 0; cont < temp.length; cont++) {
            if (cont == 1) {
                maior = temp[cont];
                menor = temp[cont];
                nomemaior = mes[cont];
                nomemenor = mes[cont];
            } else if (temp[cont] > maior) {
                maior = temp[cont];
                nomemaior = mes[cont];
            } else if (temp[cont] < menor) {
                menor = temp[cont];
                nomemenor = mes[cont];
            }
        }
        System.out.println("o mês com maior temperatura foi: "+nomemaior+"e foi de: "+maior);
        System.out.println("o mês com maior temperatura foi: "+nomemenor+"e foi de: "+menor);
        leia.close();
    }
}