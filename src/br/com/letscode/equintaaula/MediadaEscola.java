package br.com.letscode.equintaaula;

import java.util.Scanner;

public class MediadaEscola {
    public static void main(String[] args) {
        int qntTurmas = 0;
        int qntAlunos = 0;
        double media = 0;
        double notasEscola[][];

        Scanner entrada = new Scanner(System.in);


        System.out.print("Informe a quantidade de turmas: ");
        qntTurmas = entrada.nextInt();

        System.out.print("Informe a quantidade de alunos: ");
        qntAlunos = entrada.nextInt();

        notasEscola = new double[qntTurmas][qntAlunos];

        for (int i = 0; i < qntTurmas; i++){
            for (int j = 0; j < qntAlunos; j++){
                System.out.printf("Turma %d - Informe a nota do %dº aluno: ", i+1, j+1);
                notasEscola[i][j] = entrada.nextDouble();
            }
            System.out.println("");
        }

        for (double[] Turmas : notasEscola) {
            for (double nota : Turmas) {
                media += nota;
            }
        }

        media /= (qntAlunos * qntTurmas);

        System.out.printf("A media da escola é: %.2f", media);
    }
}
