package Fundamentos.aula13_Relacionamento_De_Classes;

public class aula19_relacaoentreclasses {
    //Relação entre Classes em POO
    //
    //A relação entre classes representa como um objeto pode "usar" ou "possuir" outro objeto, diferente da herança, que representa "ser um tipo de". Enquanto herança significa "é um", a relação entre classes significa "tem um" ou "usa um". Nesse caso, uma classe guarda um objeto de outra classe dentro de si, como um atributo, e acessa os métodos e atributos dessa outra classe sempre através de um ponto, nunca de forma direta como acontece na herança.
    //
    //Existem quatro tipos principais de relação entre classes: associação, agregação, composição e dependência. Cada uma se diferencia pelo grau de dependência entre os objetos envolvidos e pela forma como o objeto "filho" é criado.
    //
    //A associação é o tipo mais simples e genérico de relação. Nela, duas classes apenas se relacionam entre si, sem que exista uma relação de posse forte. Os objetos são totalmente independentes um do outro, podendo existir separadamente sem qualquer problema.
    //
    //A agregação representa uma relação de posse, do tipo "tem um", mas ainda assim os objetos envolvidos continuam sendo independentes entre si. Nesse tipo de relação, o objeto que será usado como atributo é criado fora da classe que vai recebê-lo, e depois é entregue pronto para ela, geralmente através do construtor. Isso significa que, mesmo que a classe que recebe esse objeto deixe de existir, o objeto entregue continua existindo normalmente em outro lugar do programa.
    //
    //A composição também representa uma relação de posse, do tipo "tem um", porém muito mais forte que a agregação. Nesse caso, o objeto "filho" não tem sentido de existir sozinho, fora do objeto "pai". Por isso, ele é criado diretamente dentro do construtor da classe que vai possuí-lo, nascendo junto com ela. Se o objeto "pai" deixar de existir, o objeto "filho" também deixa de existir, já que sua existência está totalmente atrelada à do pai.
    //
    //A dependência é o tipo mais fraco e mais temporário de relação entre classes. Nesse caso, uma classe utiliza outra apenas de forma momentânea, geralmente recebendo essa outra classe como parâmetro dentro de um méttodo, sem guardar esse objeto como um atributo permanente. Assim que o méttodo termina de ser executado, essa relação deixa de existir.
    //
    //Para identificar qual tipo de relação está sendo usada em um código, a pergunta principal a se fazer é: o objeto "filho" consegue existir sozinho, de forma independente do objeto "pai"? E, além disso, ele nasce criado dentro do construtor da classe pai, ou é criado fora e apenas entregue pronto para ela? Essas respostas ajudam a diferenciar rapidamente entre associação, agregação, composição e dependência.
}
