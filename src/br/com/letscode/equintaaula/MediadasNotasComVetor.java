package br.com.letscode.equintaaula;

import java.util.Scanner;

public class MediadasNotasComVetor {
    public static void main(String[] args) {
        int quantidade;
        double notas[];
        double media = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        quantidade = entrada.nextInt();

        notas = new double[quantidade];

        for (int i = 1; i <= quantidade; i++){
            System.out.printf("Digite a nota do %dº aluno: ", i);
            notas[i] = entrada.nextDouble();
        }

        for (double nota : notas) {
            media += nota;
        }

        media /= quantidade;

        System.out.printf("A media de nota dos %d alunos é de: %.2f", quantidade, media);
    }
}
