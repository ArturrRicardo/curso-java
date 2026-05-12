package Fundamentos;
import java.util.Scanner;
public class aula11_while {
    public static void main(String[] args) {
        System.out.println("estruturas de repetição" .toUpperCase());

        Scanner scanner = new Scanner(System.in);

        // estruturas de repetiçao serve para realizar uma tarefa varias vezes ate que uma condiçao realize a parada
        // para isso é necessario ter uma variavel de controle (ou seja: algo que controle para nao fiar repetido infinitamente)
        // na maioria das vezes chamamos esta variavel de controle de contador

        int contador=0; // aqui criamos o contador
        int numero = 4; // aqui criei uma variavel para uma determinada situaçao dentro do laço

        // a estrutura de repetição e estrututada desta forma
        // while= enquanto (condiçao que esta dentro do parenteses for verdadeira continue o laço , se for false para

        while (contador<11){// aqui estamos indo de 0 a 10 (pois quando chegar ao 11 o contador nao contiuara pq cont=11 nao e < 11, e sim igual a 11 entao a condiçao nao bate e ele encerra o laço
            System.out.println(numero + " x " + contador + " = " + numero*contador );
            contador++;
        }
        System.out.println("Fim do programa");

        // aqui fizemos a estrutura de repetiçao (while) receber uma tabuada
        // onde a cada volta do contador ele realizara uma operação ate o seu fim


        // mas o laço pode receber outras formas de repetiçoes como por exemplo um campo de menus
        // esta estutura ficará um pouco mais complexa

        int resposta =-1; // aqui ja iniciamos a variavel valendo -1 para conseguir entrar no laço

        while (resposta != 0){
            System.out.println("Menu de opçoes ");
            System.out.println("Escolha o prato desejado: ");
            System.out.println("1) Lasanha");
            System.out.println("2) Feijoada");
            System.out.println("3) Estrogonoff ");
            System.out.println("0) Sair do menu");
            System.out.print("Digite sua escolha: ");

            resposta=scanner.nextInt(); // aqui ela ja pede o valor da escolha dentro do laço e compara a cada situaçao (ou case se preferir)

            switch(resposta){ // aqui determinamos cada escolha  desejada do menu
                case 0:
                    System.out.println("Saindo do menu");
                    break; // se a escolha entrar em qualquer caso destes aqui ela precisa funcinar somente uma vez naquela volta, e pode enrtrar somente em um case
                case 1:
                    System.out.println("Perfeito. iremos preparar a sua lasanha");
                    break;
                case 2 :
                    System.out.println(" Boa escolha! \n preparando sua feijoada");
                    break;
                case 3:
                    System.out.println(" Otimo! \n o estrogonoff é o nosso carro chef ");
                    break;
                default:
                    System.out.println(" Dados invalidos ");
            }

            //Podemos utilizar algumas modificações dentro do nosso laço

            int contar =-1;

            while (contar<10){ //crimaos o laço com sua condiçao
                contar++; // ao entrar no laço ele automaticamente ja incrementa +1
                if (contar== 3 || contar==5 || contar==7){ // aqui se a nossa variavel de controle receber o valor 3 5 ou 7
                    continue; // o continue faz com que ele nao termine a volta e volte para o inicio do laço ou seja daqui mesmo volta p cima
                             //ou seja: ignora tudo que está na parte de baixo e volta p inicio do laço
                }
                if (contar==9){ // se a nossa variavel de controle receber 9 entra nesta condiçao aqui
                    break; // e entrando dentro desta condiçao ela faz com o que o laço pare de ser execultado e sai do laço
                }
                System.out.println(" volta numero: " + contar);

            }


        }
        System.out.println(" Fim dos laços ");
    }
}
