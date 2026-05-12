package exercicios;
import java.util.ArrayList;
import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        //Separar pares e ímpares
        //ler números
        //colocar pares em uma lista
        //ímpares em outra

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> todos = new ArrayList<Integer>();
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares =new ArrayList<Integer>();

        int contador=0, par=0 ,impar=0 ;


        while (true){
            System.out.println("Iforme a opção desejada ");
            System.out.println("1) Adicionar  numero: ");
            System.out.println("2) Sair ");
            System.out.println();
            System.out.print("Digite sua opção: ");

            int resposta = sc.nextInt();
            sc.nextLine();

            System.out.println();
            System.out.println();

            switch (resposta){
                case 1:
                    System.out.println(" Informe o numero a ser adicionado :");
                    int numeoAdicionado = sc.nextInt();
                    sc.nextLine();
                    todos.add(numeoAdicionado);

                    if (numeoAdicionado%2==0){
                        pares.add(numeoAdicionado);
                        par++;
                    }else {
                        impares.add(numeoAdicionado);
                        impar++;
                    }

                    break;

                case 2:
                    System.out.println("Saindo do programa...".toUpperCase());
                    break;

                default:
                    System.out.println("Dados invalidos \n Favor informar novamente: ");
                    continue;
            }


            if(resposta==2){
                break;
            }

            contador++;

        }

        System.out.println(" Foram informados " + contador + " numeros sendo \n " + par + " pares \n " + impar + " impares" );
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("Lista de numeros pares: \n " + pares);
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println(" Lista de numeros impares: \n " + impares);
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("Lista completa : \n " + todos);

        sc.close();
    }
}
