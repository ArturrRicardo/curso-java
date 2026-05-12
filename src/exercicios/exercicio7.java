package exercicios;
import java.util.ArrayList;
import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        //Soma de todos os valores (com metodo)

        Scanner sc = new Scanner(System.in);

        // escolher fazer com lçao ou nao
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for(int i=0;i<10;i++){
            System.out.println("Digite um numero: ");
            int insert = sc.nextInt();
            numeros.add(insert);

        }
        System.out.println(numeros);
        int total= soma(numeros);
        System.out.println("A soma de todos os 10 numeros foi : " + total);





    }

    public static int soma (ArrayList<Integer>valores){
        int soma=0;
        for(int i:valores){
            soma+=i;
        }
        return soma;
    }

}
