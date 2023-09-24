package org.example.domain.conta;

import org.example.domain.conta.enums.TipoTransacao;

public class Transacao extends ContaCliente {

    private TipoTransacao tipoTransacao;
    private String dataTransacao;
    private Integer numeroTransacao;
    private Double valorTransacao;


    public Transacao() {
    }

    public Transacao(Integer numeroTransacao, Double valorTransacao, TipoTransacao tipoTransacao, String dataTransacao) {
        this.numeroTransacao = numeroTransacao;
        this.tipoTransacao = tipoTransacao;
        this.valorTransacao = valorTransacao;
        this.dataTransacao = dataTransacao;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }
    public String getDataTransacao() {
        return dataTransacao;
    }
    public Integer getNumeroTransacao() {
        return numeroTransacao;
    }

    public Double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {
    }
}
