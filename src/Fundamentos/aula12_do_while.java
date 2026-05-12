package Fundamentos;
import java.util.Scanner;
public class aula12_do_while {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Laço de repetiçao \n do-while".toUpperCase());
        // e a mesma coisa que o while porem este laço realiza a atividade primeiro depois verifica

        int contador = 0; //aqui eu crio a variavel de controle do codigo

        do{ // aqui se inicia o laço ao contrario onde a palavra do significa = faça
            System.out.println("Volta numero: " + contador); //aqui é a atividade que o laço ira realizar
            contador++; // a cada ação(volta) ele atualiza o laço
        }while(contador<4); //aqui ele verifica a condiçao do laço

        // ou seja faz tudo antes, depois verifica se e possivel realizar o laço
        // e um pouco complicado de usar pois pode ocorrer de realizar uma volta que não deveria por isso tome cuidado ao usar

        //outro exemplo

        int numero,soma=0;
        String resposta;
        do{
            System.out.print("Digite um numero: ");
            numero=scanner.nextInt();
            soma+=numero;
            System.out.println("Quer continuar? [S/N] ");
            resposta=scanner.next();    // aqui usamos o NEXT sem o line pois se usarmos o line irá occorer o erro de buffer entao fizemos asim
                                       // agora se nao quiser realizar assim é necessario colocar um scanner.nextLine(); abaixo do  nextInt de numero
        }while(resposta.equals("S")); //aqui estamos verificando se a nossa resposta foi S se caso ela receber N ele sai do laço
        System.out.println("O valor total da some é: " + soma);
    }
}
