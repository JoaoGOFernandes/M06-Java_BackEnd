package br.com.letscode.bsegundaaula;

import java.util.Arrays;

public class UsandoParamtros {
    public static void main(String[] args) {
        //Para informar um argumento tem que:

        //1.Abrir o terminal
        //2.Entrar no diretorio do projeto:
            // cd./out/production/M06-Java_Backend
        //3.Executar o arquivo passando o caminho e o parametro
            //java br.com.letscode.segundaaula.UsandoParamtros "parametro 1"

        //Imprimindo o parametro recebido
        System.out.println("Args =" + Arrays.deepToString(args));

        //checando se é par ou impar
        System.out.println(Double.parseDouble(args[0]) % 2 == 0 ? "Par" : "Impar");
        //Como é recebido como string temos que converter para um tipo numeral

        //Ex: java br.com.letscode.segundaaula.UsandoParamtros 12353
    }
}
