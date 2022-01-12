package br.com.letscode.bsegundaaula;


public class TiposPrimitivos {

    public static void main(String[] args) {

        System.out.println("PARTE1: Formatação de uma string");
        String nome = "Joao";
        var sobrenome = "Gabriel"; //É identificado como string e tipado de forma que nao pode mudar depois
        int idade = 23;

        String frase1 = "O " + nome + " " + sobrenome + " tem " + idade + " anos de idade.";
        String frase2 = String.format("o %s %s tem %d anos de idade.", nome, sobrenome, idade);

        System.out.println(frase2.equals(frase1)); //Por conta do o minusculo dá false
        System.out.println(frase2.equalsIgnoreCase(frase1)); //Ignora a diferença de minusculo-maiusculo

        System.out.println("PARTE2: Criação e uso de Constante");
        final double fator = 2.20462; //Definindo uma constante
        double peso = 100;
        double libra = peso * fator;

        System.out.println("O valor de " + peso + "(kg) em libra é "+ libra + "lb");

        System.out.println("PARTE3: Exercício sobre area");
        final double pi = 3.14;
        int raio = 3;

        float floatarea = (float) (raio * raio * pi); //Tem uma perda de casa decimais porque gera um double
        double doublearea = (raio * raio * Math.PI);



        System.out.println(floatarea);
        System.out.println(doublearea);


        System.out.printf("ola %s", "pessoa");
    }
}
