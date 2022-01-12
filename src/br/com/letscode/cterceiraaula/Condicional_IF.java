package br.com.letscode.cterceiraaula;

public class Condicional_IF {
    public static void main(String[] args) {

        int firstRandomNumber = (int)(Math.random()*10);
        int secondRandomNumber = (int)(Math.random()*10);
        //Casting para converter um double em inteiro

        System.out.println(firstRandomNumber);
        System.out.println(secondRandomNumber);

        //Condicional simples
        if (firstRandomNumber < 3){
            System.out.println(firstRandomNumber + " é Baixo");
        }

        if (firstRandomNumber > 4){
            System.out.println(firstRandomNumber + " é Alta");
        }

        if (firstRandomNumber % 2 == 0){
            System.out.println(firstRandomNumber + " é Par");
        }

        //Condicional Composta
        if (secondRandomNumber < 3){
            System.out.println(secondRandomNumber + " é Baixo");
        }else if (secondRandomNumber > 4){
            System.out.println(secondRandomNumber + " é Alto");
        }else if (secondRandomNumber % 2 == 0) {
            System.out.println(secondRandomNumber + " é Par");
        }

        //Condicional Alinhada

    }
}
