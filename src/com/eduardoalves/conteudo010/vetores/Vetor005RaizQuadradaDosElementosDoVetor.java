package com.eduardoalves.conteudo010.vetores;

public class Vetor005RaizQuadradaDosElementosDoVetor {

	public static void main(String[] args) {
		/*
		 * Raiz quadrada dos elementos do vetor, b[i] = sqrt (a[i]).
		 */
		int[] a = new int[5];
		double[] b = new double[a.length];
		a[0] = 9;
		a[1] = 16;
		a[2] = 25;
		a[3] = 36;
		a[4] = 64;

		System.out.println("Vetor a:");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Posição " + i + " = " + a[i]);
		}
		System.out.println(" ");
		System.out.println("Raiz quadrada do vetor a:");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Posição " + i + " = " + Math.sqrt(a[i]));
			b[i] = Math.sqrt(a[i]);
		}
		System.out.println(" ");
		System.out.println("Vetor b:");

		for (int i = 0; i < a.length; i++) {
			System.out.println("posição " + i + " = " + b[i]);
		}
	}
}
