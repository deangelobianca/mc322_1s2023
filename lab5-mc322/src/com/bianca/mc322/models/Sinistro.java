package com.bianca.mc322.models;

import java.util.Date;
import java.util.Random;

import com.bianca.mc322.models.cliente.Cliente;

public class Sinistro {

	private final Integer id;
	private Date data;
	private String endereco;
	private Cliente condutor;
	private Seguradora seguradora;

	public Sinistro(Date data, String endereco, Cliente condutor, Seguradora seguradora) {
		this.id = new Random().nextInt(99);
		this.data = data;
		this.endereco = endereco;
		this.condutor = condutor;
		this.setSeguradora(seguradora);
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Cliente getCondutor() {
		return condutor;
	}

	public void setCondutor(Cliente condutor) {
		this.condutor = condutor;
	}

	public Integer getId() {
		return id;
	}

	public Seguradora getSeguradora() {
		return seguradora;
	}

	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}

	@Override
	public String toString() {
		return "Sinistro [getData()=" + getData() + ", getEndereco()=" + getEndereco() + ", getCondutor()="
				+ getCondutor() + ", getId()=" + getId() + ", getSeguradora()=" + getSeguradora() + "]";
	}

}
