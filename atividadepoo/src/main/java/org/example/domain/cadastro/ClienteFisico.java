package org.example.domain.cadastro;

import org.example.domain.cadastro.enums.TipoCliente;

public abstract class ClienteFisico extends Cliente {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String dataNascimento;
    private TipoCliente tipoCliente;

    public ClienteFisico(String email, String telefone, Endereco endereco, String nome, String sobrenome, String cpf, String dataNascimento, TipoCliente tipoCliente) {
        super(email, telefone, endereco);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String getNomeOuNomeFantasia() {
        return nome;
    }

    @Override
    public String getNomeCompleto() {
        return null;
    }

    @Override
    public String getCpfOuCnpj() {
        return cpf;
    }

    @Override
    public String getDataNascimento() {
        return null;
    }

    @Override
    public TipoCliente getEstadoCivil() {
        return null;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}