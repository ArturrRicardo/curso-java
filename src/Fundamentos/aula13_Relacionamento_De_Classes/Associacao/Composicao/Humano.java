package Fundamentos.aula13_Relacionamento_De_Classes.Associacao.Composicao;

public class Humano {
    private boolean humano ;
    private Coracao coracao;

    public Humano(){
        this.coracao=new Coracao();
        this.humano=true;
    }

    public boolean gethumano(){return humano;}
    public Coracao getCoracao(){return  coracao;}

    public void apresentar(){
        if(humano){
            System.out.println("Humano criado!".toUpperCase());
        }else{
            System.out.println("nenhum humano por aqui ".toUpperCase());
        }
    }

    public static void main(String[] args) {
        Humano h1 = new Humano();
        h1.getCoracao().bater();
        h1.apresentar();
    }
}
