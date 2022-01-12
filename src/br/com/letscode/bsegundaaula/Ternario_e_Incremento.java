package br.com.letscode.bsegundaaula;

public class Ternario_e_Incremento {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("0 == " + i);
        System.out.println(i++ == 1 ? "1 == " + i : "1 != " + i);
        // Mostra 1 != 1
        // Primeiro faz a comparação 0 == 1, que dá diferente e mostra com o valor de i incrementado

        System.out.println(++i == 2 ? "2 == " + i : "2 != " + i);
        // Mostra 2 == 2
        //Primeiro faz o incremento de 2=1+1(i = i + 1) e depois a comparação
    }
}
