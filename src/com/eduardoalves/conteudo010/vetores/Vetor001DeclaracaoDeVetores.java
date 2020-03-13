package com.eduardoalves.conteudo010.vetores;

public class Vetor001DeclaracaoDeVetores {

	public static void main(String[] args) {
	
		//Vendas do mês de janeiro de 2020 declarado no vetor
		//Delaração do vetor==>>[31]==>>reserva 31 espaços na memória do computador
		double[] vendasJaneiro2020 = new double[31];
		vendasJaneiro2020[0] = 432.03;
		vendasJaneiro2020[1] = 568.02;
		vendasJaneiro2020[2] = 600.99;
		vendasJaneiro2020[3] = 1429.59;
		vendasJaneiro2020[4] = 1291.10;
		vendasJaneiro2020[5] = 563.87;
		
		//Tamanho do array==>>propriedade length
		System.out.println("Tamanho do array==>>" + vendasJaneiro2020.length + " posições");
		
		for(int i=0; i<vendasJaneiro2020.length; i++) {
			
			System.out.println("Vendas do dia " + (i+1) + " R$ " + vendasJaneiro2020[i]);
		}
			
			System.out.println(" ");
			System.out.println("for melhorado, não tem acesso ao índice(contador)");
			for (double vendas : vendasJaneiro2020) {
				System.out.println(vendas);
		}
	}
}

