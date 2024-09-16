package br.com.mcoder.ed;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    public int getTamanho(){
        return this.tamanho;
    }

    public void adiciona(T elemento){
        No<T> celula = new No<T>(elemento);

        if (this.tamanho == 0){
            this.inicio = celula;
        }else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaEncadeada{");
        sb.append("inicio=").append(inicio);
        sb.append('}');
        return sb.toString();
    }

}
