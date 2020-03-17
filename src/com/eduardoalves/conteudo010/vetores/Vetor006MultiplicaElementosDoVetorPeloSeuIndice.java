package com.eduardoalves.conteudo010.vetores;

import java.util.Scanner;

public class Vetor006MultiplicaElementosDoVetorPeloSeuIndice {

	public static void main(String[] args) {
		/*
		 * Multiplica o vetor pelo seu ìndice b[i] = a[i]*i.
		 */
		Scanner teclar = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe a " + (i + 1) + "ª posição do vetor a");
			a[i] = teclar.nextInt();
			b[i] = a[i] * i;
		}
		System.out.println("Vetor b:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " X índice " + i + " = " + b[i]);
		}
		teclar.close();
	}
}
