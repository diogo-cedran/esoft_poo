package org.example.domain.cadastro.enums;

public enum TipoCliente {

    SOLTEIRO("Solteiro(a)"),
    CASADO("Casado(a)"),
    FISICO("Físico"),
    JURIDICA("Jurídico");

    private String tipoCliente;

    TipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}