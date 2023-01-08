package ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * Gere e imprima uma matriz M 4x4 com valores do teclado. Após isso indique
		 * qual é o maior e o menor valor da linha 3 e qual é o maior e menor valor da
		 * coluna 4
		 */

		Scanner scan = new Scanner(System.in);
		int[][] matrizM = new int[4][4];

		// Adicionar os números

		for (int i = 0; i < matrizM.length; i++) {
			for (int k = 0; k < matrizM[i].length; k++) {
				System.out.println("Adicione um número para a linha " + (i + 1) + " e coluna " + (k + 1));
				matrizM[i][k] = scan.nextInt();
			}
		}

		int maiorNumeroLinha = matrizM[2][0];
		int menorNumeroLinha = matrizM[2][0];

		int maiorNumeroColuna = matrizM[0][3];
		int menorNumeroColuna = matrizM[0][3];

		// Buscando o maior e o menor número da linha 3

		for (int k = 0; k < matrizM[2].length; k++) {
			if (matrizM[2][k] > maiorNumeroLinha) {
				maiorNumeroLinha = matrizM[2][k];
			} else if (matrizM[2][k] < menorNumeroLinha) {
				menorNumeroLinha = matrizM[2][k];
			}
		}

		// Buscando o maior e o menor número da coluna 4

		for (int i = 0; i < matrizM.length; i++) {
			if (matrizM[i][3] > maiorNumeroColuna) {
				maiorNumeroColuna = matrizM[i][3];
			} else if (matrizM[i][3] < menorNumeroColuna) {
				menorNumeroColuna = matrizM[i][3];
			}
		}

		System.out
				.println("O maior número da linha 3 é " + maiorNumeroLinha + " e o menor número é " + menorNumeroLinha);
		System.out.println(
				"O maior número da coluna 4 é " + maiorNumeroColuna + " e o menor número é " + menorNumeroColuna);
	}

}
