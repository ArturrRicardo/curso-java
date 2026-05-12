package exercicios;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Buscar número na lista
        //usuário digita número
        //verificar se existe
        //mostrar posição


        int numeros [ ] = {3,7,12,55,62,13};

        Arrays.sort(numeros);

        System.out.print("Digite o valor que esta procurando: ");

        int resposta = sc.nextInt();

        int procura = Arrays.binarySearch(numeros,resposta);

        if (procura>=0) {
            System.out.println(" o valor " + resposta + " se encontra na posição " + procura);

        }
        else {
            System.out.println(" o valor  " + resposta + " não se encontra na lista ");
        }
        for(int i:numeros){
            System.out.print(i + " " );
        }


        // com arraylists

        ArrayList<Integer> numero = new ArrayList<Integer>();

        numero.add(5);
        numero.add(3);
        numero.add(44);
        numero.add(123);
        numero.add(77);
        numero.add(98);
        numero.add(45);


        System.out.println();
        System.out.println( "Valores no arraylist ".toUpperCase());

        System.out.print(" Digite o numero procurado no arraylist: ");

        int n = sc.nextInt();

        int encontrar = numero.indexOf(n);

        if(encontrar>=0){
            System.out.println("O valor " + n + " se encontra na posição " +numero.indexOf(n));
        }
        else {
            System.out.println("O valor " + n + " não se encontra na lista ");
        }


        sc.close();
    }

}
