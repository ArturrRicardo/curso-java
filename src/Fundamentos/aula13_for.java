package Fundamentos;

public class aula13_for {
    public static void main(String[] args) {
        System.out.println("Repetição -  for".toUpperCase());
        //É outra estrutura de repetição porem nao precisa de variavel de controle (contador)
        // a propria estrutura ja te pede a quantidade de voltas ( incremento) que ela irá possui
        // aqui tbm é recomendavel criar a variavel dentro dele
        // este laço e estruturado por:
        // seu nome( inicialização;consição;incremento)
        // inicialização= criaçao da variavel do laço
        // consição= ate onde este laço vai
        // incremento= de quanto em qunanto a variavel vai ser atualizada

        for( int i = 0; i<11;i+=2){       // criamos a variavel (i) a condiçao é (enquanto i for menor que 11) acrescenta de 2 em 2 em i
            System.out.println(" volta numero: " + i); // aqui é a atividade que o for irá realizar
        }
        System.out.println("fim do laço".toUpperCase());

        // outro exemplo

        for (int i=0; i<12;i+=2){ //começa em zero (0) vai ir de 0 ate 11 e a cada iteração pula de 2 em 2
            if (i%3==0){ // se o valor que estiver em i entrar na divisao por 3 e der resto zero (0)
                continue; // ignora o que está a baixo e volta para o ceomeço do laço
            }
            System.out.println(i);// se nao entrar no if print o valor de i
        }
    }
}
