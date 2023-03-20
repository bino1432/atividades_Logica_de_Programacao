package array;

public class array1 {
	public static void main (String[]args) {
		
		int[] A = {4, 14, 16, 64, 234, 34, 24, 65, 56, 86};
		int[] B = {6, 52, 64, 41, 68, 98, 52, 14, 53, 46};
		int[] C = new int[10];
		
		for(int contador = 0; contador <= 9; contador++) {
			C[contador] = A[contador] - B[contador];
		}
		for(int numero : C) {
			System.out.println(numero);
		}
		
	}
}