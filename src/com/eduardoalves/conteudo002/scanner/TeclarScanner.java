package com.eduardoalves.conteudo002.scanner;

import java.util.Scanner;

public class TeclarScanner {

	public static void main(String[] args) {

		/*
		 * Uso da classe Scanner
		 */

		Scanner teclar = new Scanner(System.in);

		System.out.println("Informe um n�mero: ");
		int valor1 = teclar.nextInt();

		System.out.println("Informe outro n�mero: ");
		int valor2 = teclar.nextInt();

		System.out.println("a soma �: " + (valor1 + valor2));

		teclar.close();
	}
}
