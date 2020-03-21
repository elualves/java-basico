package com.eduardoalves.conteudo010.vetores;

import java.util.Scanner;

public class Vetor014MediaAritimeticaDosElementosImparesDoVetor {

		public static void main(String[] args) {
			/*
			 * Criar um vetor a com 5 elementos inteiros. Implementar um sistema que calcule
			 * a média aritimética dos Valores impares deste vetor
			 */

			Scanner teclar = new Scanner(System.in);

			int[] vetorA = new int[5];
			int[] vetorNumImpar = new int[vetorA.length];
			int somaResult = 0;
			int media = 0;
			int contador = 0;

			System.out.println("Informe 5 elementos para o vetor A:");

			for (int i = 0; i < vetorA.length; i++) {

				vetorA[i] = teclar.nextInt();

				if (vetorA[i] % 2 != 0) {
					contador++;
					vetorNumImpar[i] = vetorA[i];
					int recebeNumImpar = 0;
					recebeNumImpar = vetorNumImpar[i];
					somaResult = somaResult + recebeNumImpar;
					media = somaResult / contador;
				}
			}

			System.out.println("A média aritimética dos elemtos impares do vetor A é " + media);

			teclar.close();
		}
	}