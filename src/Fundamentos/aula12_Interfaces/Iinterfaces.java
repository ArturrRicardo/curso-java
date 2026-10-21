package Fundamentos.aula12_Interfaces;

public class Iinterfaces {
    public static void main(String[] args) {
        //Uma interface em Java é um contrato que define o que uma classe deve fazer, mas não como fazer.
        // Ela especifica um conjunto de métodos e constantes que qualquer classe deve obrigatoriamente implementar.
        // Isso é essencial para garantir o polimorfismo e padronizar o comportamento de diferentes classes no seu sistema.

        System.out.println("Uma interface e como se estivesse um chassi de um carro" +
                " e nele temos obrigatorio um manual de como montar um carro" .toUpperCase());

        System.out.println("Geralmente a interface é construida com metodos abstratos ou constantes abstratas".toUpperCase());
        System.out.println(" Metodos abstratos sao metodos criados porem nao desenvovidos".toUpperCase());
        System.out.println("E toda a classe que implementa a interface é obrigada a sobrescrever ( o famoso override) aquele metodo".toUpperCase());
        System.out.println("override em uma interface é somente o desenvolvimento do metodo abstratdo que esta sendo herdado da interface".toUpperCase());
        System.out.println("ou seja a classes filha so completa o metodo abstrato de acordo com a sua necessidade".toUpperCase());
        System.out.println("EXEMPLO");
        System.out.println("Temos uma interface (movel) onde temos um metodo() mover nela" +
                "logo duas classes herdam a interface movel as classes são:" +
                " Carro e Animal " +
                " Porem ambas usam o metodo de forma diferente onde carro desenvolve o metodo mover deforma diferente" +
                " Carro usa o metodo mover() como :  carro se movendo " +
                "Animal usa o metodo mover() como: cachorro se movendo " +
                "ambas usam a mesma classe e o mesmo metodo porem atitudes diferentes, chamando isso de polimorfismo".toUpperCase());

        System.out.println(" para criar uma interface em vez de criamos uma java class, selecionamos uma interface" +
                "e a partir dai desenvolvemos de acordo com a nossa necessidade ".toUpperCase());

    }


}
