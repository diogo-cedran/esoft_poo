package domain;

public class Estagiario extends Pessoa {

    private String matricula;
    private double bolsaEstagio;

    public Estagiario(String nome, int idade, String cpf, String matricula){

      super(nome, idade, cpf);
      this.matricula = matricula;

    }

}
