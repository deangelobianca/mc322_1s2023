package src.interfaces;

public interface Autenticacao {
    <T> boolean autenticar(T comparando, T comparar);
}
