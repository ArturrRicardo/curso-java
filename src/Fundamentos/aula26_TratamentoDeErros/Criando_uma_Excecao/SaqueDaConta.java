package Fundamentos.aula26_TratamentoDeErros.Criando_uma_Excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SaqueDaConta {

    private double saldo;
    private String nome;

    public SaqueDaConta(){}


    public SaqueDaConta(String nome, double saldo){
        this.saldo=saldo;
        this.nome=nome;
    }

    public SaqueDaConta(String nome){
        this.nome=nome;
        this.saldo=0;
    }


    public double getSaldo(){return saldo;}
    public String getNome(){return nome;}

    public void depositar(double valor ){
        this.saldo=valor;
    }

    public void sacar(double valor) throws SaqueInvalidoException{
        if (getSaldo()>valor){
            this.saldo-=valor;
        }
        if(getSaldo()<valor){
            throw new SaqueInvalidoException();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SaqueDaConta s1 = new SaqueDaConta("heitor");

        s1.depositar(1500);
        System.out.println(s1.getSaldo());
         double valor;
        try {
            System.out.print("informe o valor a ser sacado: ");
            valor = sc.nextDouble();
            sc.nextLine();
            s1.sacar(valor);

        }catch(SaqueInvalidoException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("ocooreu um erro , voce digitou um valor que nao é numerico");
        }finally {
            System.out.println("codigo finalizado.");
            sc.close();
        }
        System.out.println("Saldo atual da conta: ");
        System.out.println(s1.getSaldo());

    }
}

// aqui criamos uma classe simples onde o ojetivo maior é somente realizar saque e deposito com metodos expecificos
// o nosso metodo sacar ele ultiliza a nossa exception personalizada para a verificação dos valores
// o metodo obriga a quem usar ele , realizar o trataento de erro

// logo dentro da classe main realizamos o tratamento do metodo e tambem das exceçoes que podem ocorrer durante o codigo.