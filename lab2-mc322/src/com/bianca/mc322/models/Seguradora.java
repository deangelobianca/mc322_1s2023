package com.bianca.mc322.models;

public class Seguradora {

	private String nome, telefone, email, endereco;

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

	public String toString() {
		return "Dados da seguradora - " + this.getNome() + "\n" + "Telefone: " + this.getTelefone() + "\n" + "E-mail: "
				+ this.getEmail() + "\n" + "Endereco: " + this.getEndereco();
	}

}
