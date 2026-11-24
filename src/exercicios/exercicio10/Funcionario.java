package exercicios.exercicio10;


import java.util.ArrayList;
import java.util.Scanner;
public class Funcionario {
    private String nome;
    private Integer horas;
    private Double valorPorHora;

    public Funcionario(){;}

    public Funcionario(String nome, Integer horas, Double valorPorHora){
        this.nome=nome;
        this.horas=horas;
        this.valorPorHora=valorPorHora;
    }

    public String getNome(){return  nome;}
    public Integer getHoras(){return  horas;}
    public Double getValorPorHora(){return valorPorHora;}

    public Double pagamento(){
        return getHoras()*getValorPorHora();
    }

}
