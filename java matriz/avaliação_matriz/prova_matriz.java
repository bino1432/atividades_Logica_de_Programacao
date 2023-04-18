package prova;

import java.util.Scanner;

public class provamatriz {
	public static void main(String[] args) {

		int[][] sudoku = new int[9][9];
		int pessoas;
		int[] verificacao = new int[9];
		boolean Acertou = true;

		Scanner leia = new Scanner(System.in);

		System.out.print("insira a quantidade de jogadores: ");
		pessoas = leia.nextInt();

		String[] nomes = new String[pessoas];

		for (int contador = 0; contador < nomes.length; contador++) {
			System.out.print("insira o nome do jogador: ");
			nomes[contador] = leia.next();
		}

		int vezesJogadas = 1;
		int Jogador = 1;
		int numero;

		while (vezesJogadas <= pessoas) {
			for (int linha = 0; linha < sudoku.length; linha++) {
				for (int coluna = 0; coluna < sudoku.length; coluna++) {
					sudoku[linha][coluna] = 0;
				}
			}
			for (int linha = 0; linha < sudoku.length; linha++) {
				for (int coluna = 0; coluna < sudoku.length; coluna++) {
					for (int desenhoLinha = 0; desenhoLinha < sudoku.length; desenhoLinha++) {
						for (int desenhoColuna = 0; desenhoColuna < sudoku.length; desenhoColuna++) {
							System.out.print(" " + sudoku[desenhoLinha][desenhoColuna] + " ");
						}
						System.out.println("");
					}
					System.out.println("Jogo numero " + Jogador);
					System.out.println("digite o numero que deseja inserir na linha " + (linha + 1) + " e na coluna "
							+ (coluna + 1));
					numero = leia.nextInt();
					if (numero > 0 && numero < 10) {
						sudoku[linha][coluna] = numero;
					} else if (numero <= 0) {
						System.out.println("o numero digitado está abaixo do permitido, trocando para 1");
						sudoku[linha][coluna] = 1;
					} else {
						System.out.println("o numero digitado está acima do permitido, trocando para 9");
						sudoku[linha][coluna] = 9;
					}
				}
			}
	        for (int linha = 0; linha < sudoku.length; linha++) {
	            for (int colunas = 0; colunas < sudoku[0].length; colunas++) {
	                if (sudoku[linha][colunas] == 1 && verificacao[0] == 0) {
	                	verificacao[0]++;
	                } else if (sudoku[linha][colunas] == 2 && verificacao[1] == 0) {
	                	verificacao[1]++;
	                } else if (sudoku[linha][colunas] == 3 && verificacao[2] == 0) {
	                	verificacao[2]++;
	                } else if (sudoku[linha][colunas] == 4 && verificacao[3] == 0) {
	                	verificacao[3]++;
	                } else if (sudoku[linha][colunas] == 5 && verificacao[4] == 0) {
	                	verificacao[4]++;
	                } else if (sudoku[linha][colunas] == 6 && verificacao[5] == 0) {
	                	verificacao[5]++;
	                } else if (sudoku[linha][colunas] == 7 && verificacao[6] == 0) {
	                	verificacao[6]++;
	                } else if (sudoku[linha][colunas] == 8 && verificacao[7] == 0) {
	                	verificacao[7]++;
	                } else if (sudoku[linha][colunas] == 9 && verificacao[8] == 0) {
	                	verificacao[8]++;
	                } else {
	                	Acertou = false;
	                }
	            }
	            for (int val = 0; val < verificacao.length; val++) {
	            	verificacao[val] = 0;
	            }
	        }

	        for (int colunas = 0; colunas < sudoku[0].length; colunas++) {
	            for (int linha = 0; linha < sudoku.length; linha++) {
	                if (sudoku[linha][colunas] == 1 && verificacao[0] == 0) {
	                	verificacao[0]++;
	                } else if (sudoku[linha][colunas] == 2 && verificacao[1] == 0) {
	                	verificacao[1]++;
	                } else if (sudoku[linha][colunas] == 3 && verificacao[2] == 0) {
	                	verificacao[2]++;
	                } else if (sudoku[linha][colunas] == 4 && verificacao[3] == 0) {
	                	verificacao[3]++;
	                } else if (sudoku[linha][colunas] == 5 && verificacao[4] == 0) {
	                	verificacao[4]++;
	                } else if (sudoku[linha][colunas] == 6 && verificacao[5] == 0) {
	                	verificacao[5]++;
	                } else if (sudoku[linha][colunas] == 7 && verificacao[6] == 0) {
	                	verificacao[6]++;
	                } else if (sudoku[linha][colunas] == 8 && verificacao[7] == 0) {
	                	verificacao[7]++;
	                } else if (sudoku[linha][colunas] == 9 && verificacao[8] == 0) {
	                	verificacao[8]++;
	                } else {
	                	Acertou = false;
	                }
	            }
	            for (int val = 0; val < verificacao.length; val++) {
	            	verificacao[val] = 0;
	            }
	        }

	        for (int totalLinhas = 0; totalLinhas < sudoku.length; totalLinhas += 3) {
	            for (int totalColunas = 0; totalColunas < sudoku[0].length; totalColunas += 3) {
	                for (int linha = totalLinhas; linha < (totalLinhas + 3); linha++) {
	                    for (int colunas = totalColunas; colunas < (totalColunas + 3); colunas++) {
	                        if (sudoku[linha][colunas] == 1 && verificacao[0] == 0) {
	                        	verificacao[0]++;
	                        } else if (sudoku[linha][colunas] == 2 && verificacao[1] == 0) {
	                        	verificacao[1]++;
	                        } else if (sudoku[linha][colunas] == 3 && verificacao[2] == 0) {
	                        	verificacao[2]++;
	                        } else if (sudoku[linha][colunas] == 4 && verificacao[3] == 0) {
	                        	verificacao[3]++;
	                        } else if (sudoku[linha][colunas] == 5 && verificacao[4] == 0) {
	                        	verificacao[4]++;
	                        } else if (sudoku[linha][colunas] == 6 && verificacao[5] == 0) {
	                        	verificacao[5]++;
	                        } else if (sudoku[linha][colunas] == 7 && verificacao[6] == 0) {
	                        	verificacao[6]++;
	                        } else if (sudoku[linha][colunas] == 8 && verificacao[7] == 0) {
	                        	verificacao[7]++;
	                        } else if (sudoku[linha][colunas] == 9 && verificacao[8] == 0) {
	                        	verificacao[8]++;
	                        } else {
	                        	Acertou = false;
	                        }
	                    }
	                    if (linha == 2 || linha == 5 || linha == 8) {
	                        for (int val = 0; val < verificacao.length; val++) {
	                        	verificacao[val] = 0;
	                        }
	                    }
	                }
	            }
	        }
	        if (Acertou == true) {
				System.out.println("Jogador numero: " + Jogador);
				System.out.println("nome do jogador: " + nomes[Jogador - 1]);
				System.out.println("SIM");
				for (int linha = 0; linha < sudoku.length; linha++) {
					for (int coluna = 0; coluna < sudoku.length; coluna++) {
						if (coluna == 2 || coluna == 5) {
							System.out.print(" " + sudoku[linha][coluna] + " | ");
						} else {
							System.out.print(" " + sudoku[linha][coluna] + " ");
						}
					}
					if (linha == 2 || linha == 5) {
						System.out.println("");
						System.out.println("---------|----------|----------");
					} else {
						System.out.println("");
					}
				}
			} else {
				System.out.println("Jogador numero: " + Jogador);
				System.out.println("nome do jogador: " + nomes[Jogador - 1]);
				System.out.println("NAO");
				for (int linha = 0; linha < sudoku.length; linha++) {
					for (int coluna = 0; coluna < sudoku.length; coluna++) {
						if (coluna == 2 || coluna == 5) {
							System.out.print(" " + sudoku[linha][coluna] + " | ");
						} else {
							System.out.print(" " + sudoku[linha][coluna] + " ");
						}
					}
					if (linha == 2 || linha == 5) {
						System.out.println("");
						System.out.println("---------|----------|----------");
					} else {
						System.out.println("");
					}
				}
			}
			vezesJogadas = vezesJogadas + 1;
			Jogador = Jogador + 1;
		}
		leia.close();
	}
}