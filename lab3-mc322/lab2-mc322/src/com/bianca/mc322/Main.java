package com.bianca.mc322;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.bianca.mc322.models.Cliente;
import com.bianca.mc322.models.ClientePF;
import com.bianca.mc322.models.ClientePJ;
import com.bianca.mc322.models.Seguradora;
import com.bianca.mc322.models.Sinistro;
import com.bianca.mc322.models.Veiculo;

public class Main {

	private static List<Veiculo> veiculos = new ArrayList<>();
	private static List<Cliente> clientes = new ArrayList<>();
	private static List<Sinistro> sinistros = new ArrayList<>();
	private static List<Seguradora> seguradoras = new ArrayList<>();

	public static void printMenu(String[] options) {
		for (String option : options) {
			System.out.println(option);
		}
	}

	public static void main(String[] args) throws ParseException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		String[] menuInicial = { "1- Cadastrar seguradora", "2- Acessar seguradora", "3- Cadastrar cliente",
				"4- Cadastrar veiculo", "5- Cadastrar sinistro", "6- Listar veiculos", "7- Listar clientes",
				"8- Encerrar", };

		int option;
		while (true) {
			System.out.println("---------------------");
			printMenu(menuInicial);
			option = keyboard.nextInt();

			switch (option) {
			case 1:
				seguradoras.add(gerarSeguradora());
				break;
			case 2:
				System.out.println(menuSeguradora().toString());
				break;
			case 3:
				clientes.add(gerarCliente());
				break;
			case 4:
				veiculos.add(gerarVeiculo());
				break;
			case 5:
				sinistros.add(menuSinistro());
				break;
			case 6:
				System.out.println(menuVeiculo().toString());
				break;
			case 7:
				System.out.println(menuCliente().toString());
				break;
			case 8:
				System.exit(0);
			default:
				break;
			}
		}
	}

	private static Sinistro menuSinistro() throws ParseException {
		System.out.println("-> Cadastro de sinistro");
		Cliente cliente = menuCliente();
		Veiculo veiculo = menuVeiculo();
		Seguradora seguradora = menuSeguradora();
		return gerarSinistro(cliente, veiculo, seguradora);
	}

	private static Veiculo menuVeiculo() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Escolha um veiculo:");
		for (int i = 0; i < veiculos.size(); i++) {
			System.out.println((i + 1) + "- " + veiculos.get(i).getPlaca() + " / " + veiculos.get(i).getModelo());
		}

		return veiculos.get((keyboard.nextInt() - 1));
	}

	private static Cliente menuCliente() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Escolha um cliente:");
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println((i + 1) + "- " + clientes.get(i).getNome());
		}

		return clientes.get((keyboard.nextInt() - 1));
	}

	private static Cliente gerarCliente() throws ParseException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int clienteType;
		Cliente ret = null;
		while (true) {
			System.out.println("Escolha o tipo de cliente:\n1- PF\n2- PJ");
			clienteType = keyboard.nextInt();

			switch (clienteType) {
			case 1:
				ret = gerarClientePF();

				break;
			case 2:
				ret = gerarClientePJ();

				break;
			default:
				break;
			}
			break;
		}
		return ret;
	}

	private static Seguradora menuSeguradora() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		Seguradora seg = null;
		Integer index;
		System.out.println("Selecione uma seguradora:");
		while (true) {
			for (int i = 0; i < seguradoras.size(); i++) {
				System.out.println((i + 1) + "- " + seguradoras.get(i).getNome());
			}
			System.out.println((seguradoras.size() + 1) + "- Encerrar");
			
			index = keyboard.nextInt();
			if (index != (seguradoras.size() + 1)) {
				seg = seguradoras.get(index - 1);
			} else {
				break;
			}
			break;
		}

		return seg;
	}

	private static Seguradora gerarSeguradora() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println("Insira os seguintes dados da sua seguradora");

		System.out.println("Nome:");
		String nomeSeguradora = keyboard.nextLine();

		System.out.println("Telefone:");
		String telefoneSeguradora = keyboard.nextLine();

		System.out.println("E-mail:");
		String emailSeguradora = keyboard.nextLine();

		System.out.println("Endereco:");
		String enderecoSeguradora = keyboard.nextLine();

		return new Seguradora(nomeSeguradora, telefoneSeguradora, emailSeguradora, enderecoSeguradora);
	}

	private static Cliente gerarClientePF() throws ParseException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println("Insira os seguintes dados do cliente PF:");

		String CPF;

		while (true) {
			System.out.println("CPF:");
			CPF = keyboard.nextLine();
			if (ClientePF.validarCPF(CPF))
				break;
			else
				System.out.println("CPF invalido.");
		}

		System.out.println("Data de nascimento (dd/MM/yyyy):");
		Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(keyboard.nextLine());

		System.out.println("Nome:");
		String nomeClientePF = keyboard.nextLine();

		System.out.println("Endereco:");
		String enderecoClientePF = keyboard.nextLine();

		System.out.println("Nivel educacional:");
		String educacaoClientePF = keyboard.nextLine();

		System.out.println("Genero:");
		String generoClientePF = keyboard.nextLine();

		System.out.println("Classe economica:");
		String classeEcononomicaClientePF = keyboard.nextLine();

		System.out.println("Data da licenca (dd/MM/yyyy):");
		Date dataLicenca = new SimpleDateFormat("dd/MM/yyyy").parse(keyboard.nextLine());

		return new ClientePF(CPF, dataNascimento, nomeClientePF, enderecoClientePF, educacaoClientePF, generoClientePF,
				classeEcononomicaClientePF, dataLicenca, null);
	}

	private static Cliente gerarClientePJ() throws ParseException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println("Insira os seguintes dados do cliente PJ:");

		String CNPJ;
		while (true) {
			System.out.println("CNPJ:");
			CNPJ = keyboard.nextLine();
			if (ClientePJ.validarCNPJ(CNPJ))
				break;
			else
				System.out.println("CNPJ invalido.");
		}

		System.out.println("Data de fundacao (dd/MM/yyyy):");
		Date dataFundacao = new SimpleDateFormat("dd/MM/yyyy").parse(keyboard.nextLine());

		System.out.println("Nome:");
		String nomeClientePJ = keyboard.nextLine();

		System.out.println("Endereco:");
		String enderecoClientePJ = keyboard.nextLine();

		return new ClientePJ(CNPJ, dataFundacao, nomeClientePJ, enderecoClientePJ, null);
	}

	private static Veiculo gerarVeiculo() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		System.out.println("-----------------------------------");
		System.out.println("Insira os seguintes dados do veiculo:");
		String placaVeiculo = "", marcaVeiculo = "", modeloVeiculo = "", anoFabricacaoVeiculo = "";

		System.out.println("Placa:");
		placaVeiculo = keyboard.nextLine();

		System.out.println("Marca:");
		marcaVeiculo = keyboard.nextLine();

		System.out.println("Modelo:");
		modeloVeiculo = keyboard.nextLine();

		System.out.println("Ano de fabricacao:");
		anoFabricacaoVeiculo = keyboard.nextLine();

		return new Veiculo(placaVeiculo, marcaVeiculo, modeloVeiculo, Integer.valueOf(anoFabricacaoVeiculo));
	}

	private static Sinistro gerarSinistro(Cliente cliente, Veiculo veiculo, Seguradora seguradora)
			throws ParseException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println("Insira os seguintes dados do sinistro:");

		System.out.println("Data (dd/MM/yyyy):");
		Date dataSinistro = new SimpleDateFormat("dd/MM/yyyy").parse(keyboard.nextLine());

		System.out.println("Endereco:");
		String enderecoSinistro = keyboard.nextLine();

		return new Sinistro(dataSinistro, enderecoSinistro, cliente, veiculo, seguradora);
	}

}
