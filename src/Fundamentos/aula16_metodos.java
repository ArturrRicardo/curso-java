package Fundamentos;

public class aula16_metodos {
    public static void main(String[] args) {

        System.out.println("Metodos se um jeito certo ");

        // metodos sao blocos de codigos que realizam uma tarefa expecifica
        // possuimos 2 diferenças aqui muito importantes nos metodos

        System.out.println("Metodos com Static ");

        // sao tipos de metodos que nao precisam criar objetos

        apresentar();
        int r = somar(3,7);

        System.out.println("Metodos sem o Static ");

        // sao metodos que sao necessarios criar objetos antes de serem usados

        aula16_metodos objeto1 = new aula16_metodos();  // aqui criamos o primeiro objeto da classe

            objeto1.apresentar2("Artur"); // aqui chamamos o metodo APRESNTAR2 que precisa de um nome como parametro para ser executado

        //--------------------------------------------------------------------------------------------------

        aula16_metodos objeto2 =new aula16_metodos(); //criamos o segundo objeto da classe

        System.out.println(objeto2.multiplicar(4,3)); // aqui ja estamos usando o metodo multiplicar no onjeto 2

        //---------------------------------------------------------------------------------------------------



        System.out.println("tipo de RETURN nos metodos ");

        // o return em metodos tem a funçao de retornar algum valor para quem chamar aquele metodo em expecifico como por exemplo

        int resultado = somar(3,3); // aqui a variavel resultado vai guardar o valor da soma de 3+3

        System.out.println(somar(2,2)); // aqui o print vai usar o metodo somar no seu corpo para mostrar a soma de 2+2

        int totalDaConta = somar(10,50) * 2; // aqui usamos o metodo denro de um calculo
        System.out.println(totalDaConta); // aqui estamos mostranod o resultado da conta


        //----------------------------------------------------------------------------------------------

        //resumo;
        // static NAO precisa criar objeto

        // sem STATIC tem q criar objeto

        // VOID quando nao tem retorno

        // RETURN quando tem retorno de algo e precisa informar o tipo de retorno



    }

    public static void apresentar(){  // este metodo nao recebe nenhum parametro para ser criado
        System.out.println("Boa noite");
    }

    //-------------------------------------------------------------------------------------------

    public static int somar(int a, int b){ // este aqui recebe como parametro 2 variaveis do tipo inteiro e recebe como retorno a sua soma
        return a+b;
    }

    //-------------------------------------------------------------------------------------------

    public void apresentar2(String nome){
        System.out.println("Ola ! meu nome é " + nome);

    }

    //-------------------------------------------------------------------------------------------

    public int multiplicar(int a, int b){
        return a*b;
    }


}
