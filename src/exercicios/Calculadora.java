package exercicios;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int num=0;
        int num2=0;

        while (true){
            System.out.println(" calculadora ".toUpperCase());
            System.out.println("--------------------------------------------");
            System.out.println("Informe a opção desejada :");
            System.out.println(" 1) Soma: ");
            System.out.println(" 2) Subtração: ");
            System.out.println(" 3) Multiplição: ");
            System.out.println(" 4) Divisão: ");
            System.out.println(" 5) Sair: ");
            System.out.println("---------------------------------------------");
            System.out.println();


            // este metodo verifica
            if(!sc.hasNextInt()){                      // se o valor digitado nao for do tipo inteiro
                System.out.println("Dados invalidos.\n favor digitar novamente");
                sc.nextLine();
                continue;
            }

            int resposta = sc.nextInt();
            sc.nextLine();

            if (resposta==5){
                break;
            }

            switch(resposta){


                case 1:

                    System.out.println("Digite os numeros para operação");
                    System.out.print("Primeiro numero : ");
                    num=sc.nextInt();
                    System.out.println("Outro numero: ");
                    num2=sc.nextInt();
                    System.out.println(num  + " + " + num2 + " = " + somar(num,num2));
                    break;

                case 2:
                    System.out.println("Digite os numeros para operação ");
                    System.out.print("Primeiro numero : ");
                    num=sc.nextInt();
                    System.out.println("Outro numero ");
                    num2=sc.nextInt();
                    System.out.println(num + " - " + num2 + " = " + subtrair(num,num2));
                    break;

                case 3:
                    System.out.println("Digite os numeros para a operação: ");
                    System.out.print("Primeiro numero: ");
                    num=sc.nextInt();
                    System.out.println("Outro numero: ");
                    num2= sc.nextInt();
                    System.out.println(num + " * " + num2 + " = " + multiplicar(num,num2));
                    multiplicar(num,num2);
                    break;

                case 4:
                    System.out.println("Digite os numeros para a operação: ");
                    System.out.println("Primeiro numero: ");
                    num=sc.nextInt();
                    System.out.println("Outro  numero: ");
                    num2=sc.nextInt();
                    System.out.println(num + " / " + num2  + " = " + divisao(num,num2));
                    break;

                case 5:
                    System.out.println("Saindo do programa");
                    break;

                default:
                    System.out.println("Dados invalidos \n digite novamente :");
                    continue;

            }
        }
    sc.close();
    }
    public static int somar(int a,int b){
        return a+b;
    }
    public static int subtrair( int a, int b){
        return a-b;
    }
    public static int multiplicar(int a, int b){
        return a*b;
    }
    public static int divisao(int a, int b){
        return a/b;
    }

}
