package com.eduardoalves.conteudo010.vetores;

public class Vetor004QuadradoDoElementoDoVetor {

	public static void main(String[] args) {
		/*
		 * Quadrado dos elementos do vetor, b[i] = a[i] * a[i].
		 */
		int[] a = new int[5];
		int[] b = new int[a.length];
		a[0] = 4;
		a[1] = 6;
		a[2] = 8;
		a[3] = 8;
		a[4] = 10;

		System.out.println("Vetor a:");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Posição " + i + " = " + a[i]);
		}
		System.out.println(" ");
		System.out.println("Vetor a elevado ao quadrado:");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Posição " + i + " = " + a[i] * a[i]);
			b[i] = a[i] * a[i];
		}
		System.out.println(" ");
		System.out.println("Vetor b:");

		for (int i = 0; i < a.length; i++) {
			System.out.println("posição " + i + " = " + b[i]);
		}
	}
}

