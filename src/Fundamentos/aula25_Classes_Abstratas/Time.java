package Fundamentos.aula25_Classes_Abstratas;

public abstract class Time {

    // quando uma classe se torna abstrata, ela nao  poderá ser instanciada

    private String nome;
    private Integer divisao;
    private Integer titulos;

    public Time(){;}

    public Time(String nome, Integer divisao){
        this.nome=nome;
        this.divisao=divisao;
    }

    public Time(String nome, Integer divisao , Integer titulos){
        this.nome=nome;
        this.divisao=divisao;
        this.titulos=titulos;
    }

    public String getNome(){return nome;}
    public Integer getDivisao(){return divisao;}
    public Integer getTitulos(){return titulos;}


    public abstract void contrato();

    public abstract void campeao();


    // aqui tambem possuimos 2 metodos abstratos, que só irao funcionar apos receber uma sobreescrita em outra classe
}
