package com.eduardoalves.conteudo010.vetores;

public class Vetor001DeclaracaoDeVetores {

	public static void main(String[] args) {
	
		//Vendas do m�s de janeiro de 2020 declarado no vetor
		//Delara��o do vetor==>>[31]==>>reserva 31 espa�os na mem�ria do computador
		double[] vendasJaneiro2020 = new double[31];
		vendasJaneiro2020[0] = 432.03;
		vendasJaneiro2020[1] = 568.02;
		vendasJaneiro2020[2] = 600.99;
		vendasJaneiro2020[3] = 1429.59;
		vendasJaneiro2020[4] = 1291.10;
		vendasJaneiro2020[5] = 563.87;
		
		//Tamanho do array==>>propriedade length
		System.out.println("Tamanho do array==>>" + vendasJaneiro2020.length + " posi��es");
		
		for(int i=0; i<vendasJaneiro2020.length; i++) {
			
			System.out.println("Vendas do dia " + (i+1) + " R$ " + vendasJaneiro2020[i]);
		}
			
			System.out.println(" ");
			System.out.println("for melhorado, n�o tem acesso ao �ndice(contador)");
			for (double vendas : vendasJaneiro2020) {
				System.out.println(vendas);
		}
	}
}

