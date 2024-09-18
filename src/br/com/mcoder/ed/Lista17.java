package br.com.mcoder.ed;

public class Lista17 {


    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();
        listaLigada.adicionar("SER");
        listaLigada.adicionar("MTR");
        listaLigada.adicionar("GRT");

        System.out.println("TAMANHO = " + listaLigada.getTamanho());
        System.out.println("PRIMEIRO = " + listaLigada.getPrimeiro().getValor());
        System.out.println("ULTIMO = " + listaLigada.getUltimo().getValor());
        System.out.println(listaLigada.get(0).getValor());
        System.out.println(listaLigada.get(1).getValor());
        System.out.println(listaLigada.get(2).getValor());

    }
}
