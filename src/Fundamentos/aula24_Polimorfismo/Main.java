package Fundamentos.aula24_Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Atleta a1 = new Atleta("Cury",33,"Golden state warios");
        a1.treinar();

        Atleta a2= new AtletaDeFutebol("Fred", 32, "Clube Atletico Mineiro","Meia");
        a2.treinar();
        // aqui o jogador fred realiza o mesmo metodo porem possui comportamento diferente
        // isso é chamado polimorfismo

        AtletaDeFutebol a3 = (AtletaDeFutebol)a2;  //aqui fiz o downcasting para o atleta de futebol se transformar no tipo da propria classe

        a3.penalti();
        // ai agora ele ja pode usar o metodo da classe atleta de futebol



    }
}
