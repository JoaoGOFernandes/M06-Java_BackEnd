package br.com.letscode.dquartaaula;

public class Marcadores {
    public static void main(String[] args) {
        forDeFora: for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){
                System.out.printf("(%d %d)", i, j);
                if(i % 2 == 0){
                    break forDeFora;
                }

            }
            System.out.println();
        }
        //Quando é encontrado uma linha par todas os loops vao parar a parti do marcador
    }
}
