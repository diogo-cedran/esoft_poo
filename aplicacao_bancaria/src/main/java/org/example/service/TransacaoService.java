package org.example.service;

import org.example.domain.conta.ContaCliente;
import org.example.domain.conta.Transacao;
import org.example.domain.conta.enums.TipoTransacao;

import java.util.List;

public class TransacaoService extends Transacao {

    public TransacaoService() {
    }

    public void deposito(ContaCliente conta, Transacao transacao) {

        if (transacao.getTipoTransacao() != TipoTransacao.DEPOSITO) {
            System.out.println("Tipo de transação inválida!");
            return;
        }

        conta.setSaldo(conta.getSaldo() + transacao.getValorTransacao());

        Transacao transacoes = conta.getTransacoes();
        Transacao transacaoNova = new Transacao(transacao.getNumeroTransacao(), transacao.getValorTransacao(), transacao.getTipoTransacao(), transacao.getDataTransacao());
        conta.setTransacoes(transacoes);

        System.out.println("Depósito de R$ " + transacao.getValorTransacao() + " realizado com sucesso!");

    }

    public void transferencia(ContaCliente origem, ContaCliente destino, Transacao transacao) {

        if (transacao.getTipoTransacao() != TipoTransacao.TRANSFERENCIA) {
            System.out.println("Tipo de transação inválida!");
            return;
        }

        if (origem.getSaldo() < transacao.getValorTransacao()) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        origem.setSaldo(origem.getSaldo() - transacao.getValorTransacao());
        destino.setSaldo(destino.getSaldo() + transacao.getValorTransacao());

        Transacao transacoesOrigem = origem.getTransacoes();
        Transacao transacaoOrigem = new Transacao(transacao.getNumeroTransacao(), transacao.getValorTransacao(), transacao.getTipoTransacao(), transacao.getDataTransacao());
        transacaoOrigem.setValorTransacao(transacao.getValorTransacao() * -1);
        origem.setTransacoes(transacoesOrigem);

        Transacao transacaoDestino = new Transacao(transacao.getNumeroTransacao(), transacao.getValorTransacao(), transacao.getTipoTransacao(), transacao.getDataTransacao());


        System.out.println("Transferência de R$ " + transacao.getValorTransacao() + " realizada com sucesso");

    }

}
