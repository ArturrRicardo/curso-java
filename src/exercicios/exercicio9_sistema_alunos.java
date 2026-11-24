package exercicios;
import java.util.Arrays;
import java.util.Scanner;
public class exercicio9_sistema_alunos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String alunos [] = new String[3];

        float notas [] = new float[3];


        int contador=0;

        while(true){

            System.out.println("menu opções".toUpperCase());
            System.out.println("Informe a opção desejada: ");
            System.out.println(" 1) Cadastrar aluno ");
            System.out.println(" 2) Listar alunos ");
            System.out.println(" 3) Buscar aluno ");
            System.out.println(" 4) Informar média da turma ");
            System.out.println(" 5) Sair ");
            System.out.println("--------------------------------------------");
            System.out.println();
            System.out.print(" Digite a opção desejada: " );


            // este metodo verifica
            if(!sc.hasNextInt()){   // se o valor digitado nao for do tipo inteiro
                System.out.println("Dados invalidos.\n favor digitar novamente");
                sc.nextLine();
                continue;
            }

            int resposta = sc.nextInt();
            sc.nextLine();

            if (resposta==5){
                break;
            }

            switch (resposta) {

                case 1:
                    if (contador >= alunos.length) {
                        System.out.println("Limite de cadastro de alunos atingido!!");
                        continue;
                    }
                    System.out.print("Informe o nome do aluno: ");
                    String nome = sc.nextLine();
                    alunos[contador] = nome;

                    System.out.print("informe a nota do aluno: ");

                    if (!sc.hasNextFloat()) {
                        System.out.println("Nota inválida. Digite um número.");
                        sc.nextLine();
                        continue;
                    }

                    float notadoaluno = sc.nextFloat();
                    notas[contador] = notadoaluno;
                    contador++;
                    break;

                case 2:
                    listarAlunos(alunos);
                    break;

                case 3:
                    System.out.print(" Informe o aluno procurado: ");
                    String busca = sc.nextLine();
                    buscarAluno(alunos, busca);
                    break;

                case 4:
                    System.out.printf("A media de notas da turma é: %.2f%n " , media(notas));
                    break;

                case 5:
                    System.out.println("Saindo do cadastro...");
                    break;

                default:
                    System.out.println("Dados invalidos \n preencha novamente ");
                    continue;


            }
        }

    }

    public static void listarAlunos(String aluno[] ){
        for (String posicoes : aluno){
            System.out.println(posicoes+" ");
        }
    }

    public static void buscarAluno(String buscaraluno[],String nome ){
        Arrays.sort(buscaraluno);
        int procurar = Arrays.binarySearch(buscaraluno,nome);

        if(procurar>=0){
            System.out.println("O aluno " + nome + " pertence a lista " );
        }
        else{
            System.out.println(" Infelizmente o aluno procurado não pertence a lista ");
        }

    }

    public static float media(float media[]){
        float soma=0;
        for (float s:media){
            soma += s;
        }
        float mediatotal = soma/media.length;
        return mediatotal;

    }
}