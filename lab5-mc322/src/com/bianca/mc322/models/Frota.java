package com.bianca.mc322.models;

import java.util.ArrayList;
import java.util.List;

public class Frota {
	private String code;
	private List<Veiculo> listaVeiculos;

	public Frota(String code, List<Veiculo> listaVeiculos) {
		this.code = code;
		this.listaVeiculos = new ArrayList<Veiculo>();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Veiculo> getListaVeiculos() {
		return listaVeiculos;
	}

	public void setListaVeiculos(List<Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}

	public void addVeiculo(Veiculo veiculo) {
		getListaVeiculos().add(veiculo);
	}

	public void removeVeiculo(Veiculo veiculo) {
		getListaVeiculos().remove(veiculo);
	}

	@Override
	public String toString() {
		return "Frota [code=" + code + ", listaVeiculos=" + listaVeiculos + "]";
	}

}
