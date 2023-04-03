public class E2 {
    public static void main (String []args){
        
        int [] vetor1 = { 28, 69, 100, 71, 61, 36, 76, 54, 14, 2, 67, 98, 79, 30, 26, 44, 88, 24, 1, 47};
        int [] vetor2 = { 45, 54, 32, 28, 20, 24, 100, 37, 11, 8, 35, 72, 23, 61, 29, 73, 90, 52, 7, 57};
        int [] menos = new int [20];
        int [] mais = new int [20];
        int [] vezes = new int [20];

        for (int cont = 0; cont < vetor1.length; cont++){
            menos[cont] = vetor1[cont] - vetor2[cont];
            mais[cont] = vetor1[cont] + vetor2[cont];
            vezes[cont] = vetor1[cont] * vetor2[cont];
        }
        for (int num : vetor1){
            System.out.println("vetor1: "+num);
        }
        for (int num : vetor2){
            System.out.println("vetor2: "+num);
        }
        for (int num : menos){
            System.out.println("menos: "+num);
        }
        for (int num : mais){
            System.out.println("mais: "+num);
        }
        for (int num : vezes){
            System.out.println("vezes: "+num);
        }
    }
}
