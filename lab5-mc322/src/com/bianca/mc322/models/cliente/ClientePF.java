package com.bianca.mc322.models.cliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;

import com.bianca.mc322.models.Seguradora;
import com.bianca.mc322.models.Veiculo;

public class ClientePF extends Cliente {

	private final String CPF;
	private String genero, educacao, classeEconomica;
	private Date dataNascimento;

	public ClientePF(String CPF, Date dataNascimento, String nome, String endereco, String educacao, String genero,
			String classeEconomica, Date dataLicenca, Seguradora seguradora) {
		super(nome, endereco, seguradora);
		this.CPF = CPF;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.educacao = educacao;
		this.classeEconomica = classeEconomica;
		this.setListaVeiculos(new ArrayList<>());
		this.setListaSinistros(new ArrayList<>());
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCPF() {
		return CPF;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEducacao() {
		return educacao;
	}

	public void setEducacao(String educacao) {
		this.educacao = educacao;
	}

	public String getClasseEconomica() {
		return classeEconomica;
	}

	public void setClasseEconomica(String classeEconomica) {
		this.classeEconomica = classeEconomica;
	}
	
	public void atualizarListaVeiculos(List<Veiculo> listaVeiculos) {
		setListaVeiculos(listaVeiculos);
	}

	public int getIdade() {
		// Obtém a data atual
		Date dataAtual = new Date();

		// Calcula a diferença em milissegundos entre as datas
		long diferencaEmMilissegundos = dataAtual.getTime() - getDataNascimento().getTime();

		// Converte a diferença de milissegundos para anos
		long anos = diferencaEmMilissegundos / 1000 / 60 / 60 / 24 / 365;

		// Retorna a idade como um número inteiro
		return (int) anos;
	}

	public static boolean validarCPF(String CPF) {
		// considera-se erro CPF's formados por uma sequencia de numeros iguais
		if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222")
				|| CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555")
				|| CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888")
				|| CPF.equals("99999999999") || (CPF.length() != 11))
			return (false);

		char dig10, dig11;
		int sm, i, r, num, peso;

		// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
		try {
			// Calculo do 1o. Digito Verificador
			sm = 0;
			peso = 10;
			for (i = 0; i < 9; i++) {
				// converte o i-esimo caractere do CPF em um numero:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 eh a posicao de '0' na tabela ASCII)
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig10 = '0';
			else
				dig10 = (char) (r + 48); // converte no respectivo caractere numerico

			// Calculo do 2o. Digito Verificador
			sm = 0;
			peso = 11;
			for (i = 0; i < 10; i++) {
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig11 = '0';
			else
				dig11 = (char) (r + 48);

			// Verifica se os digitos calculados conferem com os digitos informados.
			if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	@Override
	public String toString() {
		return "ClientePF [CPF=" + CPF + ", genero=" + genero + ", educacao=" + educacao + ", classeEconomica="
				+ classeEconomica + ", dataNascimento=" + dataNascimento + ", getNome()=" + getNome()
				+ ", getEndereco()=" + getEndereco() + ", getListaVeiculos()=" + getListaVeiculos()
				+ ", getListaSinistros()=" + getListaSinistros() + "]";
	}

}
