package br.com.letscode.bsegundaaula;


public class ConversaoTemperatura {

    public static void main(String[] args) {
        //final double fator1 = 9/5;
        // O resultado acaba sendo um int fator1 = 1
        // Uma forma de corrigir é casting ((double) numerorador)/denominador
        final double fator1 = 9.0/5;
        final double fator2 = 32;
        double celsius = 2;

        double fahrenheit = (celsius * fator1) + fator2;

        System.out.println(fahrenheit);
    }
}
