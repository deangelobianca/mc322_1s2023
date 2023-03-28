package com.bianca.mc322;

import com.bianca.mc322.models.Cliente;
import com.bianca.mc322.models.Seguradora;
import com.bianca.mc322.models.Sinistro;
import com.bianca.mc322.models.Veiculo;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Fulano da Silva", "790.625.840-12", "31/12/1990", "R. dos Bobos, n 0");
		Seguradora seguradora = new Seguradora("IC Seguros", "19 3333-3333", "quebrouferrou@seguradora.com",
				"Av. dos Santos, n 32");
		Sinistro sinistro = new Sinistro("31/01/2023", "Av. do Acidente, n 34");
		Veiculo veiculo = new Veiculo("ABC1234", "Fiat", "Tempra");

		System.out.println(cliente.toString());
		System.out.println("------------------");
		System.out.println(seguradora.toString());
		System.out.println("------------------");
		System.out.println(sinistro.toString());
		System.out.println("------------------");
		System.out.println(veiculo.toString());
		System.out.println("------------------");
	}

}
