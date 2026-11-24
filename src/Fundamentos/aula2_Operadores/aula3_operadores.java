package Fundamentos.aula2_Operadores;

public class aula3_operadores {
    public static void main(String[] args) {
        System.out.println(" operadores".toUpperCase());
        // temos alguns tipos de operadores em java

        System.out.println("operadores matematicos " .toUpperCase());
        // sua função e realizar operaçoes matematicas
        System.out.println();


        System.out.println("( + ) realiza a soma");
        System.out.println("( -  ) subtrai ");
        System.out.println("( * ) multiplica ");
        System.out.println("( / ) divisão ") ;
        System.out.println("( % ) resto da divisão");

        System.out.println("--------------------------------------------------------------------");

        System.out.println("operadores de comparação ".toUpperCase());
        //usados para realizar uma comparação entre determinadas situações
        System.out.println();

        System.out.println("( > )  maior ");
        System.out.println("( < ) menor ");
        System.out.println("( != ) diferente");
        System.out.println("( == ) igual  mas para comparar igualdade em uma string uamos o (.equals) " );
        System.out.println("( >= ) maior ou igual ");
        System.out.println("( <= ) menor ou igual " ) ;

        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Operadores logicos ".toUpperCase());
        //  compara situaçoes  para dizer se sao verdadeiras ou não
        System.out.println();

        System.out.println("( && = significa [E] ) Ele compara se duas situaçoes sao verdadeiras ou nao" +
                "\n só ira retornar verdadeiro se ambas situações retornarem o mesmo valor");

        System.out.println("( || = significa [OU] ) compara se uma ou outra situaçao e verdadeira\n" +
                "só retorna verdadeira se uam delas for verdade \n" +
                "e falso se TODAS forem falso ");

        System.out.println("( ! = significa [NEGAÇÂO] ) Este operador tem a funçao de reverter o valor de alguma circustância \n" +
                "por exemplo se a frase ( a camisa é preta ) se mudarmos para (! a camisa é preta )\n" +
                "ficaria assim (a camisa não é preta)" );


        System.out.println("--------------------------------------_-------------------------------------------------------------");

        System.out.println("pré incremento e decremento".toUpperCase());
        System.out.println();
        System.out.println("pode ser usado com ++ ou --");
        System.out.println("aumenta primeiro depois entrega o valor a linha de codigo");
        System.out.println("se:   a=5  quando fazemos   b = ++a (pode diminuir o valor tbm com --a)" );
        System.out.println("o a vira 6 na hora e o b recebe 6");

        System.out.println("***");

        System.out.println("pos incremento".toUpperCase());
        System.out.println();
        System.out.println("entrega o valor atual primeiro depois aumenta");
        System.out.println("Se:  a=10 quando fazemos b = a++");
        System.out.println("o b recebe o 10 e por baixo dos panos o a vira 11");
        System.out.println("como o java e lido da direita p esquerda o certo para nao confundir é:" +
                "pre = --a ou seja diminui primeiro depois me entrega \n pos = a++ ou seja recebe a variavel de depois atualiza ela aumentando ou diminuindo ");
    }
}
