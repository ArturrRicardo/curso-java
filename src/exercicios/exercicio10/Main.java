package exercicios.exercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionarios possuem na empresa ? ");
        Integer total = sc.nextInt();
        sc.nextLine();

        for( int i=0;i<total;i++){
            System.out.println("coleta de dados dos funcionarios".toUpperCase());
            System.out.print("O funcionario é terceirizado? ");
            String resposta = sc.nextLine().toUpperCase();
            System.out.println("funcionario n° ".toUpperCase() + (i + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("horas trabalhadas: ");
            Integer horas = sc.nextInt();
            System.out.print("Valor por hora trabalhada: ");
            Double horasTrabalhadas = sc.nextDouble();
            sc.nextLine();

            switch (resposta) {

                case("NAO"):
                    funcionarios.add(new Funcionario(nome,horas,horasTrabalhadas));
                    System.out.println("-------------------------------------------------------------------------------");
                    break;

                case("SIM"):
                    System.out.print("Valor da despesa: ");
                    Double despesa = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("-------------------------------------------------------------------------------");
                    funcionarios.add(new Tercerizado(nome,horas,horasTrabalhadas,despesa));

            }
        }


        for ( Funcionario f: funcionarios){
            System.out.println("informação de cada funcionario".toUpperCase());
            System.out.print("Nome: "+ f.getNome());
            System.out.print(" Salario: R$" + f.pagamento());
            System.out.println();
            System.out.println("~~//~~~~~~~~~~~~~~~//~~~~~~~~~~~~~~~~//~~~~~~~~~~~~~~~~//~~~~~~~~~~~~~~~~~//~~~~~~~~~~");
        }

        sc.close();
    }
}
