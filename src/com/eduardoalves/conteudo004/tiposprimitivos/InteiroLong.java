package com.eduardoalves.conteudo004.tiposprimitivos;

public class InteiroLong {

	public static void main(String[] args) {
		//long==>>tamanho = 64 bits - intervalo de valores = -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
		
		long tipoLong1 = -9223372036854775808l;//O tipo long exige o literal, 'L' ou 'l', ao final do número
		long tipoLong2 = 9223372036854775807L;
		
		System.out.println("Aceita valores no intervalo aberto entre " + tipoLong1 + " e " + tipoLong2);
	}
}