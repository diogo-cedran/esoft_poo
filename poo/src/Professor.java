public class Professor extends Pessoa {

    private String rp;

    public Professor(String nome, int idade, String rp) {
        this.nome = nome;
        this.idade = idade;
        this.rp = rp;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRp() {
        return rp;
    }
}



