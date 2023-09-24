package org.example.domain.conta;

import org.example.domain.cadastro.Cliente;
import org.example.domain.conta.enums.TipoConta;

public class ContaCliente {

    private String agencia;
    private String numeroConta;
    private TipoConta tipoConta;
    private Cliente titulares;
    private Boolean contaConjunta;
    private Double saldo;
    private Transacao transacoes;
    private Financiamento financiamentos;



    public ContaCliente(String agencia, String numeroConta, Double saldo, TipoConta tipoConta, Boolean contaConjunta, Cliente titulares) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.titulares = titulares;
        this.contaConjunta = contaConjunta;
        this.saldo = saldo;
    }

    public ContaCliente() {
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public TipoConta getTipoConta() {

        return tipoConta;

    }
    public Double getSaldo() {
        return saldo;
    }


    public Boolean getContaConjunta() {
        return contaConjunta;
    }

    public Cliente getTitulares() {
        return titulares;
    }

    public Transacao getTransacoes() {
        return transacoes;
    }

    public Financiamento getFinanciamentos() {
        return financiamentos;
    }

    public void setTransacoes(Transacao transacoes) {
        this.transacoes = transacoes;
    }

    public void setFinanciamentos(Financiamento financiamentos) {
        this.financiamentos = financiamentos;
    }

    public Financiamento getFinanciamentoPeloNumero(String numeroFinanciamento) {
        return null;
    }

    public void setSaldo(double saldo) {
    }
}