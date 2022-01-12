package br.com.letscode.dquartaaula;

import java.util.Scanner;

public class MiniCalculadoraComSwitch {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double numero1;
        double numero2;
        double resultado = 0;

        System.out.print("Digite o primeiro numero: ");
        numero1 = entrada.nextDouble();

        System.out.print("DIgite o segundo numero: ");
        numero2 = entrada.nextDouble();

        System.out.print("Digite um operação matematica[* / + -]: ");
        String operacao = entrada.next();

        switch (operacao){
            case "*":
                resultado = numero1 * numero2;
                break;

            case "/":
                resultado = numero1 / numero2;
                break;

            case "+":
                resultado = numero1 + numero2;
                break;

            case "-":
                resultado = numero1 - numero2;
                break;

            default:
                System.out.println("Erro, operação invalida");
                return;
                //Sai do metodo, no caso do main
        }

        System.out.printf("%f %s %f = %f", numero1, operacao, numero2, resultado);
    }
}
