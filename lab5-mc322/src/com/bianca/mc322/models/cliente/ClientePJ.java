package com.bianca.mc322.models.cliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;

import com.bianca.mc322.models.Condutor;
import com.bianca.mc322.models.Frota;
import com.bianca.mc322.models.Seguradora;

public class ClientePJ extends Cliente {

	private final String CNPJ;
	private Date dataFundacao;
	private List<Frota> listaFrota;
	private List<Condutor> listaCondutores;
	private int qtdFuncionarios;

	public ClientePJ(String CNPJ, Date dataFundacao, String nome, String endereco, int qtdFuncionarios,
			Seguradora seguradora) {
		super(nome, endereco, seguradora);
		this.CNPJ = CNPJ;
		this.dataFundacao = dataFundacao;
		this.setListaFrota(new ArrayList<>());
		this.setQtdFuncionarios(qtdFuncionarios);
		this.setListaCondutores(new ArrayList<>());
	}

	public List<Condutor> getListaCondutores() {
		return listaCondutores;
	}

	public void setListaCondutores(List<Condutor> listaCondutores) {
		this.listaCondutores = listaCondutores;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public static boolean validarCNPJ(String cnpj) {
		cnpj = cnpj.replace(".", "");
		cnpj = cnpj.replace("-", "");
		cnpj = cnpj.replace("/", "");

		try {
			Long.parseLong(cnpj);
		} catch (NumberFormatException e) {
			return false;
		}

		// considera-se erro CNPJ's formados por uma sequencia de numeros iguais
		if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111") || cnpj.equals("22222222222222")
				|| cnpj.equals("33333333333333") || cnpj.equals("44444444444444") || cnpj.equals("55555555555555")
				|| cnpj.equals("66666666666666") || cnpj.equals("77777777777777") || cnpj.equals("88888888888888")
				|| cnpj.equals("99999999999999") || (cnpj.length() != 14))
			return (false);
		char dig13, dig14;
		int sm, i, r, num, peso; // "try" - protege o código para eventuais
									// erros de conversao de tipo (int)
		try {
			// Calculo do 1o. Digito Verificador
			sm = 0;
			peso = 2;
			for (i = 11; i >= 0; i--) {
				// converte o i-ésimo caractere do CNPJ em um número: // por
				// exemplo, transforma o caractere '0' no inteiro 0 // (48 eh a
				// posição de '0' na tabela ASCII)
				num = (int) (cnpj.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;
				if (peso == 10)
					peso = 2;
			}

			r = sm % 11;
			if ((r == 0) || (r == 1))
				dig13 = '0';
			else
				dig13 = (char) ((11 - r) + 48);

			// Calculo do 2o. Digito Verificador
			sm = 0;
			peso = 2;
			for (i = 12; i >= 0; i--) {
				num = (int) (cnpj.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;
				if (peso == 10)
					peso = 2;
			}
			r = sm % 11;
			if ((r == 0) || (r == 1))
				dig14 = '0';
			else
				dig14 = (char) ((11 - r) + 48);
			// Verifica se os dígitos calculados conferem com os dígitos
			// informados.
			if ((dig13 == cnpj.charAt(12)) && (dig14 == cnpj.charAt(13)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	public List<Frota> getListaFrota() {
		return listaFrota;
	}

	public void setListaFrota(List<Frota> listaFrota) {
		this.listaFrota = listaFrota;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	@Override
	public String toString() {
		return "ClientePJ [getListaCondutores()=" + getListaCondutores() + ", getDataFundacao()=" + getDataFundacao()
				+ ", getCNPJ()=" + getCNPJ() + ", getListaFrota()=" + getListaFrota() + ", getQtdFuncionarios()="
				+ getQtdFuncionarios() + "]";
	}

}
