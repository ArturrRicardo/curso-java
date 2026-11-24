package Fundamentos.aula13_Relacionamento_De_Classes.Heranca.Super;

public class Animal {
    public void emitirSom(){
        System.out.println("emitindo o som ");
    }

    public final void respirar(){
        System.out.println("animal respirando".toUpperCase());
    }
    // aqui o metodo pode ser usado, mas ele nao permite sobreescrito
}
