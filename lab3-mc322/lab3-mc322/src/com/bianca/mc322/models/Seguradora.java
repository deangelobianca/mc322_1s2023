package com.bianca.mc322.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Seguradora {

	private String nome, telefone, email, endereco;
	private List<Sinistro> listaSinistros;
	private List<Cliente> listaClientes;

	public Seguradora(String nome, String telefone, String email, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Boolean cadastrarCliente(Cliente cliente) {
		return this.listaClientes.add(cliente);
	}

	public boolean removerCliente(Cliente cliente) {
		return this.listaClientes.remove(cliente);
	}

	public List<Cliente> listarClientes(String tipoCliente) {
		List<Cliente> retorno = new ArrayList<>();
		if (tipoCliente.equalsIgnoreCase("PF")) {
			for (Cliente cliente : this.listaClientes) {
				if (cliente instanceof ClientePF)
					retorno.add(cliente);
			}
		}
		if (tipoCliente.equalsIgnoreCase("PJ")) {
			for (Cliente cliente : this.listaClientes) {
				if (cliente instanceof ClientePJ)
					retorno.add(cliente);
			}
		}
		return retorno;
	}

	public boolean gerarSinistro(Date data, String endereco, Cliente cliente, Veiculo veiculo, Seguradora seguradora) {
		return this.listaSinistros.add(new Sinistro(data, endereco, cliente, veiculo, this));
	}

	public void visualizarSinistro(Cliente cliente) {
		System.out.println("Exibindo sinistros do cliente: " + cliente.getNome());
		for (Sinistro sinistro : this.listaSinistros) {
			if (sinistro.getCliente() == cliente) {
				System.out.println("------------------------");
				System.out.println("ID: " + sinistro.getId());
				System.out.println("Endereço: " + sinistro.getEndereco());
				System.out.println("Data: " + sinistro.getData());
				System.out.println("Veículo: " + sinistro.getId());
				System.out.println("Seguradora: " + sinistro.getSeguradora().getNome());
			}
		}
	}

	public List<Sinistro> listarSinistros() {
		return this.listaSinistros;
	}

	public String toString() {
		return "Dados da seguradora - " + this.getNome() + "\n" + "Telefone: " + this.getTelefone() + "\n" + "E-mail: "
				+ this.getEmail() + "\n" + "Endereco: " + this.getEndereco();
	}

}
