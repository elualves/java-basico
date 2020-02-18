package com.eduardoalves.conteudo004.tiposprimitivos;

public class InteiroChar {

	public static void main(String[] args) {

		/*
		 * char==>>Considerada um inteiro pois cada caractere é representado por um
		 * valor numérico(Unicode=>ver tabela ascii) Possibilidade de escrever qualquer
		 * caractere
		 */

		System.out.println("Atribuindo valores com o caractere");
		char vogalA = 'a';
		char vogalE = 'e';
		char vogalI = 'i';

		System.out.println();
		
		System.out.println(vogalA);
		System.out.println(vogalE);
		System.out.println(vogalI);

		System.out.println("Atribuindo o valores com a tabela ASCII");
		char asciiA = 97;
		char asciiE = 101;
		char asciiI = 105;

		System.out.println("" + asciiA + asciiE + asciiI);// as aspas vazia " " faz a transformação do código ASCII em
														  // caractere

		System.out.println(asciiA);
		System.out.println(asciiE);
		System.out.println(asciiI);
	}
	
}
