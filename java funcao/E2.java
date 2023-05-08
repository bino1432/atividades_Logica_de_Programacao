import java.util.Scanner;

public class E2 {

    public static void main (String[]args){

        double valorApagar = 1;
        double valorTotal = 0;
        int dias = 0;
        Scanner leia = new Scanner(System.in);

        while (valorApagar != 0){
            System.out.println("insira o valor da prestação: ");
            valorApagar = leia.nextDouble();
            System.out.println("há quantos dias o pagamento está atrasado: ");
            dias = leia.nextInt();
            valorPagamento(valorApagar, dias, valorTotal);
            valorTotal += valorPagamento(valorApagar, dias, valorTotal);
        }
        System.out.println("-------- Relatório --------");
        System.out.println("o valor total das prestações é de " + valorTotal);
        leia.close();
    }
    static double valorPagamento(double valorApagar, int dias, double valorTotal) {
        
        double valor;
        valor = valorApagar;

        if (dias == 0) {
            System.out.println("o valor que deve ser pago é " + valorApagar);
            valorTotal = valorTotal + valor;
        } else {
            valor = valor + valor * 0.03;
            for(int cont = 0; cont < dias; cont++){
                valor = valor + valorApagar * 0.001;
            }
            valorTotal = valorTotal + valor;
            System.out.println("o valor que deve ser pago é de " + valor);
        }
        return valor;
    }
}