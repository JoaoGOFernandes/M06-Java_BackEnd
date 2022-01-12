package br.com.letscode.equintaaula;

public class Array_Matriz {
    public static final int TAMANHO_TABULEIRO = 8;

    public static void main(String[] args) {
        String tabuleiro[][] = new String[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];

        InicializandoTabuleiro(tabuleiro);

        ImprimeTabuleiro(tabuleiro);
    }

    private static void InicializandoTabuleiro(String[][] tabuleiro) {
        for (int i = 0; i < TAMANHO_TABULEIRO; i++){
            for(int j = 0; j< TAMANHO_TABULEIRO; j++){
                if (i == 1 || i == 6){
                    tabuleiro[i][j] = "p";
                }else if((i == 0 || i == 7) && (j == 0 || j == 7)){
                    tabuleiro[i][j] = "t";
                }else if((i == 0 || i == 7) && (j == 1 || j == 6)){
                    tabuleiro[i][j] = "b";
                }else if((i == 0 || i == 7) && (j == 2 || j == 5)){
                    tabuleiro[i][j] = "c";
                }else if((i == 0 || i == 7) && j == 3){
                    tabuleiro[i][j] = "q";
                }else if((i == 0 || i == 7) && j == 4){
                    tabuleiro[i][j] = "k";
                }else{
                    tabuleiro[i][j] = " ";
                }
            }
        }
    }

    private static void ImprimeTabuleiro(String[][] tabuleiro) {
        for (String[] linhas : tabuleiro) {
            for (String celula : linhas) {
                System.out.printf("|%s|", celula);
            }
            System.out.println("");
        }
    }
}

//Peão = p
//Torre = t
//Bispo = b
//cavalo = c
//rei = k
//rainha = q
