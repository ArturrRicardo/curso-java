package exercicios.exercicio11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        ArrayList<Produto>produtos=new ArrayList<>();

        System.out.print("quantos produtos serao informados ?");
        Integer resposta = sc.nextInt();
        for (int i =0;i<resposta;i++){
            System.out.println("produto comum, usado ou importado ? ( c / u / i )" );
            char tipo = sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            sc.nextLine();
            switch (tipo){
                case 'C':
                    produtos.add(new Produto(nome,preco));
                    System.out.println("-------------------------------------------------------------------------------");
                    break;

                case 'U':
                    System.out.print("Data da compra: (dd/mm/yyyy) ");
                    String diaCompra = sc.nextLine();
                    LocalDate data = LocalDate.parse(diaCompra,formatado);
                    produtos.add(new ProdutoUsado(nome,preco,data));
                    break;

                case 'I':
                    System.out.print("Custo de importação: ");
                    Double custo = sc.nextDouble();
                    sc.nextLine();
                    produtos.add(new ProdutoImportado(nome,preco,custo));
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
            }
        }

        for (Produto p: produtos){
            System.out.println(p.etiqueta());
        }


    }
}
