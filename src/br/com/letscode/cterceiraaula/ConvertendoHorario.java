package br.com.letscode.cterceiraaula;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertendoHorario {
    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();

        //Convertendo a data usando um formatador especifico
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        System.out.printf("A data agora é: %s %n", formatter.format(date));

        //Convertendo usando os formatadores de saida
        System.out.printf("%td %tB %ty %tH:%tM:%tS %n", date, date, date, date, date, date);
    }
}
