package br.com.letscode.dquartaaula;

import java.util.Scanner;

public class Repeticao_While {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String text = "n";

        //Enquanto nao for escrito "S" o programa nao fecha
        while(!text.equalsIgnoreCase("s")){  //Aceita maiusculo e minusculo
            System.out.println("Deseja finalizar o programa? [s/n]: ");
            text = entrada.next();
        }
        //While nao determinado - não tem uma quantidade de loop definido


        entrada.close();

    }
}
