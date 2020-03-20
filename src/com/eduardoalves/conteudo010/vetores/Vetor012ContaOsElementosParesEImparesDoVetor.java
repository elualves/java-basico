package com.eduardoalves.conteudo010.vetores;
import java.util.Scanner;

public class Vetor012ContaOsElementosParesEImparesDoVetor {
	


		public static void main(String[] args) {
			/*
			 *Conta os elementos pares e impares do vetor.
			 */

			Scanner teclar = new Scanner(System.in);
			int[] a = new int[5];
			int i = 0;
			int par = 0;
			int impar = 0;
			System.out.println("Informe " + a.length + " valores para o vetor a ");

			for (i = 0; i < a.length; i++) {
				a[i] = teclar.nextInt();
			}
			for (i = 0; i < a.length; i++) {

				if (a[i] % 2 == 0) {
					par++;
				}

				if (a[i] % 2 != 0) {
					impar++;
				}
			}
			System.out.println("Par " + par);
			System.out.println("Impar: " + impar);
			teclar.close();
		}
	}
