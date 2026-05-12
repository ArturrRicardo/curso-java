package exercicios;
import java.util.Arrays;
import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        // Contar quantas vezes um número aparece
        //lista com números
        //usuário digita um número
        //contar quantas vezes aparece

        Scanner sc = new Scanner(System.in);

        int numeros[] = {2, 4, 3, 2, 6, 7, 12, 4, 9, 2};

        Arrays.sort(numeros);

        System.out.print("informe o numero desejado : ");
        int resposta = sc.nextInt();
        System.out.println();

        int contador = 0;


        for (int i : numeros) {

            if (i == resposta) {
                contador++;
            }
        }

        if (contador ==1) {
            System.out.println("O valor " + resposta + " aparece  " + contador + " vez na lista ");

        } else if (contador>1) {
            System.out.println("O valor " + resposta + " aparece  " + contador + " vezes na lista ");

        } else{
            System.out.println("o valor " + resposta + " não aparece na lista ");

        }

        sc.close();
    }
}