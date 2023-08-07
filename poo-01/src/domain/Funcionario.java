package domain;

import domain.cargo.Cargo;

public class Funcionario extends Pessoa{


    private String matricula;
    private Cargo cargo;
    private double salario;


    public Funcionario(String nome, int idade, String cpf, String matricula, Cargo cargo){

        super(nome, idade, cpf);  //construtor do pai
        this.matricula = matricula;
        this.cargo = cargo;

    }
}
