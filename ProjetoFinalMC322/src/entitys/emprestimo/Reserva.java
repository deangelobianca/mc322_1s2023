package src.entitys.emprestimo;

import src.entitys.Usuario;
import src.entitys.obras.Obra;

import java.util.Date;

public class Reserva {
    private Date dataReserva;
    private Integer validade;
    private Usuario usuario;
    private Obra obra;

    public Reserva(Date dataReserva, Integer validade, Usuario usuario, Obra obra) {
        this.dataReserva = dataReserva;
        this.validade = validade;
        this.usuario = usuario;
        this.obra = obra;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Integer getValidade() {
        return validade;
    }

    public void setValidade(Integer validade) {
        this.validade = validade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "dataReserva=" + dataReserva +
                ", validade=" + validade +
                ", usuario=" + usuario +
                ", obra=" + obra +
                '}';
    }
}
