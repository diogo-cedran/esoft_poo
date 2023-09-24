package org.example.domain.cadastro;

import org.example.domain.cadastro.enums.TipoCliente;

public abstract class Cliente {

    private String endereco;
    private String telefone;
    private String email;

    public Cliente(String endereco, String telefone, Endereco email ) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email.toString();
    }

    public abstract String getNomeOuNomeFantasia();

    public abstract String getNomeCompleto();

    public abstract String getCpfOuCnpj();

    public abstract String getDataNascimento();

    public abstract TipoCliente getEstadoCivil();


    public abstract TipoCliente getEstadoCivilOuTipoSociedade();

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}