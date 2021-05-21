package com.loiane.estruturadados.vetor;

import java.lang.reflect.Array;

//Definindo o tipo de vetor dinamicamente
/* <> � conhecido como operador "diamond"(diamante). 
O T significa o class Tipe (Tipo da classe)*/

public class Lista<T> {

	// Generalizando o tipo dos elementos - Trocou String por Object
	private T[] elementos;
	private int tamanho;

	// primeira op��o
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	// segunda op��o
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}

	public boolean adicionar(T elemento) {
		this.aumentarCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	// 0 1 2 3 4 5 6 = tamanho � 5
	// B C E F G + +
	//
	public boolean adicionar(int posicao, T elemento) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}

		this.aumentarCapacidade();

		// mover todos os elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	private void aumentarCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public T obtem(int posicao) {
		return this.buscar(posicao);
	}

	public T buscar(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		return this.elementos[posicao];
	}

	public int buscar(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			Object espElemento = this.elementos[i];
			if (espElemento != null) {
				if (this.elementos[i].equals(elemento)) {
					return i;
				}
			}
		}
		return -1;
	}

	public int ultimoIndice(T elemento) {

		for (int i = this.tamanho - 1; i >= 0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	/*
	 * Exerc�cio 01 - Implementando o m�todo cont�m, semelhante ao m�todo contains
	 * da classe ArrayList
	 */
	public boolean contem(T elemento) {

		/*
		 * int pos = busca(elemento); if (pos > -1) { return true; } return false;
		 */

		return buscar(elemento) > -1; // >= 0;
	}

	// B D E F F -> posi��o a ser removida � 1 (G)
	// 0 1 2 3 4 -> tamanho � 5
	// vetor[1] = vetor[2]
	// vetor[2] = vetor[3]
	// vetor[3] = vetor[4]
	public void remover(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		this.elementos[posicao] = null;
		this.tamanho--;

		T[] outroElemento = (T[]) new Object[tamanho];
		int index = 0;
		for (int i = 0; i < elementos.length; i++) {
			if (this.elementos[i] != null) {
				outroElemento[index] = this.elementos[i];
				index++;
			}
		}
		this.elementos = outroElemento;
	}

	/*
	 * Exercicio 03 - Implementando o m�todo (T elemento), onde ser� poss�vel
	 * remover um elemento da lista passando o mesmo como par�metro
	 */
	public void remover(T elemento) {

		int posicao = this.buscar(elemento);
		if (posicao > -1) {
			this.remover(posicao);
		}
	}

	/* Exerc�cio 04 - Criar m�todo limpar para limpar todos os elementos */
	public void limpar() {

		// op��o 01
		// this.elementos = (T[]) new Object[this.elementos.length];

		// op��o 02
		for (int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i <= this.tamanho - 1; i++) {
			if (this.elementos[i] != null) {
				s.append(this.elementos[i]);

			}

			if (i != this.tamanho - 1) {
				s.append(", ");
			}
		}
		s.append("]");

		return s.toString();
	}
}
