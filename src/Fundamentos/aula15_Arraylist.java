package Fundamentos;
import java.util.ArrayList;
public class aula15_Arraylist {
    public static void main(String[] args) {
        System.out.println("Arraylist".toUpperCase());
        // parecido com o array (vetor) porem nao possui tamanho fixo
        // Só aceita somente um tipo primitivo dentro tambem
        //sintaxe

        ArrayList<String> nomes = new ArrayList<String>(); // chama o arraylist informa o tipo (sempre pelas wrapper class) nomeia o objeto e cria o objeto

        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("Pedro");
        nomes.add("Joao");

        // aqui adicionei cada valor em expecifico, mas posso continuar adicionando mais valor se precisar

        System.out.println(nomes); // aqui eu posso mostrar meu arraylist sem precisae de loop

        for(String p:nomes){ //aqui usamos o for each (laço de repetiçao para estar mostrando o arralist
            System.out.println(p);
        }

        nomes.clear(); // metodo para apagar todos os dados contidos no arraylist




        System.out.println("Criando outro Arraylist");
        System.out.println(" ..................................  ");

        ArrayList <Integer> numeros = new ArrayList<Integer>(); //criei um array do tipo int

        numeros.add(15);
        numeros.add(30);
        numeros.add(45);

        System.out.println(numeros.get(1)); // aqui eu estou mostrando somente uma posição do arraylist usamos o  metodo getter junto com o arraylist

        numeros.remove(2); // aqui estou deletando o valor da casa 2

        numeros.add(1234);

        for(int v:numeros){
            System.out.print(v + " / ");
        }

        System.out.println();
        System.out.println("O tamanho do arraylist é: " + numeros.size()); // aqui ele me informa o tamanho do arraylist usndo o .size()

        System.out.println(numeros.contains(3)); // aqui estamos verificando se temos no nosso arraylist o valor 3 ele retorna valor boleano
        System.out.println(numeros.contains(30));


        System.out.println(numeros.indexOf(1234)); // informa a posição do valor dentro do arraylist
        System.out.println(numeros.indexOf(2));  // quando nao acha o valor na posição ele retorna -1

        numeros.set(1,444); // aqui usamos o metodo de subistituir o elemento da posição por outro, no nosso caso trocamos o elemento da posiçao 1 por 444
        System.out.println(numeros.get(1));



    }
}
