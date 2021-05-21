package com.loiane.estruturadados.pilha.exercicios;

public class Exer05SemPilha {

	public static void main(String[] args) {

		imprimeInformacao("ama");

	}

	public static void imprimeInformacao(String palavra) {
		System.out.println("É palindromo? " + testaPolindromo(palavra));
	}

	private static boolean testaPolindromo(String palavra) {

		String palavraInversa = "";

		for (int i = palavra.length(); i > 0; i--) {

			char caracterPalavra = palavra.charAt(i - 1);

			palavraInversa += "" + caracterPalavra;
		}
		return palavra.equalsIgnoreCase(palavraInversa);

	}

}
