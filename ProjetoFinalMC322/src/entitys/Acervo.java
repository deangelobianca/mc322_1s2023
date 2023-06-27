package src.entitys;

import src.entitys.obras.Artigo;
import src.entitys.obras.Livro;
import src.entitys.obras.Obra;

import java.util.List;

public class Acervo {
    private List<Obra> obras;

    public Acervo(List<Obra> obras) {
        this.obras = obras;
    }

    public List<Obra> getObras() {
        return obras;
    }

    public void setObras(List<Obra> obras) {
        this.obras = obras;
    }

    public List<Livro> listarLivros() {
        return this.obras
                .stream()
                .filter(obra -> obra instanceof Livro)
                .map(livro -> (Livro) livro).toList();
    }

    public List<Artigo> listarArtigos() {
        return this.obras
                .stream()
                .filter(obra -> obra instanceof Artigo)
                .map(artigos -> (Artigo) artigos).toList();
    }

    @Override
    public String toString() {
        return "Acervo{" +
                "obras=" + obras +
                '}';
    }
}
