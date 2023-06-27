package src.entitys.emprestimo;

import src.entitys.Usuario;
import src.entitys.obras.Obra;

import java.util.Date;

public class Emprestimo {
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private boolean renovacao = false;
    private Integer geraMulta;
    private Obra obra;
    private Usuario usuario;
    private ItemEmprestimo itemEmprestimo;

    public Emprestimo(Date dataEmprestimo, Date dataDevolucao, boolean renovacao, Integer geraMulta, Obra obra, Usuario usuario, ItemEmprestimo itemEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.renovacao = renovacao;
        this.geraMulta = geraMulta;
        this.obra = obra;
        this.usuario = usuario;
        this.itemEmprestimo = itemEmprestimo;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isRenovacao() {
        return renovacao;
    }

    public void setRenovacao(boolean renovacao) {
        this.renovacao = renovacao;
    }

    public Integer getGeraMulta() {
        return geraMulta;
    }

    public void setGeraMulta(Integer geraMulta) {
        this.geraMulta = geraMulta;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ItemEmprestimo getItemEmprestimo() {
        return itemEmprestimo;
    }

    public void setItemEmprestimo(ItemEmprestimo itemEmprestimo) {
        this.itemEmprestimo = itemEmprestimo;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", renovacao=" + renovacao +
                ", geraMulta=" + geraMulta +
                ", obra=" + obra +
                ", usuario=" + usuario +
                ", itemEmprestimo=" + itemEmprestimo +
                '}';
    }
}
