package exercicios;
import java.util.Scanner;
import java.util.ArrayList;
public class exercicio5 {
    public static void main(String[] args) {
        // Menu com while (MUITO IMPORTANTE)
        //
        //Exemplo:
        //
        //1 - adicionar número a lista
        //2 - listar números
        //3 - sair

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        while(true){
            System.out.println("=== Menu opções ==== ".toUpperCase());
            System.out.println("Escolha uma das opções: ");
            System.out.println(" 1) Adicionar numeros a lista ");
            System.out.println(" 2) apresentar todos os numeros contidos na lista");
            System.out.println(" 3) Sair ");
            System.out.println("Informe a opção desejada: ");

            int resposta = sc.nextInt();
            sc.nextLine();

            System.out.println();
            System.out.println();

            switch (resposta){
                case 1 :
                    System.out.println("Digite o numero a ser adicionado: ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    numeros.add(num);
                    break;

                case 2:
                    System.out.println("Numeros da lista: ");
                    System.out.println(numeros);
                    break;

                case 3:
                    System.out.println(" Encerrando o menu..." );
                    break;

                default:
                    System.out.println("Dados invalidos \n Favor informar novamente");
                    continue;
            }

            if (resposta == 3 ){
                break;
            }
        }

        sc.close();
    }
}
