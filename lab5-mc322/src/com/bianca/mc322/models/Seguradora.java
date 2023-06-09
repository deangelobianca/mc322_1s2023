package com.bianca.mc322.models;

import java.util.ArrayList;
import java.util.List;

import com.bianca.mc322.models.cliente.Cliente;
import com.bianca.mc322.models.cliente.ClientePF;
import com.bianca.mc322.models.cliente.ClientePJ;
import com.bianca.mc322.models.seguro.Seguro;
import com.bianca.mc322.models.seguro.SeguroPF;
import com.bianca.mc322.models.seguro.SeguroPJ;

public class Seguradora {

	private String nome, telefone, email, endereco;
	private List<Seguro> listaSeguros;
	private List<Cliente> listaClientes;

	public Seguradora(String nome, String telefone, String email, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.listaSeguros = new ArrayList<>();
		this.listaClientes = new ArrayList<>();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Seguro> getListaSeguros() {
		return listaSeguros;
	}

	public void setListaSeguros(List<Seguro> listaSeguros) {
		this.listaSeguros = listaSeguros;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public List<Cliente> listarClientes(String tipoCliente) {
		List<Cliente> retorno = new ArrayList<>();
		if (tipoCliente.equalsIgnoreCase("PF")) {
			for (Cliente cliente : this.listaClientes) {
				if (cliente instanceof ClientePF)
					retorno.add(cliente);
			}
		}
		if (tipoCliente.equalsIgnoreCase("PJ")) {
			for (Cliente cliente : this.listaClientes) {
				if (cliente instanceof ClientePJ)
					retorno.add(cliente);
			}
		}
		return retorno;
	}

	public boolean gerarSeguro(Cliente cliente, Veiculo veiculo) {
		boolean ret = false;
		if (cliente instanceof ClientePF) {
			ret = this.getListaSeguros().add(new SeguroPF(veiculo, (ClientePF) cliente));
		}
		if (cliente instanceof ClientePJ) {
			Frota frota = new Frota("codigofrota-" + cliente.getNome(), cliente.getListaVeiculos());
			ret = this.getListaSeguros().add(new SeguroPJ(frota, (ClientePJ) cliente));
		}
		return ret;
	}

	public boolean cancelarSeguro(Cliente cliente) {
		boolean ret = false;
		for (Seguro seguro : this.getListaSeguros()) {
			if (seguro.getCliente() == cliente) {
				ret = this.getListaSeguros().remove(seguro);
			}
		}
		return ret;
	}

	public boolean cadastrarCliente(Cliente cliente) {
		return getListaClientes().add(cliente);
	}

	public boolean removerCliente(Cliente cliente) {
		return getListaClientes().remove(cliente);
	}

	public List<Seguro> getSegurosPorCliente(Cliente cliente) {
		List<Seguro> ret = new ArrayList<>();
		for (Seguro seguro : this.getListaSeguros()) {
			if (seguro.getCliente() == cliente) {
				ret.add(seguro);
			}
		}
		return ret;
	}

	public List<Sinistro> getSinistrosPorCliente(Cliente cliente) {
		return cliente.getListaSinistros();
	}

	public Double calcularReceita() {
		double ret = 0;
		for (Cliente cliente : getListaClientes()) {
			for (Seguro seguro : cliente.getSeguradora().getSegurosPorCliente(cliente))
				ret += seguro.getValorMensal();
		}
		return ret;
	}

	@Override
	public String toString() {
		return "Seguradora [getNome()=" + getNome() + ", getTelefone()=" + getTelefone() + ", getEmail()=" + getEmail()
				+ ", getEndereco()=" + getEndereco() + ", getListaSeguros()=" + getListaSeguros()
				+ ", getListaClientes()=" + getListaClientes() + ", calcularReceita()=" + calcularReceita() + "]";
	}

}
