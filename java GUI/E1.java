import javax.swing.JOptionPane;

public class E1 {
    public static void main (String[]args){

        String Ystring;
        String Xstring;
        int Y;
        int X = 0;        
        
        Ystring = JOptionPane.showInputDialog(null, "qual o tamanho da rua: ");
        Y = Integer.parseInt(Ystring);
        Xstring = JOptionPane.showInputDialog(null, "quantos passos você já deu: ");
        X = Integer.parseInt(Xstring);

        JOptionPane.showMessageDialog(null,atravessaRua(Y, X));
    }
    static String atravessaRua(int Y, int X){
        
        String frase = "";
        
        if(X < Y){
            frase = "faltam " + (Y - X) + " passos";
        } else {
            frase = "chegou!";
        } 
        return frase;
    }
}