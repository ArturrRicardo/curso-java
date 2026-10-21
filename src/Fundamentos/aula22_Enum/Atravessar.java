package Fundamentos.aula22_Enum;

import java.util.Scanner;
public class Atravessar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print( "Qual é a cor do semaforo ? ");
        String semaforo = sc.nextLine().toUpperCase();
        Semaforo resposta = Semaforo.valueOf(Semaforo.class, semaforo); // aqui estamos recebdno o valor digitado pelo usuario que é a cor do semaforo

        switch (resposta) {
            case VERDE:
                System.out.println("Pode atravessar a rua".toUpperCase());
                break;

            case AMARELO:
                System.out.println("Cuidado! não é recomendado atravessar".toUpperCase());
                break;

            case VERMELHO:
                System.out.println("Não pode atravessar".toUpperCase());
                break;
        }

        System.out.println("ou pode tambem ser assim :".toUpperCase());
        System.out.println("---------------------------------------------------------------------------------------");


        Semaforo p1 = Semaforo.VERDE;
        Semaforo p2 = Semaforo.AMARELO;
        Semaforo p3 = Semaforo.VERMELHO;

        System.out.println("escolha um numero de 1 a 3: ".toUpperCase());
        int num = sc.nextInt();

        Semaforo sem = null;
        if ( num==1){
            sem=p1;
        } else if (num==2) {
            sem=p2;
        }else{
            sem=p3;
        }


        switch (sem){


            case Semaforo.VERDE:
                System.out.println("atravesse!".toUpperCase());
                break;

            case Semaforo.AMARELO:
                System.out.println("cuidado ! nao atravesse".toUpperCase());
                break;

            case Semaforo.VERMELHO:
                System.out.println("não atravessar".toUpperCase());
                break;

        }

    }
}
