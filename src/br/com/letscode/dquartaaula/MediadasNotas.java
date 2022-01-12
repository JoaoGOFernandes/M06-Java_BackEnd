package br.com.letscode.dquartaaula;

import java.util.Scanner;

public class MediadasNotas {
    public static void main(String[] args) {
        int quantidade = 0;
        double media = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da primeira nota: ");
        double nota = entrada.nextDouble();

        while(nota >= 0) {
            if (nota <= 10){
                media += nota;
                quantidade++;
            }else{
                System.out.print("Valor digitado deve ser menor que 10");
            }
            System.out.println("Digite o valor da nota seguinte: ");
            nota = entrada.nextDouble();
        }

        if (quantidade == 0){
            System.out.println("Nenhum valor digitado para fazer o calculo da media");
        }else{
            System.out.printf("O resultado da media da %d provas é de %.2f: ", quantidade, media/quantidade);
        }
    }
}
