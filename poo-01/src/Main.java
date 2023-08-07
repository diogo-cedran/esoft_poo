import domain.Estagiario;
import domain.Funcionario;
import domain.Pessoa;
import domain.cargo.Auxiliar;
import domain.cargo.Gerente;
import domain.cargo.Programador;

public class Main {
    public static void main(String[] args) {

       // Pessoa joaquim = new Pessoa("Joaquim", 25, "123");
       // Estagiario joao = new Estagiario("Joao", 20, "987", "987");

        Funcionario joaquim = new  Funcionario("Joaquim", 35, "123", "123", new Gerente());

        Funcionario manuel = new Funcionario("Manuel",30,"321","321", new Programador());

        Funcionario joao = new Funcionario("Joao",20,"987","987", new Auxiliar());


        System.out.println(joaquim.getSalario());
        System.out.println(manuel.getSalario());
        System.out.println(joao.getSalario());
    }
}