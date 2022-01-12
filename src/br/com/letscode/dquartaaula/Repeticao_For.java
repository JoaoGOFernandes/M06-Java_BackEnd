package br.com.letscode.dquartaaula;

public class Repeticao_For {
    public static void main(String[] args) {

        //for simples
        for (int i = 1; i < 10; i++){
            System.out.printf("%d %n", i);
        }

        //for aninhado
        for (int i = 1; i < 5; i++){ //linha
            for (int j = 1; j < 5; j++){ //coluna
                System.out.printf("(%d %d)", i, j);
            }
            System.out.println(); //Pula linha
        }
    }
}
