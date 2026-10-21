package Fundamentos.aula12_Interfaces;

public interface apresentacao {

     default void bomdia(){
         System.out.println("Ola bom dia tudo bem ? ".toUpperCase());  // este metodo default ja vem pronto no na classe sem precisar usar o override
     }

     void informacao();

     static void boanoite(){
         System.out.println("Ola boa noite tudo bem ? ".toUpperCase());
     }

    // o metodo default ja esta pronto, nao precisa fazer override so usar
    // o meotodo informação é um metodo abstrato ou seja vai precisar ser sobreescrevido (override)
    // aqui tbm podemos criar ja um metodo statico que chamamos direto pela classe tbm  e não precisa sobreescrever (override)


}
