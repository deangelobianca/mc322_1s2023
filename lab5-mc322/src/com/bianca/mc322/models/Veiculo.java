package com.bianca.mc322.models;

public class Veiculo {

	private String placa, marca, modelo;
	private Integer anoFabricacao;

	public Veiculo(String placa, String marca, String modelo, Integer anoFabricacao) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public String toString() {
		return "Veiculo [getPlaca()=" + getPlaca() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getAnoFabricacao()=" + getAnoFabricacao() + "]";
	}

}
