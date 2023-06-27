package src.entitys.autenticacao;

import src.entitys.Usuario;
import src.interfaces.Autenticacao;

public class AutenticacaoUsuario implements Autenticacao {

    private Usuario usuario;

    public AutenticacaoUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean autenticarUsuario(String senha) {
        return autenticar(this.usuario.getSenha(), senha);
    }

    @Override
    public <T> boolean autenticar(T comparando, T comparar) {
        return comparando == comparar;
    }
}
