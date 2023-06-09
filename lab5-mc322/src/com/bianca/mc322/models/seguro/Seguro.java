package com.bianca.mc322.models.seguro;

import java.util.ArrayList;
import java.util.Date;

import com.bianca.mc322.models.Condutor;
import com.bianca.mc322.models.Seguradora;
import com.bianca.mc322.models.Sinistro;
import com.bianca.mc322.models.cliente.Cliente;

public abstract class Seguro {

	private final int id = 0, valorBase = 10;
	private Date dataInicio, dataFim;
	private Seguradora seguradora;
	private ArrayList<Sinistro> listaSinistros;
	private ArrayList<Condutor> listaCondutores;
	private int valorMensal;
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Seguradora getSeguradora() {
		return seguradora;
	}

	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}

	public ArrayList<Sinistro> getListaSinistros() {
		return listaSinistros;
	}

	public void setListaSinistros(ArrayList<Sinistro> listaSinistros) {
		this.listaSinistros = listaSinistros;
	}

	public ArrayList<Condutor> getListaCondutores() {
		return listaCondutores;
	}

	public void setListaCondutores(ArrayList<Condutor> listaCondutores) {
		this.listaCondutores = listaCondutores;
	}

	public int getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(int valorMensal) {
		this.valorMensal = valorMensal;
	}

	public int getId() {
		return id;
	}
	
	public void desautorizarCondutor(Condutor condutor) {
		getListaCondutores().remove(condutor);
	}
	
	public void autorizarCondutor(Condutor condutor) {
		getListaCondutores().add(condutor);
	}
	
	abstract Double calcularValor(Condutor condutor);

	public int getValorBase() {
		return valorBase;
	}

	@Override
	public String toString() {
		return "Seguro [id=" + id + ", valorBase=" + valorBase + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim
				+ ", seguradora=" + seguradora + ", listaSinistros=" + listaSinistros + ", listaCondutores="
				+ listaCondutores + ", valorMensal=" + valorMensal + ", cliente=" + cliente + "]";
	}
	
	

}
