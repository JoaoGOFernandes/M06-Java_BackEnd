package br.com.letscode.cterceiraaula;

import java.util.Scanner;

public class ParametrosdeArgumentoseCondicionais {
    public static void main(String[] args) {

        //1.Abrir o terminal
        //2.Entrar no diretorio do projeto:
        // cd./out/production/M06-Java_Backend
        //3.Executar o arquivo passando o caminho do pacote, a classe e o parametro
        //java br.com.letscode.terceiraaula.ParametrosdeArgumentoseCondicionais paramtro1 parametro2

        int tamanhoArgs = args.length;
        int primeiro = 0;
        int segundo = 0;

        Scanner entrada = new Scanner(System.in);

        //Verificando o tamanhoArgs
        System.out.println("A quantidade de args é: " + tamanhoArgs);

        if(tamanhoArgs == 0) {
            System.out.print("Digite o primeiro numero: ");
            primeiro = entrada.nextInt();

            System.out.print("Digite o segundo numero: ");
            segundo = entrada.nextInt();
        } else if (tamanhoArgs == 1){
            primeiro = Integer.parseInt(args[0]);
            System.out.print("Digite o segundo numero: ");
            segundo = entrada.nextInt();
        } else if (tamanhoArgs == 2) {
            primeiro = Integer.parseInt(args[0]);
            segundo = Integer.parseInt(args[1]);
            //O argumento é recebido como string por isso convertemos
        }

        if(args.length < 3){
            System.out.printf("A soma resultante é %d", (primeiro + segundo));
        }else {
            System.out.printf("Falha ao tentar fazer a soma de 2 elementos utilizando %d argumentos", tamanhoArgs);
        }


    }
}
