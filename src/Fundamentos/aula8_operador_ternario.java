package Fundamentos;

public class aula8_operador_ternario {
    public static void main(String[] args) {
        System.out.println("operador ternario ".toUpperCase());
        // operador ternario serve para usar o if else dentro de uma unica linha
        // seu objetivo e atribuir um valor para somente aquela unica variavel
        //ou seja se for necessario dentro do if else , atribuir valor mais de uma variavel usa-se if else

        int n1,n2;
        n1=5;
        n2=10;

        String resultado =( n1 > n2 )?" o maior numero é "+n1:"o maior numero é "+ n2;



        System.out.println(resultado);

        //operador ternario precisa ser construido da seguinte forma:
        // variavel (condição) ? valor se verdadeiro : valor se falso;
        //ou seja o if aqui é representado por (?)
        //e o else é representado por (:)

        // mas ainda pode ser usado com else if (elif) onde haja mais de 2 hipoteses exemplo abaixo

        int idade = 13;

        String verificar;

        verificar = (idade>15 && idade<17)? " Adolescente ": ( idade>18 && idade<25 )? "Jovem" : (idade>30)?"Adulto" : "criança";
        System.out.println(verificar);

        // Aqui quando possuirmos mais de 2 hipoteses e necessario informar a condiçao do operador ternario apos o :
        // pois o : aqui no caso serve como else-if
        //fica assim:
        // verificar (condiçao) se "faça isso " : senao se (condicao)?  "faça isso" : senao se (condição)? "faça isso" : senao for nenhuma dessas "faça isso"
        // aqui o unico que nao irá receber a condiçao sera o else ( representado pelo ultimo dois pontos (:)

        //tambem podemos realizar operaçoes dentro do operador ternario

        int numero1, numero2, result;
        numero1 = 30;
        numero2 = 40;
        result = (numero1 >= numero2)? (numero1+numero2) *2 : numero1+numero2 ;
        System.out.println(result);

        // aqui temos uma expressao dentro do operador ternario onde se for um valor realize uma operação, seno faça a outra




    }
}
