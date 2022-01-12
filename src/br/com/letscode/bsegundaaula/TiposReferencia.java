package br.com.letscode.bsegundaaula;

public class TiposReferencia {
    public static void main(String[] args) {
            //Autoboxing
        Integer wrapper = 0;   //Injetando em uma classe importada automaticamente
        System.out.println(wrapper); //Valor: 0

            //Unboxing
        int unb = 12;
        System.out.println(unb); //Valor: 12

        unb = wrapper;   //Passando o valor de um objeto para um tipo primitivo
        System.out.println(unb);  //Muda valor: 0

        Integer first = 1;
        Integer second = 1;

        System.out.println(first == second); //True
        System.out.println(first.compareTo(second) == 0); //É zero se for igual. True
        //Foi comparado dois objetos

        System.out.println(first.compareTo(1) == 0); //Mesmo entre com a diferença dá true
        //Foi comparado um objeto e um tipo primitivo

        String numero = "1";
        //A IDE não deixa nem compilar a comparação, precisa converter
        System.out.println(first.compareTo(Integer.parseInt(numero)) == 0);
        //Integer.parseInt é um metodo do wrapper Integer muito util para converção
    }
}
