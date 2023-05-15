import java.util.Scanner;

import javax.swing.JOptionPane;

public class E2 {
    public static void main(String[] args) {

        Double saldo = 0.0;
        Double depositar = 0.0;
        Double sacar = 0.0;
        String depositarString = "";
        String sacarString = "";
        int fim = 5;
        Scanner leia = new Scanner(System.in);

        while (fim != 0) {

            System.out.println("1) ver saldo");
            System.out.println("2) depositar");
            System.out.println("3) sacar");
            System.out.println("===============");
            fim = leia.nextInt();

            switch (fim) {
                case 1:
                    JOptionPane.showMessageDialog(null, "saldo atual: " + saldo);
                    break;
                case 2:

                    depositarString = JOptionPane.showInputDialog(null, "quanto você deseja depositar: ");
                    depositar = Double.parseDouble(depositarString);

                    JOptionPane.showMessageDialog(null,
                            "depositado com sucesso: " + depositarFuncao(depositar) + " reais");
                    break;
                case 3:
                    sacarString = JOptionPane.showInputDialog(null, "quanto você deseja sacar: ");
                    sacar = Double.parseDouble(sacarString);

                    JOptionPane.showMessageDialog(null,
                            "Saldo Atual: " + (saldo - sacarFuncao(sacarString, sacar, saldo)));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operação Invalida");
                    break;
            }
        }

        leia.close();
    }

    static double depositarFuncao(Double depositar) {

        return depositar;
    }

    static Double sacarFuncao(String sacarsString, Double sacar, Double saldo) {

        if (sacar > saldo) {
            JOptionPane.showMessageDialog(null, "Saldo Invalido!");
            sacar = 0.0;
        } else {
            JOptionPane.showMessageDialog(null, "você sacou: " + sacar);
        }

        return sacar;
    }
}