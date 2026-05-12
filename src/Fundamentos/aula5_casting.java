package Fundamentos;

public class aula5_casting {
    public static void main(String[] args) {


        // ==========================
        // CASTING EM JAVA
        // ==========================

        // Casting = conversão de tipos de variáveis

        // 🔹 CASTING IMPLÍCITO (automático)
        // acontece quando você converte de um tipo menor para um maior
        // ex: int -> double

                int a = 10;
                double b = a; // aqui o Java faz automaticamente

        // isso acontece porque não há perda de dados
        // um int cabe dentro de um double


        // 🔹 CASTING EXPLÍCITO (manual)
        // acontece quando você converte de um tipo maior para um menor
        // ex: double -> int

                double x = 10.5;
                int y = (int) x; // aqui precisamos forçar a conversão

        // ⚠️ atenção: aqui ocorre perda de dados
        // o valor vira 10 (perde o .5)


        // ==========================
        // ERRO CLÁSSICO DE INICIANTE
        // ==========================

        // mesmo colocando o resultado em double, a conta ainda é feita como int

                int num1 = 10;
                int num2 = 3;

                double resultado = num1 / num2;

        // resultado será 3.0 e não 3.33
        // porque a divisão foi feita entre inteiros


        // 🔥 FORMA CORRETA

                double resultadoCorreto = (double) num1 / num2;

        // agora sim o resultado será 3.333...


        // ==========================
        // RESUMO
        // ==========================

        // casting implícito:
        // automático e seguro (menor -> maior)

        // casting explícito:
        // manual e pode perder dados (maior -> menor)

        // usar casting é importante principalmente em divisões

    }
}
