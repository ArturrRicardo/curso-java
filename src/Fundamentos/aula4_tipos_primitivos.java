package Fundamentos;

public class aula4_tipos_primitivos {
    public static void main(String[] args) {
        System.out.println("tipos primitvos em java".toUpperCase());
        System.out.println("tipos de cracteres");
        char charr='m'; //determina um caracter
        String nome ="cachorro"; // determina uma palavra

        System.out.println("tipos logicos");
        boolean namorando=false; // valores logicos
        boolean galoDoido=true; // valor logico tambem

        System.out.println("tipos inteiros");
        byte num1 = 127; // tipo de numero interio que vai de -127 ate 127 somente
        short num2 = 32767; // tipo de numero inteiro que vai de -32.768 ate 32.767 somente
        int num3 = 2147483647; // tipo de numero nteiro que vai de -2147483648 ate 2147483647 somente
        long num4 = 9223372036854775807L;//tipo de numero inteiro que vai deste valor negatvo ate o positivo dele

        System.out.println("tipos flutuantes (numeros decimais)");
        float num5 = 66.778f; // numeros deciamais aque vao ate no maximo 7 numeros apos a virgula
        double num6 = 77.77777777; //numeros deciamais que passam de 7 casas apos a virgula

        System.out.println("Variaveis constantes");
        final double  VALOR_DE_PI =3.14; // essa variavel é uma variavel fixa ou seja dentro do codigp numca vamos altera-la

        System.out.println("tipos primitvos de prints em java ".toUpperCase());

        System.out.print("Mostra o print na mesma linha ");
        System.out.println("Mostra o print na linha de baixo ");

        String nome1 = " Joao ";
        float nota = 7.5f;
        System.out.printf("Mostra o print formatado {exemplo:}\n Aluno %s a sua  nota é %2f ",nome1,nota);//e quase um print f de python mas tem suas mudanças

        String pessoa =" Pedro ";
        float peso = 85.9f;
        System.out.format("Mostra o print formatado {exemplo:}\n Olá %s seu peso é %2f ",pessoa,peso);//e quase um print f de python mas tem suas mudanças







    }
}
