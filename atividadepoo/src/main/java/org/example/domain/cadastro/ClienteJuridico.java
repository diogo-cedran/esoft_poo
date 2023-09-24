package org.example.domain.cadastro;

import org.example.domain.cadastro.enums.TipoCliente;

public abstract class ClienteJuridico extends Cliente {

    private String nomeFantasia;
    private String cnpj;
    private TipoCliente tipoCliente;

    public ClienteJuridico(String email, String telefone, Endereco endereco, String nomeFantasia, String cnpj, TipoCliente tipoCliente) {
        super(email, telefone, endereco);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.tipoCliente = tipoCliente;
    }

    public ClienteJuridico(String email, String telefone, Endereco endereco) {
        super(email, telefone, endereco);
    }

    @Override
    public String getNomeOuNomeFantasia() {
        return nomeFantasia;
    }

    @Override
    public String getNomeCompleto() {
        return null;
    }

    @Override
    public String getCpfOuCnpj() {
        return cnpj;
    }

    @Override
    public String getDataNascimento() {
        return null;
    }

    @Override
    public TipoCliente getEstadoCivil() {
        return null;
    }
}
