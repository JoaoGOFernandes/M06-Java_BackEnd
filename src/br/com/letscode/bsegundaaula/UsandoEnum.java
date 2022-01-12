package br.com.letscode.bsegundaaula;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class UsandoEnum {
    public static void main(String[] args) {
        System.out.println(DayOfWeek.WEDNESDAY);
        //Passa o nome do enum criado e a enumeração que vc quer

        System.out.println(DayOfWeek.of(3));
        //passando o dia pelo indice, lembrando que começa em zero

        System.out.println(DayOfWeek.WEDNESDAY.getDisplayName(TextStyle.SHORT, Locale.ITALIAN));
        //Tem alguns metodos associados, mostrando a versao curta em outra linguagem

    }
}
