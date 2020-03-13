package com.eduardoalves.conteudo010.vetores;

public class Vetor002CriaVetorIgual {

	public static void main(String[] args) {
		
		/*
		 * Vetor b recebe todos elementos do vetor a
		 */

		int[] a = new int[5];
		int[] b = new int[a.length];
		a[0] = 11;
		a[1] = 22;
		a[2] = 33;
		a[3] = 44;
		a[4] = 55;

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
			System.out.println("Vetor b na posição " + i + " é " + b[i]);
		}
	}
}

