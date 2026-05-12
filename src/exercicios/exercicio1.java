package exercicios;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        //ler 5 ou 10 números
        //mostrar o maior e o menor

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1° numero: ");
        int resposta = sc.nextInt();
        int maior = resposta , menor = resposta;

        for ( int v=1; v<5; v++){
            System.out.print(" Digite o " + (v+1) + "°" + " numero : " );
            resposta = sc.nextInt();

            if (resposta>maior){
                maior=resposta;
            }
            if (resposta<menor){
                menor=resposta;
            }
        }
        System.out.println("O maior numero digitado foi: " + maior );
        System.out.println("O menor numero digtado foi: " + menor);

        sc.close();
    }
}
