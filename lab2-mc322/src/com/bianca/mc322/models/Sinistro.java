package com.bianca.mc322.models;

import java.util.Random;

public class Sinistro {

	private Integer id;
	private String data, endereco;

	public Sinistro(String data, String endereco) {
		// Gera um número aleatório entre 0 e 99, e atribui ao id
		this.id = new Random().nextInt(99);
		this.data = data;
		this.endereco = endereco;
	}

	public Integer getId() {
		return id;
	}

// 	Método setId comentado pois na teoria não deve existir a possibilidade de editar o ID
/*	
 * protected void setId(Integer id) {
 *		this.id = id;
 *	}
 *
*/
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String toString() {
		return "Dados do sinistro - ID " + this.getId() + "\n" + "Data: " + this.getData() + "\n" + "Endereco: "
				+ this.getEndereco();
	}

}
