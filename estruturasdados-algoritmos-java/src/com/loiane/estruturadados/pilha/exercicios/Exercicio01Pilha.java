package com.loiane.estruturadados.pilha.exercicios;

import java.util.Locale;
import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

public class Exercicio01Pilha {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		for (int i = 0; i <= 10; i++) {
			System.out.println("Entre com um n�mero:");

			int num = scan.nextInt();

			if (num % 2 == 0) {

				System.out.println("Empilhando o n�mero: " + num);
				pilha.empilha(num);
			} else {

				Integer desempilhado = pilha.desempilha();

				if (desempilhado == null) {
					System.out.println("A pilha est� vazia.");
				} else {
					System.out.println("N�mero �mpar. Desempilhando um elemento da pilha: " + desempilhado);
				}
			}
		}
		System.out.println("Todos os n�meros foram lidos. Desempilhando n�meros da pilha.");

		while (!pilha.estaVazia()) {

			System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
		}
		System.out.println("Todos os elementos foram desempilhados.");

		scan.close();
	}

}
