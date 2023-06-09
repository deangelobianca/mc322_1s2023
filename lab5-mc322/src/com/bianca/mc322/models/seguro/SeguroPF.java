package com.bianca.mc322.models.seguro;

import com.bianca.mc322.models.Condutor;
import com.bianca.mc322.models.Veiculo;
import com.bianca.mc322.models.cliente.ClientePF;

public class SeguroPF extends Seguro {

	private Veiculo veiculo;
	private ClientePF cliente;

	public SeguroPF(Veiculo veiculo, ClientePF cliente) {
		this.veiculo = veiculo;
		this.cliente = cliente;
	}

	@Override
	Double calcularValor(Condutor condutor) {
		return (getValorBase() * getFatorIdade() * (1 + (1 / (getCliente().getListaVeiculos().size() + 2)) * (2
				+ (getCliente().getListaSinistros().size() / 10) * (5 + (condutor.getListaSinistros().size() / 10)))));
	}

	private Double getFatorIdade() {
		Double retorno = 0.0;
		int idade = getCliente().getIdade();

		if (idade < 30)
			retorno = 1.25;
		if (idade >= 30 && idade <= 60)
			retorno = 1.0;
		if (idade > 60)
			retorno = 1.5;

		return retorno;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public ClientePF getCliente() {
		return cliente;
	}

	public void setCliente(ClientePF cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "SeguroPF [getFatorIdade()=" + getFatorIdade() + ", getVeiculo()=" + getVeiculo() + ", getCliente()="
				+ getCliente() + "]";
	}

}
