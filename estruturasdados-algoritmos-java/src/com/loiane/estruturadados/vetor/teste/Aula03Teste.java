package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula03Teste {

	public static void main(String[] args) {

		// Adicionar elemento final do vetor
		Vetor vetor = new Vetor(2);
//		try {
//			vetor.adiciona("Elemento 1");
//			vetor.adiciona("Elemento 2");
//			vetor.adiciona("Elemento 3");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		vetor.adicionar("Elemento 1");
		vetor.adicionar("Elemento 2");
		vetor.adicionar("Elemento 3");

	}
}
