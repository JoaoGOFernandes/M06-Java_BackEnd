package br.com.letscode.cterceiraaula;

import java.util.Scanner;

public class EntradadeDados {
    public static void main(String[] args) {
        int primeiro;
        int segundo;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        primeiro = input.nextInt();


        System.out.print("Digite o segundo numero: ");
        segundo = input.nextInt();


        System.out.println("O primeiro numero foi : "+ primeiro);
        System.out.println("O segundo numero foi : "+ segundo);

        //Cuidados ao concater string com numeros quando a intenção é somar
        //System.out.println("A soma entre eles é: "+ primeiro + segundo);
        //Nesse caso daria 123321 pq concatenaria tudo

        System.out.println("A soma entre eles é: "+ (primeiro + segundo));
        System.out.printf("A soma entre eles é : %d", (primeiro + segundo));
    }
}
