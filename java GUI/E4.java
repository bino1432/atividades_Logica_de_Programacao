import javax.swing.JOptionPane;

public class E4 {
    public static void main (String[]args){

        String SNota;
        Double Nota;

        SNota = JOptionPane.showInputDialog(null, "Qual foi a sua nota: ");
        Nota = Double.parseDouble(SNota);

        JOptionPane.showMessageDialog(null, notachar(Nota));
    }
    static String notachar(double Nota) {

        String Nchar;

        if(Nota >= 9){
            Nchar = "A";
        } else if(Nota >= 8 && Nota < 9){
            Nchar = "B";
        } else if(Nota >= 7 && Nota < 8){
            Nchar = "C";
        } else if(Nota >= 6 && Nota < 7){
            Nchar = "D";
        } else {
            Nchar = "E";
        }

        return Nchar;
    }
}
