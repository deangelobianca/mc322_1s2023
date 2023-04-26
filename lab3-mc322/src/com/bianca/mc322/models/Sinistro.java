package com.bianca.mc322.models;

import java.util.Date;
import java.util.Random;

public class Sinistro {

	private final Integer id;
	private String endereco;
	private Date data;
	private Cliente cliente;
	private Veiculo veiculo;
	private Seguradora seguradora;

	public Sinistro(Date data, String endereco, Cliente cliente, Veiculo veiculo, Seguradora seguradora) {
		// Gera um número aleatório entre 0 e 99, e atribui ao id
		this.id = new Random().nextInt(99);
		this.data = data;
		this.endereco = endereco;
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.seguradora = seguradora;
	}

	public Integer getId() {
		return id;
	}

// 	Método setId comentado pois na teoria não deve existir a possibilidade de editar o ID
	/*
	 * protected void setId(Integer id) { this.id = id; }
	 *
	 */
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Seguradora getSeguradora() {
		return seguradora;
	}

	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}

	public String toString() {
		return "Sinistro [id=" + id + ", endereco=" + endereco + ", data=" + data.toString() + ", cliente=" + cliente
				+ ", veiculo=" + veiculo + ", seguradora=" + seguradora + "]";
	}

	

}
