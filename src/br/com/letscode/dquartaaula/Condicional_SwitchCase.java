package br.com.letscode.dquartaaula;

import java.util.Random;

public class Condicional_SwitchCase {
    public static void main(String[] args) {

        int randomNumber = new Random().nextInt(7);
        //Gera um numero inteiro aleatorio entre 0 e 7

        System.out.println("O numero aleatorio é: " + randomNumber);

        switch (randomNumber){
            case 1:
            case 2:
            case 3:
                System.out.println("Netflix");
                break;

            case 4:
            case 5:
                System.out.println("Estudar");
                break;

            case 6:
            case 7:
                System.out.println("Comer");
                break;

            default:
                System.out.println("Malhar");
                break;
        }
    }
}
