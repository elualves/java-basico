package com.eduardoalves.conteudo003.variaveis;

public class Variavel {

	public static void main(String[] args) {
		// Variavel==>>Área resevada na memória do computador, utilizada para armazenar valores.
		
		//declaração das variaveis:
		String nomeDoAluno;
		double nota;
		
		nomeDoAluno = "João da Silva";//João da Silva, pode ser trocado por qualquer outro nome, e armazenado na variável nomeDoAluno.
		nota = 9.4;//9.4, pode ser trocada por qualquer outra nota e armazenada na variável nota.
		
		System.out.println("Aluno:" + nomeDoAluno);
		System.out.println("Nota: " + nota);
		
		//Alterando o valor das variáveis
		nomeDoAluno = "Paulo Oliveira";
		nota = 7;
		
		System.out.println("Aluno:" + nomeDoAluno);
		System.out.println("Nota: " + nota);
	}

}
