package br.com.letscode.dquartaaula;

public class Array_Vetores {
    public static void main(String[] args) {

        //Declarando um vetor
        int[] vetorA = new int[2];
        int vetorB[] = new int[2];
    
        //Inicializando um vetor
        vetorA[0] = 1;
        vetorA[1] = 2;
        //O java é fortemente tipado por isso nao é possivel inserir outros tipos no mesmo vator, ou altera-lo

        System.out.println("-------------------VETOR A---------------");
        System.out.println("Endereço na memoria do vetor A: "+ vetorA);
        System.out.println("Vetor A, primeira posição do vetor: "+ vetorA[0]);
        System.out.println("Vetor A, segunda posição do vetor: "+ vetorA[1]);

        System.out.println("-------------VETOR A Alterado------------");
        vetorA[0] = 3;
        System.out.println("Valor alterado da primeira posição: "+ vetorA[0]);
        //Caso fosse inserido um terceira posição daria erro, pois nao foi declarado
        // EX: vetorA[2] = 3;

        //Caso queira adicionar uma terceira posição é possivel redeclarar o vetor, mas seus valores iniciais sao zerados
        vetorA = new int[3];
        vetorA[2] = 4;
        System.out.println("Primeira posição do vetor: "+ vetorA[0]);
        System.out.println("Segunda posição do vetor: "+ vetorA[1]);
        System.out.println("Terceira posição do vetor: "+ vetorA[2]);


        System.out.println("%n-------------------VETOR B---------------");
        System.out.println("Endereço na memoria do vetor B: "+ vetorB);
        System.out.println("Vetor B, primeira posição do vetor: "+ vetorB[0]);
        System.out.println("Vetor B, segunda posição do vetor: "+ vetorB[1]);
        //Não foi inicializado


        System.out.println("%n-------------------VETOR C---------------");
        //Declarando e inicializando um vetor
        int[] vetorC = new int[]{1,2,3};

        System.out.println("Primeira posição do vetor: "+ vetorC[0]);
        System.out.println("Segunda posição do vetor: "+ vetorC[1]);
        System.out.println("Terceira posição do vetor: "+ vetorC[2]);

        //Como dito anterior um vetor com tipos diferentes gera erro na hora de compilar
        //EX: int[] vetorB = new int[]{1,2,"3"}.

        System.out.println("-------------------ITERANDO UM VETOR---------------");
        //Foreach em um vetor
        //iter é a abreviação para o foreach

        for (int i : vetorC) {
            System.out.println(i);
        }


    }
}
