import java.util.ArrayList;
import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {

        boolean parar = false, existe = false;
        ArrayList<String> nomes = new ArrayList<>();
        int escolha = 5;
        String pesquisa = "";

        Scanner leia = new Scanner(System.in);

        while (parar == false) {
            System.out.println("======== MENU ========");
            System.out.println("1) Cadastrar nome");
            System.out.println("2) Pesquisar nome");
            System.out.println("3) Listar todos os nome");
            System.out.println("0) Sair do programa");
            System.out.println("---------");
            System.out.println("Digite sua escolha:");
            escolha = leia.nextInt();

            if (escolha == 1) {
                System.out.println("digite um nome: ");
                nomes.add(leia.next());
            } else if (escolha == 2) {
                System.out.println("digite o nome que você deseja procurar: ");
                pesquisa = leia.next();
                for (int cont = 0; cont < nomes.size(); cont++) {
                    if (nomes.get(cont).equals(pesquisa)) {
                        System.out.println("o nome já existe.");
                        existe = true;
                    }
                }
                if (existe == false) {
                    System.out.println("o nome não existe.");
                }else{
                    existe = false;
                }
            } else if (escolha == 3) {
                for (int cont = 0; cont < nomes.size(); cont++) {
                    System.out.println("a pessoa " + cont + " é: " + nomes.get(cont));
                }
            } else if (escolha == 0) {
                parar = true;
            }
        }
        leia.close();
    }
}
