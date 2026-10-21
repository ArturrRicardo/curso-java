package Fundamentos.aula10_vetor_e_Arraylist;
import java.util.ArrayList;
public class aula15_Arraylist {
    public static void main(String[] args) {
        System.out.println("Arraylist".toUpperCase());
        // parecido com o array (vetor) porem nao possui tamanho fixo
        // Só aceita somente um tipo primitivo tambem
        //sintaxe

        ArrayList<String> nomes = new ArrayList<String>(); // chama o arraylist informa o tipo (sempre pelas wrapper class), nomeia o objeto (que no caso aqui é o arraylist), e apos cria o objeto arraylist ( que neste caso se chama (nomes))

        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("Pedro");
        nomes.add("Joao");

        // aqui adicionei cada valor em expecifico, mas posso continuar adicionando mais valor se precisar

        System.out.println(nomes); // aqui eu posso mostrar meu arraylist sem precisae de laço de repetição

        for(String p:nomes){ //aqui usamos o for each (laço de repetiçao para estar mostrando o arraylist
            System.out.println(p); // aqui ele mostra todas as casas em volta por volta
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

        System.out.println(numeros.contains(3)); // aqui estamos verificando se temos no nosso arraylist o valor 3, ele retorna valor boleano
        System.out.println(numeros.contains(30));


        System.out.println(numeros.indexOf(1234)); // informa a posição do valor dentro do arraylist (casa onde ele esta)
        System.out.println(numeros.indexOf(2));  // quando nao acha o valor na posição ele retorna -1 ( ou seja aqui n temos nenhuma casa com o valor 2 )n

        numeros.set(1,444); // aqui usamos o metodo de subistituir o elemento da posição por outro, no nosso caso trocamos o elemento da posiçao 1 por 444
        System.out.println(numeros.get(1));



    }
}
