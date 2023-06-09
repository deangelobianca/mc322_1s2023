package com.bianca.mc322.models;

import java.util.ArrayList;
import java.util.Date;

public class Condutor {

	private final String cpf = "";
	private String nome, telefone, endereco, email;
	private Date dataNasc;
	private ArrayList<Sinistro> listaSinistros;

	public Condutor(String nome, String telefone, String endereco, String email, Date dataNasc,
			ArrayList<Sinistro> listaSinistros) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.dataNasc = dataNasc;
		this.listaSinistros = listaSinistros;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public ArrayList<Sinistro> getListaSinistros() {
		return listaSinistros;
	}

	public void setListaSinistros(ArrayList<Sinistro> listaSinistros) {
		this.listaSinistros = listaSinistros;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "Condutor [getNome()=" + getNome() + ", getTelefone()=" + getTelefone() + ", getEndereco()="
				+ getEndereco() + ", getEmail()=" + getEmail() + ", getDataNasc()=" + getDataNasc()
				+ ", getListaSinistros()=" + getListaSinistros() + ", getCpf()=" + getCpf() + "]";
	}

}
