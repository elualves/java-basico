package com.eduardoalves.conteudo010.vetores;

import java.util.Scanner;

public class Vetor015MostraOMaiorEOMenorValorDoVetor {

	public static void main(String[] args) {

		/* Determina o maior e o menor elemento do vetor */

		Scanner teclar = new Scanner(System.in);
		int[] valores = new int[5];

		System.out.println("Informe 5 elementos para o vetor:");

		for (int i = 0; i < valores.length; i++) {
			System.out.print(i + 1 + "-");
			valores[i] = teclar.nextInt();
		}

		int valorMenor = valores[0];
		int valorMaior = valores[0];
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] < valorMenor) {
				valorMenor = valores[i];
			} else if (valores[i] > valorMaior) {
				valorMaior = valores[i];
			}
		}

		System.out.println("Maior valor é " + valorMaior);
		System.out.println("Menor valor é " + valorMenor);

		teclar.close();
	}

}
