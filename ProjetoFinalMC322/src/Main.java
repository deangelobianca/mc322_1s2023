package src;

import src.entitys.Biblioteca;
import src.utils.JSONFileReader;

import org.json.JSONObject;

import src.entitys.autenticacao.AutenticacaoUsuario;
import src.entitys.emprestimo.Emprestimo;
import src.entitys.emprestimo.Reserva;
import src.entitys.obras.Obra;
import src.entitys.Acervo;
import src.entitys.Usuario;

import java.util.Date;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		Biblioteca biblioteca = new Biblioteca(
			new Acervo(new ArrayList<Obras>("Hamlet", "Eu", false)),
			new Usuario("186711", "bypass", "bypass", "asd12345", new ArrayList<>()),
			new ArrayList<>(),
			new ArrayList<>()
		);

    //System.out.println(biblioteca.procurarObras("hamlet"));
		System.out.println(biblioteca.entrarUsuario("186711", "asd12345"));
	}
}