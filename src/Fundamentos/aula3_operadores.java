package Fundamentos;

public class aula3_operadores {
    public static void main(String[] args) {
        System.out.println(" operadores".toUpperCase());
        // temos alguns tipos de operadores em java

        System.out.println("operadores matematicos " .toUpperCase());
        // sua função e realizar operaçoes matematicas


        System.out.println("( + ) realiza a soma");
        System.out.println("( -  ) subtrai ");
        System.out.println("( * ) multiplica ");
        System.out.println("( / ) divisão ") ;
        System.out.println("( % ) resto da divisão");

        System.out.println("--------------------------------------------------------------------");

        System.out.println("operadores de comparação ".toUpperCase());
        //usados pararealizar uma comparação entre determinadas situações


        System.out.println("( > )  maior ");
        System.out.println("( < ) menor ");
        System.out.println("( != ) diferente");
        System.out.println("( == ) igual " );
        System.out.println("( >= ) maior ou igual ");
        System.out.println("( <= ) menor ou igual " ) ;

        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Operadores logicos ".toUpperCase());
        //  compara situaçoes  para dizer se sao verdadeiras ou não
        System.out.println("( && = significa e ) Ele compara se duas situaçoes sao verdadeiras ou nao" +
                "\n só ira retornar verdadeiro se ambas situações retornarem o mesmo valor");

        System.out.println("( || = significa ou ) compara se uma ou outra situaçao e verdadeira\n" +
                "só retorna verdadeira se uam delas for verdade \n" +
                "e falso se TODAS forem falso ");

        System.out.println("( ! = significa negaçao ) Este operador tem a funçao de reverter o valor de alguma circustância \n" +
                "por exemplo se a frase ( a camisa é preta ) se mudarmos para (! a camisa é preta )\n" +
                "ficaria assim (a camisa não é preta)" );
    }
}
