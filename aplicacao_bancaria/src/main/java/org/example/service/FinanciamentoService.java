package org.example.service;

import org.example.domain.conta.ContaCliente;
import org.example.domain.conta.Financiamento;

import java.util.Collections;
import java.util.List;

public class FinanciamentoService {

    public FinanciamentoService() {
    }
    String numeroFinanciamento;

    public void novoFinanciamento(ContaCliente conta, double valorFinanciado, int quantidadeParcelas, double taxaJuros) {

        Financiamento financiamento = criarFinanciamento(valorFinanciado, quantidadeParcelas, taxaJuros);

        List<Financiamento> financiamentos = Collections.singletonList(conta.getFinanciamentos());

        financiamentos.add(financiamento);

        conta.setFinanciamentos((Financiamento) financiamentos);
        conta.setSaldo(conta.getSaldo() + valorFinanciado);

        System.out.println("Financiamento de R$ " + valorFinanciado + " realizado com sucesso!");
        System.out.println("Valor do financiamento depositado na conta: R$ " + valorFinanciado);
    }

    private Financiamento criarFinanciamento(double valorFinanciado, int quantidadeParcelas, double taxaJuros) {
        double valorParcela = calcularValorParcela(valorFinanciado, quantidadeParcelas, taxaJuros);
        double valorTotalJuros = valorParcela * quantidadeParcelas - valorFinanciado;
        double valorTotalFinanciamento = valorFinanciado + valorTotalJuros;

        return new Financiamento(numeroFinanciamento, valorFinanciado, valorParcela, quantidadeParcelas, taxaJuros, valorTotalJuros, valorTotalFinanciamento, 0, 0.0, valorTotalFinanciamento);
    }

    private double calcularValorParcela(double valorFinanciado, int quantidadeParcelas, double taxaJuros) {
        double valorParcela = valorFinanciado / quantidadeParcelas;
        double valorJuros = valorParcela * taxaJuros;
        return valorParcela + valorJuros;
    }

    public void pagarParcelasDoFinanciamento(ContaCliente conta, String numeroFinanciamento, String quantidadeDeParcelasAPagar) {
        Financiamento financiamento = conta.getFinanciamentoPeloNumero(numeroFinanciamento);

        double saldoDaConta = conta.getSaldo();
        double valorTotalDasParcelasAPagar = financiamento.getValorParcela() * Double.parseDouble(quantidadeDeParcelasAPagar);

        if (valorTotalDasParcelasAPagar > saldoDaConta) throw new RuntimeException("Saldo insuficiente");

        conta.setSaldo(saldoDaConta - valorTotalDasParcelasAPagar);
        financiamento.setQuantidadeParcelasPagas(financiamento.getQuantidadeParcelasPagas() + Integer.parseInt(quantidadeDeParcelasAPagar));
        financiamento.setValorTotalPago(financiamento.getValorTotalPago() + valorTotalDasParcelasAPagar);
        financiamento.setValorAPagar(financiamento.getValorAPagar() - valorTotalDasParcelasAPagar);

        System.out.println("Parcelas pagas com sucesso");
    }

}
