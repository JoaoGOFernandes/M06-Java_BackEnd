package br.com.letscode.dquartaaula;

import java.util.Scanner;

public class Repeticao_DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String text = "n";

        //Semelhante ao while, mas realiza a validação da condicão apos o primeiro loop
        do {
            System.out.println("Deseja finalizar o programa? [s/n]: ");
            text = entrada.next();
        }while(!text.equalsIgnoreCase("s"));

    }
}
