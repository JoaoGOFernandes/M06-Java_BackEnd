package br.com.letscode.cterceiraaula;

import java.time.LocalDateTime;

public class SaidadeDados {
    public static void main(String[] args) {

        //Printar no console é temporario, aprenda a usar loggers

        //Gera uma saida e pula uma linha
        System.out.println("Ola Mundo");

        //Opção que permite varias formatações diferentes usando Class Formatter
        System.out.printf("Olá %s %n", "pessoa");

        //Mensagem de erro para o sistema
        System.err.println("Deu ruim");

        //Usando classes
        LocalDateTime date = LocalDateTime.now();
        System.out.printf("Olá %tB %n", date);
    }
}
