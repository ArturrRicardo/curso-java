package Fundamentos.aula13_Relacionamento_De_Classes.Heranca.Super;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("au au ".toUpperCase());
    }

    public static void main(String[] args) {
        Cachorro toto = new Cachorro();
        toto.emitirSom();

        toto.respirar(); // podemos usar o metodo que é da classe mae, mas nao podemos sobresscrever
    }
}
