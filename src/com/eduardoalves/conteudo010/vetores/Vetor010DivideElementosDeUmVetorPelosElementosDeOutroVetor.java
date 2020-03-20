package com.eduardoalves.conteudo010.vetores;

import java.util.Scanner;

public class Vetor010DivideElementosDeUmVetorPelosElementosDeOutroVetor {

		public static void main(String[] args) {
			/*
			 *Divide os elementos de um vetor pelos elementos de outro vetor, c[i]=a[i]*b[i].
			 */
			Scanner teclar = new Scanner(System.in);
			int[] a = new int[5];
			int[] b = new int[a.length];
			int[] c = new int[a.length];

			System.out.println("Informe " + a.length + " valores para o vetor a");
			for (int i = 0; i < a.length; i++) {
				System.out.print((i + 1) + "º valor-posição " + i + " ");
				a[i] = teclar.nextInt();
				System.out.print("");
			}

			System.out.println("Informe " + a.length + " valores para o vetor b");
			for (int i = 0; i < a.length; i++) {
				System.out.print((i + 1) + "º valor-posição " + i + " ");
				b[i] = teclar.nextInt();
				System.out.print("");
				c[i] = a[i] / b[i];
			}

			System.out.println("Vetor c(vetor a + vetor b):");
			for (int i = 0; i < a.length; i++) {
				for (i = 0; i < a.length; i++) {
					System.out.println("posição " + i + " valor " + c[i]);
				}
				teclar.close();
			}
		}
	}
