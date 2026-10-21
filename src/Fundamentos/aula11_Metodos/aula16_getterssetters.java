package Fundamentos.aula11_Metodos;

public class aula16_getterssetters {
    private String nome;
    private int idade;


    public aula16_getterssetters(String n, int i) {  // criamos aqui um construtor como parametro pegando nome e idade
        this.setNome(n);  // aqui pegamos o nome passado para o paramentro e ja jogamos direto no setter para ele fazer o trabalho de adicionar ao atrinuto nome que e privado
        this.setIdade(i); // aqui e a mesma coisa que fizemos com o setNome
    }


    // metodos getters e setters
    // eles tem a funçao de acessar ou aletrar uma informação que esta dentro de um atributo


    public String getNome() {return this.nome; }

    // aqui criamos o getNome que sera responsavel por informar o nome que foi inserido no atributo
    // o getNome ira retornar o nome

    public void setNome(String n) { this.nome=n;}

    // aqui criamos o setNome que é responsavel por alterar o o atributo nome , mas ele precisa de receber como parametro o proprio nome
    // aqui o setNome pega o nome informado no parametro, e coloca ele direto ao atributo


    public int getIdade() {return this.idade;}
    //aqui criamos o getIdade que tem a mesma funçao


    public void setIdade(int i) {this.idade = i;}
    // aqui tbm criamos o setIdade


    // detalhe***
    // o getter sempre irá informar qual e o tipo de retorno por isso é necessario colocar na sua criação
    // ja o setter como ele nao retornará nada, ele usa o void em sua criação


    public void apresentar() {
        System.out.println("Apresentando ");
        System.out.println(" nome: " + getNome() + " idade: " + getIdade());
    }

    // SABEMOS TAMBEM QUE EM ALGUNS CODIGOS NOS PODEMOS ADICIONAR MAIS COISAS DENTRO DO GETTER OU SETTER
    // OU SEJA: nao necessariamente o getter e setter sempre tem que ser padrao as vezes ele pode ter algumas alterações
    // mas SEMPRE eles terao a unica função que é acessar e alterar um atributo
    public static void main(String[] args) {
        aula16_getterssetters a1 = new aula16_getterssetters("bruno", 23);
        a1.apresentar();
    }
}   /// apagar o psvm
