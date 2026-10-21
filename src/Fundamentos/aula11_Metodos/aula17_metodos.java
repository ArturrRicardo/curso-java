package Fundamentos.aula11_Metodos;

public class aula17_metodos {
    public static void main(String[] args) {

        System.out.println("Metodos de um jeito certo ");

        // metodos sao blocos de codigos que realizam uma tarefa expecifica
        // possuimos 2 diferenças aqui muito importantes nos metodos

        System.out.println("Metodos Static ");

        // sao tipos de metodos que nao precisam criar objetos

        apresentar(); // aqui estamos chamando os metodos staticos
        int r = somar(3,7);

        System.out.println("Metodos sem o Static ");

        // sao metodos que sao necessarios criar objetos antes de serem usados

        aula17_metodos objeto1 = new aula17_metodos();  // aqui criamos o primeiro objeto da classe
        objeto1.apresentar2("Artur"); // aqui chamamos o metodo APRESNTAR2 que precisa de um nome como parametro para ser executado

        //--------------------------------------------------------------------------------------------------

        aula17_metodos objeto2 =new aula17_metodos(); //criamos o segundo objeto da classe
        System.out.println(objeto2.multiplicar(4,3)); // aqui ja estamos usando o metodo multiplicar no objeto 2

        //---------------------------------------------------------------------------------------------------



        System.out.println("tipo de RETURN nos metodos ");

        // o return em metodos tem a funçao de retornar algum valor para quem chamar aquele metodo em expecifico como por exemplo

        int resultado = somar(3,3); // aqui a variavel resultado vai guardar o valor da soma de 3+3

        System.out.println(somar(2,2)); // aqui o print vai usar o metodo somar no seu corpo para mostrar a soma de 2+2

        int totalDaConta = somar(10,50) * 2; // aqui usamos o metodo soma( ele retorna a soma dos numeros passados ) * a multiplicação que criamos dentro da variavel total da conta
        System.out.println(totalDaConta); // aqui estamos mostranod o resultado da conta = soma(10,50)*2 = (60)*2= 120


        //----------------------------------------------------------------------------------------------

        //resumo;
        // static NAO precisa criar objeto

        // sem STATIC tem q criar objeto

        // VOID quando nao tem retorno

        // RETURN quando tem retorno de algo e precisa informar o tipo de retorno



    }

    public static void apresentar(){  // este metodo nao recebe nenhum parametro para ser criado
        System.out.println("Boa noite");}

    // metodo q nao retorna nada mas só printa a frase boa noite

    //-------------------------------------------------------------------------------------------

    public static int somar(int a, int b) {
        return a+b;}

    // este aqui recebe como parametro 2 variaveis do tipo inteiro e recebe como retorno a sua soma


    //-------------------------------------------------------------------------------------------

    public void apresentar2(String nome){
        System.out.println("Ola ! meu nome é " + nome);}

    //-------------------------------------------------------------------------------------------

    public int multiplicar(int a, int b){
        return a*b;}
    // este aqui ja retorna o valor multiplicado do parametro recebido


}
