public class Main {

    public static void main(String [] args){

        Aluno diogo = new Aluno("Diogo",19, "22014212-2");
        Aluno gustavo = new Aluno("Gustavo", 13, "22014259-5");

        System.out.println(diogo.getNome());
        System.out.println(diogo.getIdade());
        System.out.println(diogo.getRa());
        System.out.println("---------");
        System.out.println(gustavo.getNome());
        System.out.println(gustavo.getIdade());
        System.out.println(gustavo.getRa());

        Professor henrique = new Professor("Henrique", 33,"22014265-9");
        
        System.out.println("---------");
        System.out.println(henrique.getNome());
        System.out.println(henrique.getIdade());
        System.out.println(henrique.getRp());
    }

}
