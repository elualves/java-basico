package com.eduardoalves.conteudo003.variaveis;

public class Variavel {

	public static void main(String[] args) {
		// Variavel==>>�rea resevada na mem�ria do computador, utilizada para armazenar valores.
		
		//declara��o das variaveis:
		String nomeDoAluno;
		double nota;
		
		nomeDoAluno = "Jo�o da Silva";//Jo�o da Silva, pode ser trocado por qualquer outro nome, e armazenado na vari�vel nomeDoAluno.
		nota = 9.4;//9.4, pode ser trocada por qualquer outra nota e armazenada na vari�vel nota.
		
		System.out.println("Aluno:" + nomeDoAluno);
		System.out.println("Nota: " + nota);
		
		//Alterando o valor das vari�veis
		nomeDoAluno = "Paulo Oliveira";
		nota = 7;
		
		System.out.println("Aluno:" + nomeDoAluno);
		System.out.println("Nota: " + nota);
	}

}
