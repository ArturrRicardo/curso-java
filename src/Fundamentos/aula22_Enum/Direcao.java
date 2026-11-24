package Fundamentos.aula22_Enum;

public class Direcao {

    private String explorador;
    private String nacionalidade;
    private Bussola bussola;


    public enum Bussola{
        NORTE(1),SUL(2),LESTE(3),OESTE(4);

        private int direcoes;

         Bussola(int direcoes){
            this.direcoes=direcoes;
        }

        public int getDirecoes(){return direcoes;}

        public void informarDirecao(){
             switch (this){
                 case NORTE:
                     System.out.println(" Estamos a norte".toUpperCase());
                     break;
                 case SUL:
                     System.out.println(" Estamos a sul".toUpperCase());
                     break;
                 case LESTE:
                     System.out.println(" Estamos a leste".toUpperCase());
                     break;
                 case OESTE:
                     System.out.println(" Estamos a oeste".toUpperCase());
                     break;

             }

        }

        // dentro da classe Direcao criamos o nosso enum com seus valores e um atributo para cada valor
        // criamos o seu construtor ( que n precisa informar modificador de acesso)
        // e o metodo  do proprio enum
    }

    public Direcao(){}

    public  Direcao(String explorador,String nacionalidade, Bussola bulsola){
        this.explorador=explorador;
        this.nacionalidade=nacionalidade;
        this.bussola=bulsola;
    }


    public String getExplorador(){return explorador;}
    public String getNacionalidade(){return  nacionalidade;}
    public Bussola getBussola(){return bussola;}


    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Explorador: ");
        sb.append(getExplorador());
        sb.append(" \n ");
        sb.append("Nacionalidade: ");
        sb.append(getNacionalidade());
        sb.append(" \n ");
        String novo = sb.toString();
        return novo;
    }

    public static void main(String[] args) {
        Direcao ex1 = new Direcao("Mark","Australia",Bussola.LESTE);
        System.out.println(ex1);
        ex1.getBussola().informarDirecao();

    }

}