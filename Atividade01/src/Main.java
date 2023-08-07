import domain.dev.diogocedran.pessoa.modelo.Pessoa;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Pessoa diogo = new Pessoa("Diogo Cedran", LocalDate.of(2004, 2, 2));

        System.out.println(diogo.getNome());
        System.out.println(diogo.getDataNascimento());
        System.out.println(diogo.getIdade());

        Pessoa gustavo = new Pessoa("Gustavo", LocalDate.of(2010, 2, 19), 13);

        System.out.println(gustavo.getNome());
        System.out.println(gustavo.getDataNascimento());
        System.out.println(gustavo.getIdade());

        Pessoa felipe = new Pessoa();

        felipe.setNome("Felipe");
        felipe.setDataNascimento(LocalDate.of(2003, 9, 29));

        System.out.println(felipe.getNome());
        System.out.println(felipe.getDataNascimento());
        System.out.println(felipe.getIdade());

    }
}