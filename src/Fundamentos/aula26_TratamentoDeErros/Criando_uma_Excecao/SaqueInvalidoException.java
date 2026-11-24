package Fundamentos.aula26_TratamentoDeErros.Criando_uma_Excecao;

public class SaqueInvalidoException extends Exception{


    public SaqueInvalidoException(){
        super("Ocorreu um erro, valor do saque solicitado é maior que o saldo ");
    }

    public SaqueInvalidoException(String mensagem){
        super(mensagem);
    }

    // para criarmos uma exception personalizada e preciso:
    // criar uma classe sendo filha da hierarquia de classes exceptions para que ela herde todas as informaçoes de uma exception
    // e independente da logica da sua exception o ideal sepre é retornar uma mensagem para a classe mae dentro do super assim a sua mensagem pode virar o getmessage

    // neste exemplo aqui criamos uma classe com a nossa exception personalizada onde
    // temos 2 sobrecargas
    // 1 realiza a criacao da classe ja com a mensagem criada
    // a outra te possibilita criar a sua propria mensagem personalizada


}
