package org.example.domain.conta.enums;

public enum TipoTransacao {

    SAQUE("Saque"),
    PAGAMENTO("Pagamento"),
    DEPOSITO("Depósito"),
    TRANSFERENCIA("Transferência");

    private String descricao;

    TipoTransacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
