	package src.entitys;

import src.entitys.emprestimo.Emprestimo;

import java.util.List;

public class Usuario {
    private String ra;
    private String nome;
    private String multa;
    private String senha;
    private List<Emprestimo> emprestimos;

    public Usuario(
            String ra,
            String nome,
            String multa,
            String senha,
            List<Emprestimo> emprestimos
    ) {
        this.ra = ra;
        this.nome = nome;
        this.multa = multa;
        this.senha = senha;
        this.emprestimos = emprestimos;
    }

    public String getRa() {
        return ra;
    }
		/*
    public void setRa(String ra) {
        this.ra = ra;
    }
		*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMulta() {
        return multa;
    }

    public void setMulta(String multa) {
        this.multa = multa;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "ra='" + ra + '\'' +
                ", nome='" + nome + '\'' +
                ", multa='" + multa + '\'' +
                ", senha='" + senha + '\'' +
                ", emprestimos=" + emprestimos +
                '}';
    }
}
