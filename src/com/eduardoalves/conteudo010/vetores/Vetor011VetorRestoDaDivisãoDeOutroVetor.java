package com.eduardoalves.conteudo010.vetores;

import java.util.Scanner;

public class Vetor011VetorRestoDaDivis�oDeOutroVetor {

	public static void main(String[] args) {
		/*
		 * Cria vetor com o resto da divis�o de outro vetor, ou seja, b[i]=b[i]%2.
		 */
		Scanner teclar = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[a.length];

		System.out.println("Informe " + a.length + " valores para o vetor a");
		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "� valor-posi��o " + i + " ");
			a[i] = teclar.nextInt();
			System.out.print("");

			b[i] = a[i] % 2;

		}
		System.out.println("Vetor b:");
		for (int i = 0; i < a.length; i++) {
			System.out.println("posi��o " + i + " valor " + b[i]);
		}
		teclar.close();
	}

}
