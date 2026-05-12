package Fundamentos;
import java.util.Scanner;
public class aula10_switch {
    public static void main(String[] args) {
        System.out.println("switch case".toUpperCase());
        //É uma forma de tomar decisoes quando temos opçoes fixas
        //Ele é muito usado quando temos o valor fixo de uma variavel como:
        // menus (onde precisa escolher uma opçao) / dias da semana (onde cada dia é uma opçao)

        //exemplo de switch case com menu

        System.out.println("Menu de opçoes " .toUpperCase());

        Scanner scanner = new Scanner(System.in);

        int opcoes,idade;
        float peso;
        String nome;

        System.out.println("Informe seus dados pessoais ");

        // aqui abaixo  ja estamos recebendo os valores que vao ser informados no menu

        System.out.print("Nome: ");
        nome= scanner.nextLine();

        System.out.print("Idade: ");
        idade=scanner.nextInt();

        System.out.print("Peso: ");
        peso = scanner.nextFloat();


        // poderiamos pedir estes valores dentro dos case(s) mas, aqui ficou uma forma mais organizada para receber e depois informar

        System.out.println(" Escolha a opçao desejada: " +
                           " 1) nome \n" +
                           " 2) nome e idade \n " +
                           " 3) nome, idade e peso ");


        System.out.print("Informe a opção desejada: ");

        opcoes= scanner.nextInt(); // aqui ja coletamos a opçao desejada para comparar com o switch


        switch (opcoes){
            case 1:
                System.out.println("Bem vindo " + nome);
                break;
            case 2:
                System.out.println(nome + " possui " + idade + " anos de idade");
                break;
            case 3:
                System.out.println(nome + " tem " + idade + " anos de idade e pesa " + peso + "kgs" );
                break;
            default:
                System.out.println("Dados invalidos " );

        }

        // logo o switch possui outras formas de montagem
        // uma delas e misturar o switch com if para um determinado projeto(codigo)

        // um jeito seria a opçao bancaria

        double saldo = 1000;  // determinamos um valor para o saldo da conta


        System.out.println(" Sistema bandario " .toUpperCase());
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar"); // aqui mostra as opçoes


        System.out.print("informe a opçao desejada: ");
        int escolha = scanner.nextInt(); // aqui recebemos a escolha dele


        switch (escolha) {
            case 1:
                System.out.println("Saldo: " + saldo);
                break;

            case 2:
                System.out.print("Valor para sacar: ");
                double saque = scanner.nextDouble();

                // aqui ja usamos o if para realizar comparaçoes para possiveis realizaçao de atividades
                // se a comparaçao for verdadeira, ele realizará o case escolhido

                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.println("Saque realizado");
                    System.out.println(" Seu saldo agora é de : " + saldo  );
                } else {    // o else tambem entra em um conjunto para situaçoes mais complexas
                    System.out.println("Saldo insuficiente");
                }
                break;

            case 3:
                System.out.print("Valor para depositar: ");
                double deposito = scanner.nextDouble();

                // Novamente usamos o if else para verificar casos
                // e se for preciso tambem podemos usar o else if (elif)

                if (deposito > 0) {
                    saldo += deposito;
                    System.out.println("Depósito realizado");
                    System.out.println("Seu novo saldo é: " + saldo);
                } else {
                    System.out.println("Valor inválido");
                }
                break;

                // o defaut serve para caso o usuario digitar uma opçao que nao corresponde com as que estao dispiniveis
                // por exemplo se o usuario digitar (4) ou qualquer outro numero que nao esta corespondente com o case

            default:
                System.out.println("Opção inválida");
        }



    }
}
