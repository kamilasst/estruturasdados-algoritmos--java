package com.loiane.estruturadados.pilha.exercicios;

import java.util.Stack;

public class Exercicio08Pilha {

	public static void main(String[] args) {

		Stack<Integer> original = new Stack<Integer>();
		Stack<Integer> destino = new Stack<Integer>();
		Stack<Integer> auxiliar = new Stack<Integer>();

		original.push(3);
		original.push(2);
		original.push(1);

		torreDeHanoi(original.size(), original, destino, auxiliar);
	}

	public static void torreDeHanoi(int n, Stack<Integer> original, Stack<Integer> destino, Stack<Integer> auxiliar) {

		if (n > 0) {
			torreDeHanoi(n - 1, original, auxiliar, destino);
			destino.push(original.pop());
			System.out.println("------");
			System.out.println("Original: " + original);
			System.out.println("Destino: " + destino);
			System.out.println("Aux: " + auxiliar);
			torreDeHanoi(n - 1, auxiliar, destino, original);
		}
	}
}
