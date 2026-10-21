package exercicios.calculadora_com_enum;

public enum Calculadora_Enum implements operacao{
    ADICAO('+') ,SUBTRACAO('-'), MULTIPLICACAO('*'), DIVISAO('/');

    private char simbolo;

    Calculadora_Enum(){;}

    Calculadora_Enum(char simbolo){
        this.simbolo=simbolo;
    }

    public char getSimbolo(){return simbolo;}


    @Override
    public double operacao(double x, double y) { // quando usamos o switch com metodos que usa return nao precisa usar o break
        switch (this){
            case ADICAO:
                return x+y;


            case SUBTRACAO:
                return x-y;


            case MULTIPLICACAO:
                return x*y;


            case DIVISAO:
                return x/y;


            default:
                return 0;

        }
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(" simbolo: ".toUpperCase());
        sb.append(getSimbolo());
        String novo = sb.toString();
        return novo;

    }
}
