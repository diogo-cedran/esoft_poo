package org.example.domain.conta.enums;

public enum TipoConta {

    CORRENTE(0),
    POUPANCA(50),
    SALARIO(0);

    private final Integer valorMinimoAbertura;

    TipoConta(Integer valorMinimoAbertura) {
        this.valorMinimoAbertura = valorMinimoAbertura;
    }

    public Integer getValorMinimoAbertura() {
        return valorMinimoAbertura;
    }
}
