package Fundamentos.aula22_Enum;

public class Semana {

    private int dia;
    private int mes;
    private int ano;

    private DiasSemana diaDaSemana ;

    public Semana(){}

    public Semana(int dia, int mes, int ano , DiasSemana diaDaSemana){
        setDia(dia);
        setMes(mes);
        setAno(ano);
        setDiaDaSemana(diaDaSemana);
    }

    public int getDia() {return dia;}
    public void setDia(int dia) {this.dia = dia;}

    public int getMes() {return mes;}
    public void setMes(int mes) {this.mes = mes;}

    public int getAno() {return ano;}
    public void setAno(int ano) {this.ano = ano;}

    public DiasSemana getDiaDaSemana() {return diaDaSemana;}
    public void setDiaDaSemana(DiasSemana diaDaSemana) {this.diaDaSemana = diaDaSemana;}

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getDia());
        sb.append(" / ");
        sb.append(getMes());
        sb.append(" / ");
        sb.append(getAno());
        sb.append(" -- ");
        sb.append(getDiaDaSemana());
        String novo = sb.toString();
        return novo;
    }


    public static void main(String[] args) {
        Semana s1 = new Semana(7,1,2001,DiasSemana.QUARTA); // aqui temos um objeto criado com o enum sendo usado no relacionamento da classe
        System.out.println(s1);

        System.out.println("----------------------------------------------------------------------------------------------");

        DiasSemana d = DiasSemana.SABADO;
        System.out.println(d +"--" + d.getValores());
        // aqui vimos que podemos acessar o valor da opçao informada na vairavel d usando o metodo que criamos que é o getvelores
        // que tambem é um atributo que criamos dentro do enum para representar um valor

        System.out.println("----------------------------------------------------------------------------------------------");


        System.out.println("mostrando todos os valores do enum".toUpperCase());
        for(DiasSemana todos: DiasSemana.values()){
            System.out.println(todos);
        }
        System.out.println("Aqui usamos o metodo . values do enum que serve para mostrar todos os valores que temso dentro do nosso enum".toUpperCase());
    }
}
