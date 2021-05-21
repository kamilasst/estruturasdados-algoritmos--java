package com.loiane.estruturadados.vetor;

public class VetorObjetos {

	// Generalizando o tipo dos elementos - Trocou String por Object
	private Object[] elementos;
	private int tamanho;

	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}

	public boolean adicionar(Object elemento) {
		this.aumentarCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	// 0 1 2 3 4 5 6 = tamanho é 5
	// B C E F G + +
	//
	public boolean adicionar(int posicao, Object elemento) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
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
			Object[] elementosNovos = new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public Object buscar(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}

	public int buscar(Object elemento) {
		for (int i = 0; i < this.tamanho; i++) {

			Object contato = this.elementos[i];
			if (contato.equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	// B D E F F -> posição a ser removida é 1 (G)
	// 0 1 2 3 4 -> tamanho é 5
	// vetor[1] = vetor[2]
	// vetor[2] = vetor[3]
	// vetor[3] = vetor[4]
	public void remover(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}
}
