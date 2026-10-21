package exercicios.calculadora_com_enum;

public class Calcular {

    Calculadora_Enum calc;

    public Calculadora_Enum getCalc(){
        return  calc;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getCalc());
        String novo = sb.toString();
        return novo;

    }

    public static void main(String[] args) {
        Calcular c = new Calcular();
        c.calc=Calculadora_Enum.SUBTRACAO;
        double r = c.calc.operacao(5,3);
        System.out.println(r);
        System.out.println(c);
    }
}
