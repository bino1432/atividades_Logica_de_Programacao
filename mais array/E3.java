import java.util.Scanner;

public class E3 {
    public static void main (String []args ){
    
        double [] notas = new double [10];
        double media = 0, acima = 0, maior = 0;
        int posicao = 0;

        Scanner leia = new Scanner(System.in);
        for (int cont = 0; cont < notas.length; cont++){
            System.out.print("insira a nota: ");
            notas [cont] = leia.nextDouble();
            media = media + notas[cont];
            if(notas[cont] >= 7){
                acima++;
            }
            if (cont == 1){
                maior = notas[cont];
                posicao = cont;
            }else if (notas[cont] > maior){
                maior = notas[cont];
                posicao = cont + 1;
            }
        }
        media = media /10;
        System.out.println("a media é de: "+media);
        System.out.println("a quantidade de alunos passados é de: "+acima);
        System.out.println("a maior nota é de: "+maior);
        System.out.println("e a posiçao em que a nota foi colocada é de: "+posicao);
        leia.close();
    }
}