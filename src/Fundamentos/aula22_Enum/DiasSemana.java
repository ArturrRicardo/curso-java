package Fundamentos.aula22_Enum;

public enum DiasSemana {
    SEGUNDA(1),TERCA(2),QUARTA(3),QUINTA(4)
    ,SEXTA(5),SABADO(6),DOMINGO(7);

    private int valores;

    DiasSemana(int valores){
        this.valores=valores;
    }

    public int getValores(){return valores;}


}
// aqui temos um  enum com valores e um construtor
// ele funciona com 2 situaçoes:
// 1 com vc usando o nome da opçao ou 2 voce usa o valor que é respectivo daquela opçao
// com enum nao é preciso instanciar um objeto ou seja usar um new...
// pq o proprio enum ja faz isso por debaixo dos panos de acordo com o valor ja passado
// por exemplo ele ja entende que o valor 1 que ja esta informado na opçao segunda é da opçao segunda e nisso nao precisa ser instanciado

// enum tambem pode possuir metodos
// pode receber tambem nele interfaces
// ele possui seus poroprios metodos internos tambem
// pode ser criado dentro de uma classe tambem

// nao aceita herança


