package Fundamentos.aula26_TratamentoDeErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Usando_t_hrows {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


        try{


            System.out.print("Informe os numeros a serem digitados: ");
            System.out.print("Primeiro numero: ");
            int num = sc.nextInt();
            System.out.println("Segundo numero: ");
            int num2 = sc.nextInt();
            Usando_t_hrows.dividir(num,num2);


        } catch(ArithmeticException erro){

            System.out.println("Ocorreu um erro ");
            System.out.println(erro.getMessage());

        } catch (InputMismatchException erro ){
            System.out.println("Aconteceu um erro ");
            System.out.println(erro.getMessage());

        }finally {
            System.out.println("tratamento finalizado. ");
            sc.close();
        }
    }


    public static void dividir(int a, int b) throws ArithmeticException{
        System.out.println("Resultado: " + a/b );
    }


    // nesse codigo aqui usamos a palavra chave THROWS
    // ela é responsavel por informar que o metodo precisa ter um tratamento de exeções ( eralmente o throws ja informa a exceção que precisamos tratar)
    // essa palavra é exclusivamente usada em metodos e construtores
    // ou seja aqui o metodo nao realiza o tratamento
    // mas ele deixa a palavra throws como se fosse um aviso no metodo
    //para quem for usar o metodo, realize um try catch antes
}
