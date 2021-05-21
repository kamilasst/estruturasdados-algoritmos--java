package com.loiane.estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	// Adicionar elemento final do vetor - op��o 1
	/*
	 * public void adiciona(String elemento) {
	 * 
	 * for (int i = 0; i < this.elementos.length; i++) { if (this.elementos[i] ==
	 * null) { this.elementos[i] = elemento; break; } } }
	 */

	/*
	 * public void adiciona(String elemento) throws Exception {
	 * 
	 * if (this.tamanho < this.elementos.length) { this.elementos[this.tamanho] =
	 * elemento; this.tamanho++; } else { throw new
	 * Exception("Vetor j� est� cheio, n�o � poss�vel adicionar mais elementos"); }
	 * }
	 */

	public boolean adicionar(String elemento) {

		this.aumentaCapacidade();

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	// Adicionando elemento em qualquer posi��o
	// 0 1 2 3 4 5 6 = tamanho � 5
	// B C D E F x x
	//
	public boolean adicionar(int posicao, String elemento) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}

		this.aumentaCapacidade();

		// Mover todos os elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		// Atribuindo o elemento a posi��o desejada
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	// Adicionando mais capacidade ao vetor
	private void aumentaCapacidade() {

		if (this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	// Obtendo elemento de uma posi��o
	public String buscar(int posicao) {

		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}
		return this.elementos[posicao];
	}

	// Verificando se o elemento existe dento do vetor
	public int buscar(String elemento) {

		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	// Removendo elemento do vetor
	// B G D E F -> Posi��o a ser removida � 1 (G);
	// 0 1 2 3 4 -> Tamanho � 5
	// vetor[1] = vetor[2]
	// vetor[2] = vetor[3]
	// vetor[3] = vetor[4]
	public void remover(int posicao) {

		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

	public void remover(String valor) {

		int posicao = buscar(valor);

		if (posicao > -1) {
			remover(posicao);
		} else {
			throw new IllegalArgumentException("Valor n�o existe");
		}

	}

	// Verificando quantidade de elementos no vetor
	public int getTamanho() {
		return this.tamanho;
	}

	// Imprimindo elementos do vetor
	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i <= this.tamanho - 1; i++) {
			s.append(this.elementos[i]);

			if (i != this.tamanho - 1) {
				s.append(", ");
			}
		}
		s.append("]");

		return s.toString();
	}

}
