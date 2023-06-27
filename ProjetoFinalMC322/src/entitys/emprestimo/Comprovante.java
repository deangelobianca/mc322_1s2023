package src.entitys.emprestimo;

public class Comprovante {

    private boolean imprimeComprovante;

    public Comprovante(boolean imprimeComprovante) {
        this.imprimeComprovante = imprimeComprovante;
    }

    public boolean isImprimeComprovante() {
        return imprimeComprovante;
    }

    public void setImprimeComprovante(boolean imprimeComprovante) {
        this.imprimeComprovante = imprimeComprovante;
    }

    public void gerarComprovante() {

    }

    @Override
    public String toString() {
        return "Comprovante{" +
                "imprimeComprovante=" + imprimeComprovante +
                '}';
    }
}
