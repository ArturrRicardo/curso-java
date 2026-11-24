package Fundamentos.aula26_TratamentoDeErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Verificacao_com_finally {

    public static void main(String[] args) {
        String[] frutas = {"Maça", "Banana", "Uva"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para saber qual fruta é: ");
        try {
            int num = sc.nextInt();
            System.out.println(frutas[num]);
        }catch(ArrayIndexOutOfBoundsException erro ){
            System.out.println("Ocorreu um erro ");
            System.out.println("valor insuficiente dentro da lista ");
            System.out.println(erro.getMessage());
        }catch ( InputMismatchException erro ){
            System.out.println("Ocorreu um erro");
            System.out.println("valor digitado invalido ");
            System.out.println(erro.getMessage());
        }finally {
            System.out.println("Busca encerrada.");
            System.out.println("memoria liberada");
            sc.close();
        }

        // aqui temos um exemplo de tratamento de excecoes usando o finally
        // o finally e uma palvra chave usada no try-catch , que é opcional no codigo
        // ele SEMPRE sera execultado mesmo se o bloco cair dentro de um catch
        // ele só nao sera executado , se dentro do catch possuir a palavra
        // system.exit(0);
        // que ai o catch funciona e n exibe o finally

    }
}
