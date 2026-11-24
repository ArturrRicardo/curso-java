package Fundamentos.aula25_Classes_Abstratas;

public class Jogador extends  Time{
    private String nome ;
    private Integer idade;
    private String posicao;
    private String nacionalidade;
    private Time time;

    public Jogador(){super();}


    public Jogador( String clube,Integer divisao, String nome, Integer idade, String posicao, String nacionalidade){
        super(clube,divisao);
        this.nome=nome;
        this.idade=idade;
        this.posicao=posicao;
        this.nacionalidade=nacionalidade;

    }

    public String getNomeJogador() {return nome;}
    public Integer getIdade() {return idade;}
    public String getPosicao() {return posicao;}
    public String getNacionalidade() {return nacionalidade;}
    public Time getTime(){return time;}


    @Override
    public void contrato() {
        StringBuilder sb = new StringBuilder();
        sb.append("O ");
        sb.append(getTime().getNome());

    }

    @Override
    public void campeao() {

    }
}
