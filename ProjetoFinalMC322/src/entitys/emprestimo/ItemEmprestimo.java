package src.entitys.emprestimo;

import java.util.Date;

public class ItemEmprestimo {
    private Integer prazoDias;
    private Date dataLimite;

    public ItemEmprestimo(Integer prazoDias, Date dataLimite) {
        this.prazoDias = prazoDias;
        this.dataLimite = dataLimite;
    }

    public Integer getPrazoDias() {
        return prazoDias;
    }

    public void setPrazoDias(Integer prazoDias) {
        this.prazoDias = prazoDias;
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }
}
