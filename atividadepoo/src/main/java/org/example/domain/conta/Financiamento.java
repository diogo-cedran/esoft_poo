package org.example.domain.conta;

public class Financiamento {

    private String numeroFinanciamento;
    private Double valorFinanciamento;
    private Double valorParcela;
    private Integer quantidadeParcelas;
    private Double taxaJuros;
    private Double valorTotalJuros;
    private Double valorTotalFinanciamento;
    private Integer quantidadeParcelasPagas;
    private Double valorTotalPago;
    private Double valorAPagar;

    public Financiamento() {
    }

    public Financiamento(String numeroFinanciamento, Double valorFinanciamento, Double valorParcela, Integer quantidadeParcelas, Double taxaJuros, Double valorTotalJuros, Double valorTotalFinanciamento, Integer quantidadeParcelasPagas, Double valorTotalPago, Double valorRestanteAPagar) {
        this.numeroFinanciamento = numeroFinanciamento;
        this.valorFinanciamento = valorFinanciamento;
        this.valorParcela = valorParcela;
        this.quantidadeParcelas = quantidadeParcelas;
        this.taxaJuros = taxaJuros;
        this.valorTotalJuros = valorTotalJuros;
        this.valorTotalFinanciamento = valorTotalFinanciamento;
        this.quantidadeParcelasPagas = quantidadeParcelasPagas;
        this.valorTotalPago = valorTotalPago;
        this.valorAPagar = valorRestanteAPagar;
    }


    public String getNumeroFinanciamento() {
        return numeroFinanciamento;
    }

    public void setNumeroFinanciamento(String numeroFinanciamento) {
        this.numeroFinanciamento = numeroFinanciamento;
    }

    public Double getValorFinanciamento() {
        return valorFinanciamento;
    }

    public void setValorFinanciamento(Double valorFinanciamento) {
        this.valorFinanciamento = valorFinanciamento;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public Integer getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(Integer quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public Double getValorTotalJuros() {
        return valorTotalJuros;
    }

    public void setValorTotalJuros(Double valorTotalJuros) {
        this.valorTotalJuros = valorTotalJuros;
    }

    public Double getValorTotalFinanciamento() {
        return valorTotalFinanciamento;
    }

    public void setValorTotalFinanciamento(Double valorTotalFinanciamento) {
        this.valorTotalFinanciamento = valorTotalFinanciamento;
    }

    public Integer getQuantidadeParcelasPagas() {
        return quantidadeParcelasPagas;
    }

    public void setQuantidadeParcelasPagas(Integer quantidadeParcelasPagas) {
        this.quantidadeParcelasPagas = quantidadeParcelasPagas;
    }

    public Double getValorTotalPago() {
        return valorTotalPago;
    }

    public void setValorTotalPago(Double valorTotalPago) {
        this.valorTotalPago = valorTotalPago;
    }

    public Double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(Double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
}
