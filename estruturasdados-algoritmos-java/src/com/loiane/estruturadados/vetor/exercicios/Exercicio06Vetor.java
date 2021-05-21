package com.loiane.estruturadados.vetor.exercicios;

import java.util.Locale;
import java.util.Scanner;

import com.loiane.estruturadados.negocio.Contato;
import com.loiane.estruturadados.vetor.Lista;

public class Exercicio06Vetor {

	public static void main(String[] args) {

		// Cria��o das vari�veis
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		// Criar vetor com 20 de capacidades
		Lista<Contato> lista = new Lista<Contato>(20);

		// Criar e adicionar 30 contatos
		criarContatosDinamicamente(5, lista);

		// Criar um menu para que o usu�rio escolha a op��o
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

			System.out.println("O usu�rio digitou 0, programa encerrado.");
		}
	}

	protected static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {

		Contato contato;

		for (int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("1111111" + i);
			contato.setEmail("Contato" + i + "@email.com");

			lista.adicionar(contato);
		}
	}

	private static void imprimirVetor(Lista<Contato> lista) {

		System.out.println(lista);
	}

	private static void limparVetor(Lista<Contato> lista) {

		lista.limpar();

		System.out.println("Todos os contatos do vetor foram exclu�dos");
	}

	private static void imprimeTamanhoVetor(Lista<Contato> lista) {

		System.out.println("Tamanho do vetor � de: " + lista.tamanho());
	}

	private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {

		int posicao = leInformacaoInt("Entre com a posi��o a ser removida:", scan);

		try {

			lista.remover(posicao);
			System.out.println("Contato exclu�do!");

		} catch (Exception e) {
			System.out.println("Posi��o Inv�lida!");
		}
	}

	private static void excluirContato(Scanner scan, Lista<Contato> lista) {

		int posicao = leInformacaoInt("Entre com a posi��o a ser removida:", scan);

		try {

			Contato contato = lista.buscar(posicao);

			lista.remover(contato);

			System.out.println("Contato exclu�do!");

		} catch (Exception e) {
			System.out.println("Posi��o Inv�lida!");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {

		int posicao = leInformacaoInt("Entre com a posi��o a ser pesquisada:", scan);

		try {
			Contato contato = lista.buscar(posicao);

			boolean existe = lista.contem(contato);

			if (existe) {
				System.out.println("Contato existe, seguem dados: ");
				System.out.println(contato);
			} else {
				System.out.println("Contato n�o existe!");
			}

		} catch (Exception e) {
			System.out.println("Posi��o Inv�lida!");
		}
	}

	private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {

		int posicao = leInformacaoInt("Entre com a posi��o a ser pesquisada:", scan);

		try {
			Contato contato = lista.buscar(posicao);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do ultimo �ndice do contato encontrado");
			posicao = lista.ultimoIndice(contato);

			System.out.println("Contato encontrado na posi��o " + posicao);

		} catch (Exception e) {
			System.out.println("Posi��o Inv�lida!");
		}
	}

	private static void obtemContato(Scanner scan, Lista<Contato> lista) {

		int posicao = leInformacaoInt("Entre com a posi��o a ser pesquisada:", scan);

		try {
			Contato contato = lista.buscar(posicao);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado");
			posicao = lista.buscar(contato);

			System.out.println("Contato encontrado na posi��o " + posicao);

		} catch (Exception e) {
			System.out.println("Posi��o Inv�lida!");
		}
	}

	private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {

		int posicao = leInformacaoInt("Entre com a posi��o a ser pesquisada:", scan);

		try {
			Contato contato = lista.buscar(posicao);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posi��o Inv�lida!");
		}
	}

	private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {

		System.out.println("Criando um contato. Entre com as informa��es:");
		String cpf = leInformacao("Entre com o cpf: ", scan);
		String nome = leInformacao("Entre com o nome: ", scan);
		String telefone = leInformacao("Entre com o telefone: ", scan);
		String email = leInformacao("Entre com o E-mail: ", scan);

		Contato contato = new Contato(cpf, nome, telefone, email);

		lista.adicionar(contato);

		System.out.println("Contato adicionado com sucesso.");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {

		System.out.println("Criando um contato. Entre com as informa��es:");
		String cpf = leInformacao("Entre com o cpf: ", scan);
		String nome = leInformacao("Entre com o nome:", scan);
		String telefone = leInformacao("Entre com o telefone:", scan);
		String email = leInformacao("Entre com o E-mail:", scan);

		Contato contato = new Contato(cpf, nome, telefone, email);

		int posicao = leInformacaoInt("Entre com a posi��o que deseja armazenar o contato: ", scan);

		try {
			lista.adicionar(posicao, contato);

			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("N�o adicionado.");
		}

		System.out.println("Contato adicionado com sucesso.");
		System.out.println(contato);
	}

	protected static String leInformacao(String msg, Scanner scan) {

		System.out.println(msg);
		String entrada = scan.nextLine();

		return entrada;
	}

	protected static int leInformacaoInt(String msg, Scanner scan) {

		boolean entradaValida = false;
		int num = 0;

		while (!entradaValida) {

			try {

				System.out.println(msg);
				String entrada = scan.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true;
			} catch (Exception e) {
				System.out.println("Entrada inv�lida. Digite novamente!");
			}
		}

		return num;
	}

	protected static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida) {

			System.out.println("Digite a op��o desejada:");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posi��o espec�fica");
			System.out.println("3: Obt�m contato de uma posi��o espec�fica");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta �ltimo �ndide do contato");
			System.out.println("6: Verifica se contato existe");
			System.out.println("7: Excluir por posi��o");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor");
			System.out.println("11: Imprime vetor");
			System.out.println("0: Sair");

			try {

				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}

			} catch (Exception e) {
				System.out.println("Entrada inv�lida, digite novamente!\n\n");
			}
		}
		return opcao;
	}

}
