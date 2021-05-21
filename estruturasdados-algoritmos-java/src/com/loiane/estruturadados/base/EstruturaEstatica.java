package com.loiane.estruturadados.base;

public class EstruturaEstatica<T> {

	protected T[] elementos;
	protected int tamanho;

	@SuppressWarnings("unchecked")
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public EstruturaEstatica() {
		this(10);
	}

	public boolean estaVazia() {
		return this.tamanho == 0;
	}

	protected boolean adicionar(T elemento) {
		this.aumentarCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	protected boolean adicionar(int posicao, T elemento) {

		if (posicao < 0 || posicao > tamanho) {
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

	@SuppressWarnings("unchecked")
	private void aumentarCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	protected void remover(int posicao) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o Inv�lida!");
		}
		for (int i = posicao; i < tamanho - 1; i++) {
			elementos[i] = elementos[i + 1];
		}
		tamanho--;
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
