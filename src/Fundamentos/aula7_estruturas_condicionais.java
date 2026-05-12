package Fundamentos;

import java.util.Scanner;
public class aula7_estruturas_condicionais {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // criar o objeto scanner primeiro
        float num,num2,media;

        System.out.println("infome as notas");

        num=scanner.nextFloat();
        num2= scanner.nextFloat();  //aqui vamos ler as 2 variaveis (ou seja receber o valor digitado)

        media=(num+num2)/2;

        // aqui criamos as estruturas condicionais onde tem o objetivo de realizar determinada ocasiao caso a condiçao se encaixe nela
        // possuimos as seguintes estruturas
        // se (if) ou seja: se a sua condiçao se encaixar aqui, faça isso
        // else if (senao se) ou seja: se a sua condiçao nao se encaixar no if realize o else if
        //else (senao) ou seja: se a sua condiçao na se encaixar em nenhuma das outras acima realize este aqui.

        if (media>9){
            System.out.println("Parabens");//primeira condiçao é se a sua media for maior que 9 mostre a palavra parabens
        }
        else if (media>5 && media<9){
            System.out.println("muito boa sua nota"); // aqui se a nota for entre 5 e 9 mostre a mensagem
        }
        else{
            System.out.println("precisamos melhorar isso "); // aqui informa se a nota for diferente das outras 2 condiçoes mostre a mensagem
        }

        System.out.println("Sua nota é: " + media);

    }
}
