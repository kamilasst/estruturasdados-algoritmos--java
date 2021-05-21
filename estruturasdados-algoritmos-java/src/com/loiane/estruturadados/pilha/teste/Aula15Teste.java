package com.loiane.estruturadados.pilha.teste;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula15Teste {

	public static void main(String[] args) {

		// Verificando se a pilha está vazia
		Pilha<Integer> pilha = new Pilha<Integer>();

		System.out.println(pilha.estaVazia());

		pilha.empilha(1);

		System.out.println(pilha.estaVazia());
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
	}
}
