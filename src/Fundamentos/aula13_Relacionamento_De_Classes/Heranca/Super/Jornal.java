package Fundamentos.aula13_Relacionamento_De_Classes.Heranca.Super;

public final class Jornal {
    // comp esta classe possui o final ela n pode ser herdada para nenhuma outra

    public void noticia(){
        System.out.println("boa noite.\n o clube atletico mineiro acaba de ser campeão da copa libertadores".toUpperCase());
    }

    public static void main(String[] args) {
        Jornal j1 = new Jornal();
        j1.noticia();
    }
}
