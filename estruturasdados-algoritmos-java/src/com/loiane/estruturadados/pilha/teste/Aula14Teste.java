package com.loiane.estruturadados.pilha.teste;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula14Teste {

	// Empilhando elemento
	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();

		for (int i = 1; i <= 10; i++) {
			pilha.empilha(i);
		}

		System.out.println(pilha);
		System.out.println(pilha.tamanho());
	}
}
