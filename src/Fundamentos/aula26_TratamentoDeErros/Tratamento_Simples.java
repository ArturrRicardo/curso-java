package Fundamentos.aula26_TratamentoDeErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratamento_Simples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num;
        double num2;

        for ( int i=0;i<3;i++) {

            try {

                System.out.println("informe os numeros a serem divididos:  ");
                System.out.println("Prmeiro numero: ");
                num = sc.nextDouble();
                System.out.println("Segundo numero: ");
                num2 = sc.nextDouble();
                System.out.println(num + " / " + num2 + " = " + num / num2);

            } catch (InputMismatchException e){
                System.out.println("valor digitado nao é um numero ");
                sc.nextLine();

            }

        }

        sc.close();
    }

    // aqui fizemos um codigo simples para receber 2 numeros e dividi-los
    // o bloco try tem a função de verificar se tem alguma exception (ou erro)  dentro destas linhas de codigo
    // o catch trata o erro que passamos como parametro para ele caso ele aconteça dentro do try
    // nesse caso aqui estamos tratando somente um erro em expecifico informado no catch
    // podemos ter mais de um catch e cada um possuir a sua exception expecifica

}
