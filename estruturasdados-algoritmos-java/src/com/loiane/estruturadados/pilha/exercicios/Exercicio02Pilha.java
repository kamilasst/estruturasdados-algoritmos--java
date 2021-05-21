package com.loiane.estruturadados.pilha.exercicios;

import java.util.Locale;
import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

public class Exercicio02Pilha {

	public static void main(String[] args) {

		Pilha<Integer> pilhaPar = new Pilha<Integer>();
		Pilha<Integer> pilhaImpar = new Pilha<Integer>();

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		for (int i = 0; i <= 10; i++) {
			System.out.println("Entre com um número:");

			int num = scan.nextInt();

			if (num == 0) {

				// Pilha par
				Integer desempilhado = pilhaPar.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha par vazia");
				} else {
					System.out.println("Desempilhando na pilha par - " + desempilhado);
				}

				// Pilha ímpar
				desempilhado = pilhaImpar.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha ímpar vazia");
				} else {
					System.out.println("Desempilhando na pilha ímpar - " + desempilhado);
				}

			} else if (num % 2 == 0) {
				System.out.println("Número par. Empilhando na pilha par - " + num);
				pilhaPar.empilha(num);
			} else if (num % 2 != 0) {
				System.out.println("Número ímpar. Empilhando na pilha ímpar - " + num);
				pilhaImpar.empilha(num);
			}
		}

		System.out.println("Desempilhando todos os números da pilha par");

		while (!pilhaPar.estaVazia()) {
			System.out.println("Desempilhando na pilha par: " + pilhaPar.desempilha());
		}
		while (!pilhaImpar.estaVazia()) {
			System.out.println("Desempilhando na pilha impar: " + pilhaImpar.desempilha());
		}
		scan.close();
	}
}
