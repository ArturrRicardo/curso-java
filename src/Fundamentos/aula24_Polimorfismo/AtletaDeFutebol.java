package Fundamentos.aula24_Polimorfismo;

public class AtletaDeFutebol extends  Atleta {

    private String posicao;

    public AtletaDeFutebol(String nome, int idade, String clube, String posicao){
        super(nome,idade,clube);
        this.posicao=posicao;
    }

    public String getPosicao(){return posicao;}

    @Override
    public void treinar() {
        System.out.println(getNome() +  " esta fazendo um aquecimento fisico no ct de treinamento do " + getEquipe().toUpperCase());
    }

    public void penalti(){
        System.out.println("O " + getPosicao() + getNome() + " marcou um golaço de cavadinha incrivel a frieza".toUpperCase());
    }
}
