package br.com.mcoder.model;

public class Train {
    static long id = 0;

    static void acessCode(int qntd){
        for (int i = 0; i < qntd; i++) {
            id++;
            System.out.printf("\n id:"+id);
        }

    }


    public static void main(String[] args) {
        int quantity = 8;
        acessCode(quantity);
    }

}
