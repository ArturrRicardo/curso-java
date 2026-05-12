package Fundamentos;

public class aula6_incremento {
    public static void main(String[] args) {
        System.out.println(" Pre incremento e pos incremento".toUpperCase());


        System.out.println(" Pos incremento");

        // POS INCREMENTO = faça tudo primeiro, depois incrementa

        int a = 5 ;
        int b = 5 + a++; //no pos incremento durante a operação tudo que precisa ser feito vai ser feito antes de incrementar o numero
        // aqui temos:
        // 5 + a=(5)++
        // aqui o resultado vai ser 5+5 = 10 depois vai incrementar o a para +1
        // a = 6
        // entao nao vamos conseguir ter o resultado da soma como 11 pois o a++ ta sendo incrementado depois da operação
        System.out.println(b);//aqui ele irá imprimir 10
        System.out.println(a); // aqui ele irá imprimir 6

        System.out.println(" Pre incremento");

        // PRE INCREMENTO = incremente primeiro depois faça tudo

        int c = 4;
        int d = 4 + ++c;// no pre incremento durante a operação, vai ser incrementado o valor primeiro depois realiza a operação
        System.out.println(d); // aqui veremos 9
        System.out.println(c);// aqui ele sera 5 pois ja recebu seu incremento
        // aqui temos:
        // 4 + ++(c)=4
        // o resultado aqui vai ser 4 + 5 = 9 pois incrementa o c primeiro
        //ou seja o c nestasituaçao ja vai estar valendo 5



        // Estas operações podem ser feitas com o ++ ou --


    }
}
