package Fundamentos.aula12_Interfaces;

public class pessoa implements apresentacao { // aqui temos a nosaa classe implementando a interface
    private String nome;
    private int idade;

    // quando implementamos uma interface é Obrigatorio que sobreescrevemos (override)os metodos daquela interface
    @Override
    public void informacao() {
        System.out.println("informaçoes pessoais".toUpperCase()+ "\n" + "Nome: " + this.nome + "\n" + "Idade: " + this.idade );
    }

    public static void main(String[] args) {
        pessoa p1 = new pessoa();
        p1.nome= "joao";
        p1.idade=33;

        p1.bomdia();

        p1.informacao();

        apresentacao.boanoite();
    }
}
