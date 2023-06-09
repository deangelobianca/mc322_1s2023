package com.bianca.mc322.models.seguro;

import java.util.Date;

import com.bianca.mc322.models.Condutor;
import com.bianca.mc322.models.Frota;
import com.bianca.mc322.models.cliente.ClientePJ;

public class SeguroPJ extends Seguro {

	private Frota frota;
	private ClientePJ cliente;

	public SeguroPJ(Frota frota, ClientePJ cliente) {
		this.frota = frota;
		this.cliente = cliente;
	}

	@Override
	Double calcularValor(Condutor condutor) {
		return (getValorBase() * (cliente.getQtdFuncionarios() / 10) * (1 + (1 / (cliente.getListaFrota().size() + 2))
				* (1 + (1 / ((double) new Date().getTime() + 2)) * (2 + (cliente.getListaSinistros().size() / 10)
						* (5 + (condutor.getListaSinistros().size() / 10))))));
	}

	public Frota getFrota() {
		return frota;
	}

	public void setFrota(Frota frota) {
		this.frota = frota;
	}

	public ClientePJ getCliente() {
		return cliente;
	}

	public void setCliente(ClientePJ cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "SeguroPJ [getFrota()=" + getFrota() + ", getCliente()=" + getCliente() + "]";
	}

}
