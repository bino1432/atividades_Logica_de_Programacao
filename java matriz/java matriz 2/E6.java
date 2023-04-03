package matriz;

public class E6 {
	public static void main (String []args) {
	int[][] matriz = new int[7][8];
			
	for(int linha = 0; linha < 7; linha++) {
		for(int coluna = 0; coluna < 8; coluna++) {
			matriz[linha][coluna] = linha + coluna;
			}
		}
	for(int linha = 0; linha < 7; linha++) {
		for(int coluna = 0; coluna < 8; coluna++) {
			System.out.print(" "+matriz[linha][coluna]+" ");
			}
		System.out.println("");
		}
	}
}
