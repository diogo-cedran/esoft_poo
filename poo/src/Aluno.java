public class Aluno extends Pessoa {

    private String ra;

    public Aluno(String nome, int idade, String ra) {
        this.nome = nome;
        this.idade = idade;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getRa(){
        return ra;
    }
}
