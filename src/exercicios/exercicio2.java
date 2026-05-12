package exercicios;
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {

        //Média de notas + aprovados
        //ler várias notas
        //calcular média
        //contar quantos ≥ 7

        Scanner sc =new Scanner(System.in);

        float total =0;

        int contador = 0;

        for(int i=0;i<5;i++ ){
            System.out.print("Digite a " + (i+1) + "°" + " nota: ");
            float notas = sc.nextFloat();

            total+=notas;

            if(notas>=7){
                contador+=1;
            }
        }
        float media = total/5;
        System.out.printf(" A sua media é : %.1f%n" , media);
        System.out.println(" temos " + contador + " notas maiores ou igual a 7 ");

        sc.close();
    }
}
