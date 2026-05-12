package Fundamentos;
import java.util.Scanner;
public class aula2_entrada_de_dados {
    public static void main(String[] args) {
        System.out.println("Explicando a entrada de dados ( o famoso Scanner )".toUpperCase());
        //primeiro precisamos impportar a biblioteca Scanner para ter a entrada de dados
        //Agora temos que criar nosso objeto da classe Scanner
        Scanner imput =new Scanner(System.in); // aqui criamos nosso scanner e o chamamos de imput foi so o nome que eu quis colocar p variavel criada
        // mas geralmente em  java nos usamos o nome Scanner para usar ela mesma


        // agora para cada tipo de entrada usamos o seu tipo expecifico

        //neste caso aqui estamos criando a variavel e ja chamando o Scanner (imput)

        int numero = imput.nextInt();  //para um numero inteiro

        short sorte = imput.nextShort(); // para um short

        byte bite =imput.nextByte(); // para o byte

        long longe= imput.nextLong(); // para o long

        boolean resposta= imput.nextBoolean();//para o boolean

        float peso = imput.nextFloat(); //para um float

        double num = imput.nextDouble(); // para double


        char caracter = imput.nextLine().charAt(0); // aqui estamos adaptamos o chat para ler com se fosse uma stinrg
        // e ai pegamos somente o primeiro caractere da entrada

        // continuar a explicação...

        //mas se for criar a variavel primeiro e depois chamar o scanner fica asim:
        int numero2; // aqui a variavel e criada vazia
        numero2= imput.nextInt();// aqui usamos o scanner para ler a entrada

        System.out.println("Explicando o buffer no Scanner ".toUpperCase());

        System.out.println(("Quando você usa Scanner, ele lê os dados da entrada (teclado) em pedaços, e guarda isso temporariamente em uma área chamada buffer.\n" +
                "\n" +
                "O problema clássico acontece quando mistura:\n" +
                "\n" +
                "[nextInt()] e " +
                "nextLine() int numero = scanner.nextInt();\n" +
                "String nome = scanner.nextLine(); // <-- problema aqui\n" +
                "\n" +
                "Por quê?\n" +
                "\n" +
                "Quando você digita, por exemplo:\n" +
                "\n" +
                "10 (e aperta Enter)\n" +
                "\n" +
                "O nextInt() pega o 10, mas não consome o Enter (\\n).\n" +
                "\n" +
                "Então o próximo nextLine() lê só esse Enter vazio — e parece que ele “pulou” a entrada. ").toUpperCase());

        int i = imput.nextInt();
        double d = imput.nextDouble();
        float f = imput.nextFloat();

        imput.nextLine(); // 🔥 limpa o buffer UMA vez só

        String nome = imput.nextLine();

        System.out.println(" Isso e um exemplo mas deve ser aplicado por exemplo se houver int+String ou int + float + string  ");

    }
}
