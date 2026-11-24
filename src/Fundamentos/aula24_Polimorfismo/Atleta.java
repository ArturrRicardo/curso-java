package Fundamentos.aula24_Polimorfismo;

public class Atleta {
    private String nome;
    private int idade;
    private String equipe;

    public Atleta(String nome, int idade, String equipe){
        this.nome=nome;
        this.idade=idade;
        this.equipe=equipe;
    }

    public String getNome(){return nome;}
    public int getIdade(){return idade;}
    public String getEquipe(){return  equipe;}

    // aqui nao vou criar o metodo setter para que o atributo ficar emcapsulado
    // ou seja , nao poderá ser modificado, atributos protegidos

    public void treinar(){
        System.out.println(getNome() +  " esta fazendo um aquecimento fisico".toUpperCase());}
}
