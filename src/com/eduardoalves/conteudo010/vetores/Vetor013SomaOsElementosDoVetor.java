package com.eduardoalves.conteudo010.vetores;

import java.util.Scanner;

public class Vetor013SomaOsElementosDoVetor {

	public static void main(String[] args) {
		/*
		 * Criar um vetor a com 5 elementos inteiros. Implementar um sistema que some
		 * todos os valores armazenados neste vetor.
		 */

		Scanner teclar = new Scanner(System.in);

		int[] a = new int[5];

		System.out.println("Informe " + a.length + " valores para serem somados");
		for (int i = 0; i < a.length; i++) {
			a[i] = teclar.nextInt();
		}
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result = result + a[i];
		}
		System.out.println("A soma é " + result);
		teclar.close();
	}
}