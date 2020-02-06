package com.eduardoalves.conteudo002.scanner;

import java.util.Scanner;

public class TeclarScanner {

	public static void main(String[] args) {

		/*
		 * Uso da classe Scanner
		 */

		Scanner teclar = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int valor1 = teclar.nextInt();

		System.out.println("Informe outro número: ");
		int valor2 = teclar.nextInt();

		System.out.println("a soma é: " + (valor1 + valor2));

		teclar.close();
	}
}
