package model;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valorOrcamento;
    private BigDecimal descontoOrcamento;


    public Orcamento() {}


    public Orcamento(BigDecimal valorOrcamento, BigDecimal descontoOrcamento) {
        this.valorOrcamento = valorOrcamento;
        this.descontoOrcamento = descontoOrcamento;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public BigDecimal getDescontoOrcamento() {
        return descontoOrcamento;
    }

    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }
}


