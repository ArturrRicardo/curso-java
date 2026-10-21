package Fundamentos.aula14_Data_Hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class aula20_Data_Hora {

    public static void main(String[] args) {

        // aprendendo com o neio alvez como informar a ddata e hora de forma correta no seu codigo ou projeto

        LocalDate dataLocal =LocalDate.now(); // informa a data local de hoje
        LocalDateTime dataHoraLocal = LocalDateTime.now();  // informa data e hora de hoje

        System.out.println(dataLocal);
        System.out.println(dataHoraLocal);


        // para data e hora global

        Instant dataHoraGlobal = Instant.now();  // horario padrao do gmt

        System.out.println(dataHoraGlobal);

        // para converter do formato ISO 8601 para data e hora

        LocalDate data = LocalDate.parse("2026-09-18"); // converte do texto para data
        LocalDateTime dataEhora =LocalDateTime.parse("2026-09-18T14:31:33"); // converte do texto para data e hora
        Instant dataEhoraGlobal = Instant.parse("2026-09-18T14:31:33z"); // converte do texto para data e hora padrao gmt de londres
        Instant dataEhoraConvertidaBrasil =Instant.parse("2026-09-18T14:31:33-03:00"); // pega o horario do gmt e coloca no horario do brasil que é gmt-3 ( 3 horas a mais)


        System.out.println(data);
        System.out.println(dataEhora);
        System.out.println(dataEhoraGlobal);
        System.out.println(dataEhoraConvertidaBrasil);

        // converter do texto formatado para datahora

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = LocalDate.parse("18/09/2026",fmt);
        // esta variavel (fmt)  funciona como um construtor , ela recebe como parametro a forma como vai recber os dados
        // e apos isto ela converte para data

        LocalDateTime dataHoraFormatada = LocalDateTime.parse("18/09/2026 21:30",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        // nessa aqui em vez de criar a variavel separada, passamos o parametro que precisariamos direto
        // dentro do propio parametro do localdatetime.parse colocamos o datetimeformaterofpattern

        System.out.println(dataFormatada);
        System.out.println(dataHoraFormatada);

        //passando data e hora separado

        LocalDate dataSeparada = LocalDate.of(2026,9,18); // aqui recebe separadao cada coisa ano mes dia
        LocalDateTime dataHoraSeparada = LocalDateTime.of(2026,9,18,21,30);  // recebe separadao tbm  ano mes dia hora minuto

        System.out.println(dataSeparada);
        System.out.println(dataHoraSeparada);


        // agora temos um objeto do tipo datahora sendo transformado para um formato de texto customizado ( que nao é iso8601)

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("Formatando data hora para texto customizado".toUpperCase());

        DateTimeFormatter forma1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // este aqui é o para a data somente
        DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        DateTimeFormatter form3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        // aqui temos q cirar uma formatação diferente para o instant ( data global) e apos informar a formatação, tem q passar o local do pais (fuso horario do local que vc precisa)
        // nesse caso aqui o form3 esta pegando o horario padrao de londres



        LocalDate customizado1  = LocalDate.parse("2009-03-17");   // este so data local
        LocalDateTime customizado2 = LocalDateTime.parse("2009-03-17T02:22");  // este data hora local
        Instant customizado3 = Instant.parse("2009-03-17T02:22:16Z"); // este data hora global ( este horario informado é o de londres (GMT))

        System.out.println(customizado1.format(forma1));
        System.out.println(customizado2.format(form2));

        // ou pode fazer direto tambem
        System.out.println(customizado2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        // ou ao contrario tambem
        System.out.println(forma1.format(customizado1));

        System.out.println(form3.format(customizado3)); // aqui tem q ser ao contrario pq o instant nao possui o . format para receber

        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("conerter data hora global para data hora local ".toUpperCase());


        LocalDate datahora1 = LocalDate.parse("2026-10-11");
        LocalDateTime datahora2 = LocalDateTime.parse("2026-10-11T02:11");
        Instant datahoraglobal = Instant.parse("2026-10-11T02:11:33Z");

        LocalDate conversao = LocalDate.ofInstant(datahoraglobal,ZoneId.systemDefault()); // aqui convertemos o instant (datahoraglobal) para uma variavel do time datalocal
        // entao a variavel do tipo localdate recebe o instant e considera o zone id como o fuso horario ( nesse caso dessa variavel ela esta considerando o fuso horario do computador que esta rodando o codigo

        LocalDate conversao2 = LocalDate.ofInstant(datahoraglobal, ZoneId.of("Portugal"));// esta recebe como zoneid o pais de portugal


        LocalDateTime conversao3 = LocalDateTime.ofInstant( datahoraglobal,ZoneId.systemDefault());
        LocalDateTime conversao4 = LocalDateTime.ofInstant(datahoraglobal,ZoneId.of("Portugal"));
        // aqui temos a formatação com data e hora

        System.out.println(conversao);
        System.out.println(conversao2);
        System.out.println(conversao3);
        System.out.println(conversao4);

        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("pegando dados separados de uma data local".toUpperCase());

        System.out.println("Dia do mes: " + datahora1.getDayOfMonth());
        System.out.println("Mes: " + datahora1.getMonth());
        System.out.println("Ano: " + datahora1.getYear());

        // hora e minutos sao para variaveis do tipo localdatetime pois essas possuem  hora

        System.out.println("Hora: " + datahora2.getHour());
        System.out.println("Minuto: " + datahora2.getMinute());









    }





}
