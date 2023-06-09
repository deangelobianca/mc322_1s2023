package com.bianca.mc322.models.cliente;

import java.util.ArrayList;
import java.util.List;

import com.bianca.mc322.models.Seguradora;
import com.bianca.mc322.models.Sinistro;
import com.bianca.mc322.models.Veiculo;

public abstract class Cliente {

	private String nome, endereco;
	private List<Veiculo> listaVeiculos;
	private List<Sinistro> listaSinistros;
	private Seguradora seguradora;

	public Cliente(String nome, String endereco, Seguradora seguradora) {
		this.nome = nome;
		this.endereco = endereco;
		this.setSeguradora(seguradora);
		this.listaVeiculos = new ArrayList<>();
		this.listaSinistros = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Veiculo> getListaVeiculos() {
		return listaVeiculos;
	}

	public void setListaVeiculos(List<Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}

	public List<Sinistro> getListaSinistros() {
		return listaSinistros;
	}

	public void setListaSinistros(List<Sinistro> listaSinistros) {
		this.listaSinistros = listaSinistros;
	}

	public Seguradora getSeguradora() {
		return seguradora;
	}

	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}

	@Override
	public String toString() {
		return "Cliente [getNome()=" + getNome() + ", getEndereco()=" + getEndereco() + ", getListaVeiculos()="
				+ getListaVeiculos() + ", getListaSinistros()=" + getListaSinistros() + ", getSeguradora()="
				+ getSeguradora() + "]";
	}

}
