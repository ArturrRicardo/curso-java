package Fundamentos.aula23_Palavra_Final;

public class Viagem {

    private final int  velocidadeMaxima = 120; // aqui temos uma constante durante a viagem

    private final String destino;

    public Viagem(String destino){
        this.destino=destino;  // aqui aon informamos o destino ele n poderá mais ser alterado

    }

    public int getVelocidadeMaxima(){return velocidadeMaxima;}
    public String getDestino(){return destino;}

    public double preco (final double gasolina){
        return gasolina*3;
    }// aqui ao ser recebido o preço da gasolina ela entra no metodo e nao pode mais ser mudado

    public void limite (){
        System.out.println("o limite de velociade da rodovia é de " + getVelocidadeMaxima());
    }
    public static void main(String[] args) {
        Viagem tokio = new Viagem("Tokio");
        System.out.println("a cada 1 km vamos gastar R$" + tokio.preco(5.5));
        tokio.limite();

    }

}
