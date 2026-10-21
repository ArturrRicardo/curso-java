package Fundamentos.aula14_Data_Hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class aula21_Data_Hora2 {

        public static void main(String[] args) {


            // aqui iremos fazer calculos com data e hora
            // por exemplo saber a duração entre uma data e a outra
            // diminuir ou aumentar dias, semanas ou ano

            LocalDate data = LocalDate.parse("2026-10-11");
            LocalDateTime datahora = LocalDateTime.parse("2026-10-11T02:11");
            Instant datahoraglobal = Instant.parse("2026-10-11T02:11:33Z");

            LocalDate umaSemanaAFrente = data.plusDays(7);
            LocalDate umaSemanaAtras = data.minusDays(7);
            LocalDate doisAnosAfrente = data.plusYears(2);
            LocalDate doisAnosAtras = data.minusYears(2);
            LocalDate mesesAfrente = data.plusMonths(3);
            LocalDate mesesAtras = data.minusMonths(7);

            System.out.println("Uma semana a mais: ".toUpperCase() + umaSemanaAFrente);
            System.out.println("uma semana a menos: ".toUpperCase() + umaSemanaAtras);
            System.out.println("dois anos a frente: ".toUpperCase() + doisAnosAfrente);
            System.out.println("dois anos atras: ".toUpperCase() + doisAnosAtras);
            System.out.println("Meses a frente: ".toUpperCase() + mesesAfrente);
            System.out.println("Meses atras: ".toUpperCase() + mesesAtras);


            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println(" ajuste com data e hora ".toUpperCase());

            LocalDateTime aumentoDeHoras = datahora.plusHours(11);
            LocalDateTime menosHoras = datahora.minusHours(5);

            System.out.println("Mais horas: ".toUpperCase() + aumentoDeHoras);
            System.out.println("Menos horas: ".toUpperCase() + menosHoras);

            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("ajuste com data hora global (instant)".toUpperCase());

            Instant menosDias = datahoraglobal.minus(7, ChronoUnit.DAYS);
            Instant maisDias = datahoraglobal.plus(7,ChronoUnit.DAYS);


            System.out.println("Menos dias:".toUpperCase() + menosDias);
            System.out.println("Mais dias: ".toUpperCase() + maisDias);


            // o instant nao possui oe metodos para alteraçoes de ano,mes,dia, entao precisamos passar para ele quanto queremos aletrar e depois usamos o chronounit para definir o que  mudar


            System.out.println("----------------------------------------------------------------------------------------------------------------------");
            System.out.println("calculando duração de tempo entre duas datas".toUpperCase());
            System.out.println("Este metodo não consegue calcular a diferença em anos. \n" +
                    "Ela é feita exclusivamente para medir tempo baseado em horas, minutos, segundos e nanossegundos.".toUpperCase());
            System.out.println();


            Duration duracaoComDataLocal = Duration.between(umaSemanaAFrente.atStartOfDay(),data.atStartOfDay());
            // o local date precisa de uma alteração pois como esta classe calcula duração entre duas datas ela precisa ter tempo (hora,minuto,segundo)
            // por isso precisamos converter o localdate para um local date time  e quem faz isso e o metodo at start of day
            // com isso usamos o atStart0fDay() que pega o primeiro tempo daquela data em expecifico que é as meia noite e 00 minutos,segundos

            Duration duracaoComDateTime = Duration.between(datahora,aumentoDeHoras);

            Duration duracaodatahoraGlobal = Duration.between(menosDias,datahoraglobal);


            System.out.println("Diferença de dias: ".toUpperCase() + duracaoComDataLocal.toDays());
            System.out.println("Diferença de horas: ".toUpperCase() + duracaoComDateTime);
            System.out.println("Diferença de dias: ".toUpperCase() + duracaodatahoraGlobal);

            // se entregarmos uma data a frente da outra receberemos o calculo em negativo
            // por exemplo se calcular a diferenca de horas do dia 01/06/2026 para o dia 30/05/2026 o calculo vai ser p tras
            // se fosse ao contrario iria te retornar o valor normal





        }
    }

