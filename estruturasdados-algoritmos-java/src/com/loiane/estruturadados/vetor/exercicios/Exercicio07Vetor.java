package com.loiane.estruturadados.vetor.exercicios;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import com.loiane.estruturadados.negocio.Contato;

public class Exercicio07Vetor extends Exercicio06Vetor {

	public static void main(String[] args) {

		// Criação das variáveis
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		// Criar vetor com 20 de capacidades
		ArrayList<Contato> lista = new ArrayList<Contato>(20);

		// Criar e adicionar 30 contatos
		criarContatosDinamicamente(5, lista);

		// Criar um menu para que o usuário escolha a opção
		int opcao = 1;

		while (opcao != 0) {

			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			case 1:
				adicionarContatoFinal(scan, lista);
				break;
			case 2:
				adicionarContatoPosicao(scan, lista);
				break;
			case 3:
				obtemContatoPosicao(scan, lista);
				break;
			case 4:
				obtemContato(scan, lista);
				break;
			case 5:
				pesquisarUltimoIndice(scan, lista);
				break;
			case 6:
				pesquisarContatoExiste(scan, lista);
				break;
			case 7:
				excluirPorPosicao(scan, lista);
				break;
			case 8:
				excluirContato(scan, lista);
				break;
			case 9:
				imprimeTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;
			}

		}
		System.out.println("O usuário digitou 0, programa encerrado.");
	}

	private static void imprimirVetor(ArrayList<Contato> lista) {

		System.out.println(lista);
	}

	private static void limparVetor(ArrayList<Contato> lista) {

		lista.clear();

		System.out.println("Todos os contatos do vetor foram excluídos");
	}

	private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {

		System.out.println("Tamanho do vetor é de: " + lista.size());
	}

	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista) {

		int posicao = leInformacaoInt("Entre com a posição a ser removida:", scan);

		try {

			lista.remove(posicao);
			System.out.println("Contato excluído!");

		} catch (Exception e) {
			System.out.println("Posição Inválida!");
		}
	}

	private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {

		int posicao = leInformacaoInt("Entre com a posição a ser removida:", scan);

		try {

			Contato contato = lista.get(posicao);

			lista.remove(contato);

			System.out.println("Contato excluído!");

		} catch (Exception e) {
			System.out.println("Posição Inválida!");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {

		int posicao = leInformacaoInt("Entre com a posição a ser pesquisada:", scan);

		try {
			Contato contato = lista.get(posicao);

			boolean existe = lista.contains(contato);

			if (existe) {
				System.out.println("Contato existe, seguem dados: ");
				System.out.println(contato);
			} else {
				System.out.println("Contato não existe!");
			}

		} catch (Exception e) {
			System.out.println("Posição Inválida!");
		}
	}

	private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {

		int posicao = leInformacaoInt("Entre com a posição a ser pesquisada:", scan);

		try {
			Contato contato = lista.get(posicao);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do ultimo índice do contato encontrado");
			posicao = lista.lastIndexOf(contato);

			System.out.println("Contato encontrado na posição " + posicao);

		} catch (Exception e) {
			System.out.println("Posição Inválida!");
		}
	}

	private static void obtemContato(Scanner scan, ArrayList<Contato> lista) {

		int posicao = leInformacaoInt("Entre com a posição a ser pesquisada:", scan);

		try {
			Contato contato = lista.get(posicao);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado");
			posicao = lista.indexOf(contato);

			System.out.println("Contato encotrado na posicação " + posicao);

		} catch (Exception e) {
			System.out.println("Posição Inválida!");
		}
	}

	private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

		int posicao = leInformacaoInt("Entre com a posição a ser pesquisada:", scan);

		try {
			Contato contato = lista.get(posicao);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posição Inválida!");
		}
	}

	private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {

		System.out.println("Criando um contato. Entre com as informações:");
		String cpf = leInformacao("Entre com o cpf: ", scan);
		String nome = leInformacao("Entre com o nome: ", scan);
		String telefone = leInformacao("Entre com o telefone: ", scan);
		String email = leInformacao("Entre com o E-mail: ", scan);

		Contato contato = new Contato(cpf, nome, telefone, email);

		lista.add(contato);

		System.out.println("Contato adicionado com sucesso.");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

		System.out.println("Criando um contato. Entre com as informações:");
		String cpf = leInformacao("Entre com o cpf: ", scan);
		String nome = leInformacao("Entre com o nome:", scan);
		String telefone = leInformacao("Entre com o telefone:", scan);
		String email = leInformacao("Entre com o E-mail:", scan);

		Contato contato = new Contato(cpf, nome, telefone, email);

		int posicao = leInformacaoInt("Entre com a posição que deseja armazenar o contato: ", scan);

		try {
			lista.add(posicao, contato);

			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Não adicionado.");
		}

		System.out.println("Contato adicionado com sucesso.");
		System.out.println(contato);
	}

	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {

		Contato contato;

		for (int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("1111111" + i);
			contato.setEmail("Contato" + i + "@email.com");

			lista.add(contato);
		}
	}

}
