package com.loiane.estruturadados.pilha.teste;

import java.util.Stack;

public class Aula18Teste {

	public static void main(String[] args) {

		// Pilha<Integer> pilha = new Pilha<Integer>();

		Stack<Integer> stack = new Stack<Integer>();

		System.out.println(stack.isEmpty());// estaVazio

		stack.push(1);// empilha
		stack.push(2);
		stack.push(3);
		stack.push(4);

		System.out.println(stack.isEmpty());// estaVazio
		System.out.println(stack.size());// tamanho
		System.out.println(stack);// toString

		System.out.println(stack.peek());// espiar o elemento que está no topo da pilha - mesmo do método topo da classe
											// Pilha

		System.out.println(stack.pop());// desempilha
		System.out.println(stack);// toString
	}

}
