package com.eduardoalves.conteudo010.vetores;

import java.util.Scanner;

public class MultiplicaElementoDoVetor {

	public static void main(String[] args) {
		/*
		 * Multiplica o elemento do vetor
		 */

		Scanner teclar = new Scanner(System.in);

		int[] a = new int[8];
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			System.out.println("Informe o " + (i + 1) + "º valor para o vetor a: ");
			a[i] = teclar.nextInt();
			b[i] = a[i] * 2;
		}
		System.out.println("Valores do vetor a :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println(" ");

		System.out.println("Valores do vetor b (a*2):");
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i] + " ");
		}

		teclar.close();
	}
}

