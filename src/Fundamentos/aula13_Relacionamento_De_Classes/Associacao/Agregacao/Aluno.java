package Fundamentos.aula13_Relacionamento_De_Classes.Associacao.Agregacao;

public class Aluno {

    private double nota1;
    private double nota2;
    private Pessoa aluno;   // aqui criamos um atributo do tipo da classe pessoa para que a classe aluno tenha um objeto do tipo aluno

    public Aluno(){;}

    public Aluno(Pessoa aluno, double nota1,double nota2){
        this.aluno=aluno;
        setNota1(nota1);
        setNota2(nota2);

    }

    public double getNota1() {return nota1;}
    public void setNota1(double nota1) {this.nota1 = nota1;}

    public double getNota2() {return nota2;}
    public void setNota2(double nota2) {this.nota2 = nota2;}

    public Pessoa getAluno(){return aluno;} // aqui é o ponto chave para poder mostrar ou informar todos os atributos da outra classe

    public double total(){

         return getNota1()+ getNota2();
    }


    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("joao",16); // primeiro criamos um objeto do tipo pessoa

        Aluno a1 = new Aluno(p1,5,3.5); // depois esta pessoa e informada como um aluno e tendo as suas notas
        System.out.println("nome: ");
        String nome = a1.getAluno().getNome();
        System.out.println(nome);
        System.out.println(a1.total());
        System.out.println("------------------------------------------------------------------------------");

        Aluno a2 = new Aluno(new Pessoa("Amanda",12),3,7); // ou  entao podemos criar o objeto ja dentro do construtor
        System.out.println(a2.getAluno().getNome());// aqui só mostrando os nome do aluno

        System.out.println("A aluna " + a2.getAluno().getNome()+ " tem a nota total de: " + a2.total());

    }
}
