import java.util.Scanner;

public class E4 {

static String[] maiusculo = new String = {A, B, C, D, E, F, G, H, I, J, K, L, N, M, O, P, Q, R, S, T, U, V, W, X, Y, Z}
static String[] minusculo = new String = {a, b, c, d, e, f, g, h, i, j, k, l, n, m, o, p, q, r, s, t, u, v, w, x, y, z}
static String digito;
static boolean acertou = false;

    public static void main (String[]args){

        Scanner leia = new Scanner(System.in);
        
        System.out.print("insira um caracter");
        digito = leia.next();

        verificacao();

    }
    static void verificacao() {
        for(int cont = 0; cont <= maiusculo.length; cont++){
            if(digito == maiusculo[cont] || digito == minusculo[cont]){
                System.out.print(minusculo[cont])
            }
        }
    }
}