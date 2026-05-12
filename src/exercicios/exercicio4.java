package exercicios;
import java.util.ArrayList;
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        //criar lista de nomes
        //pedir nome para remover
        //mostrar lista atualizada
        ///
        Scanner sc =new Scanner(System.in);

        ArrayList<String> nomes =new ArrayList<String>();

        nomes.add("Joao".toUpperCase());
        nomes.add("Maria".toUpperCase());
        nomes.add("Ana".toUpperCase());
        nomes.add("Bruna".toUpperCase());
        nomes.add("Pedro".toUpperCase());
        nomes.add("Daniel".toUpperCase());

        System.out.println("Qual nome gostaria de remover: " );

        String resposta = sc.nextLine().toUpperCase();

        boolean n=nomes.remove(resposta);

        if (n){
            System.out.println(" Removendo..."+ "("+resposta+")");}
        else{
            System.out.println("O nome procurado não esta na lista ");
        }
        System.out.println(nomes);

        sc.close();
    }
}
