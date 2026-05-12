package Fundamentos;
import java.util.Arrays;     // neste codigo o array importado é so para mostrar o metodo abaixo
public class aula14_vetor {
    public static void main(String[] args) {
        System.out.println("Vetores");
        // E uma estrutura que guarda varios valores do mesmo tipo em uma mesma variavel
        // como é estruturado?
        //pode ser feito de 2 formas
        int vetor []= new int[3];  //É necessario colocar o [] para criar o vetor pode ser antes ou depois do nome da variavel
        // aqui ja estamos informando que esta variavel irá receber 3 valores de vao da casa zero (0) ate a casa (2)
        // isso totaliza 3 valores
        // para isso é necessario qdicionar os valores individualmente
        vetor[0]=25;   // aqui estamos informando que na posicao zero o valor que sera inserido é 25
        vetor[1]=16;
        vetor[2]=49;

        // aqui ja informamos todos os valores que estao dentro do nosso vetor

        //agora para mostrarmos ele é necessario criar um laço para percorrer cada area do nosso vetor e ai sim nos mostar ele
        //ou
        // transformar nosso vetor em string

        System.out.println(Arrays.toString( vetor));



        for (int p=0; p<=2;p++){ // aqui mandamos ele fazer a volta no mesmo tamanho dos vetores
            System.out.println(vetor[p]); // ja aqui mandamos ele printar o vetor na posiçao do laço ou seja

            // na primeira volta do laço (p) ele começará com zero (0)
            // e como o nosso vetor tbm começa com 0, o laço faz meio que uma leve junçao para mostrar
        }

        System.out.println("Mostrando outro vetor abiaxo :");
        System.out.println("................................ ");

        // OUTRA FORMA DE CRIAR NOSSO VETOR


        int vetores[] = {7,14,21,28,35}; // aqui ja estamos criando nosso vetor com os valores ja inseridos nele

        //mostrando os valores

        for (int v=0;v<= vetores.length-1;v++){ // aqui criamos o  laço e pedimos que ele começe em zero, e va de
                                               // zero ate o tamanho total do meu vetor -1
                                              // pq o meu vetor possui 5 casas mas o laço começa em zero entao ele vai ir de 0 ate 4  e contando com o zero junto dao 5 casas
            System.out.println(vetores[v]);

            // esta forma usando length é melhor pois n precisa ficar sabendo qual e o tamanho ideal do vetor pois o length ja sabe

            // ou pode ser assim tbm v<vetores.length isso faz com que o laço consiga chegar ao mesmo tamanho do length e para o laço

        }

        System.out.println("Mostrando outro vetor: ");
        System.out.println("                   .                      ");

        // outra forma de usar outro vetor usando um for diferente

        String nomes []={"Cachorro","Gato", "Papagaio","Galo"};
        Arrays.sort(nomes); // colocar ele em ordem

        for (String posicoes: nomes ){ //criamos um for do tipo string para percorrer os vetores
            System.out.println(posicoes); // aqui mostramos o vetor(nomes) usando laço
        }

        //Para sabermos encontrarmos um valor que está dentro de uma casa


        int c = Arrays.binarySearch(nomes,"Gato"); // usamos este metodo que precisa como parametro o vetor que ele irá procurar e o que ele esta procurando

        // ele só ira te retornar a casa em que este valor se encontra
        // se ele nao achar ele te devolve um valor negativo

        System.out.println("Encontramos a palavra gato na posição " + c);

        //aqui vamos testar ela somente com valores numericos

        int numericos[]= {3,1,7,4,9,55,345};

        int b = Arrays.binarySearch(numericos,4);

        System.out.printf("o numero 4 se encontra na posição: [ %d ] " , b);

        //atribuindo um vetores com o mesmo valor em todas as casa

        int todos[]=new int[20]; // criamos um vetor com um tamanho de 20 espaços para preencher
        Arrays.fill(todos,7); // aqui usamos um metodo para olocar o numero 7 nas 20 casas do nosso vetor


            for(int j:todos){   //aqui estamos mostrando o nosso vetor com os 20 valores ja preenchidos
                System.out.println("os valores são: " + j);
            }




    }
}
