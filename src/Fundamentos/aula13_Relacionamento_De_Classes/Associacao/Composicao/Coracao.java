package Fundamentos.aula13_Relacionamento_De_Classes.Associacao.Composicao;

public class Coracao {

    private boolean coracao;

    public Coracao(){
        this.coracao=true;
    }

    public boolean getCoracao(){return coracao;}

    public void bater(){
        if (coracao){
            System.out.println("Coração batendo Tum.... Tum");
        }
    }
}
