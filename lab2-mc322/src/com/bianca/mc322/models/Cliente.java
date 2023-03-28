package com.bianca.mc322.models;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {

	private String nome, cpf, dataNascimento, endereco;
	private Integer idade;
	
	public Cliente(String nome, String cpf, String dataNascimento, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		
		String[] nasc = dataNascimento.split("\\/");
		this.idade = Period.between(LocalDate.of(Integer.parseInt(nasc[2]), Integer.parseInt(nasc[1]),
				Integer.parseInt(nasc[0])), LocalDate.now()).getYears();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Boolean validarCPF(String cpf) {
		cpf = cpf.replaceAll("/[\\D]/g", "");

		int calculoDigito1 = ((cpf.charAt(0) * 10) + (cpf.charAt(1) * 9) + (cpf.charAt(2) * 8) + (cpf.charAt(3) * 7)
				+ (cpf.charAt(4) * 6) + (cpf.charAt(5) * 5) + (cpf.charAt(6) * 4) + (cpf.charAt(7) * 3)
				+ (cpf.charAt(8) * 2));
		int digito1 = 11 - (calculoDigito1 % 11);

		int calculoDigito2 = ((cpf.charAt(0) * 11) + (cpf.charAt(1) * 10) + (cpf.charAt(2) * 9) + (cpf.charAt(3) * 8)
				+ (cpf.charAt(4) * 7) + (cpf.charAt(5) * 6) + (cpf.charAt(6) * 5) + (cpf.charAt(7) * 4)
				+ (cpf.charAt(8) * 3) + (cpf.charAt(9) * 2));
		int digito2 = 11 - (calculoDigito2 % 11);

		// verificações
		if (cpf.length() != 11)
			return false;
		if (allCharactersSame(cpf))
			return false;
		if (digito1 != cpf.charAt(9) || digito2 != cpf.charAt(10))
			return false;

		return true;
	}

	public String toString() {
		return "Dados do cliente - " + this.getNome() + "\n" + "CPF: " + this.getCpf() + "\n" + "Data de nasc.: "
				+ this.getDataNascimento() + "\n" + "Idade: " + this.getIdade() + "\n" + "Endereco: "
				+ this.getEndereco();
	}

	private boolean allCharactersSame(String s) {
		int n = s.length();
		for (int i = 1; i < n; i++)
			if (s.charAt(i) != s.charAt(0))
				return false;

		return true;
	}

}
