package com.loiane.estruturadados.pilha.exercicios;

import com.loiane.estruturadados.pilha.Pilha;

public class Exercicio05Pilha {

	public static void main(String[] args) {

		imprimeResultado("ADA");

		imprimeResultado("ABCD");

		imprimeResultado("ABCCBA");

		imprimeResultado("Maria");
	}

	public static void imprimeResultado(String palavra) {
		System.out.println(palavra + " � palindromo? " + testaPalindromo(palavra));
	}

	public static boolean testaPalindromo(String palavra) {

		Pilha<Character> pilha = new Pilha<Character>();

		for (int i = 0; i < palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));// Consigo obter determinado caracter da palavra de uma determinada posi��o
		}

		String palavraInversa = "";
		while (!pilha.estaVazia()) {
			palavraInversa += pilha.desempilha();
		}

		if (palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}

		return false;
	}
}
