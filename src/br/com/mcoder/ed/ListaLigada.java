package br.com.mcoder.ed;

public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private Integer tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }

    public Elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor){
        Elemento elemento = new Elemento(novoValor); // Cria um novo elemento com o valor passado
        if(this.primeiro == null && this.ultimo == null){
            // A lista está vazia, então o primeiro e o último elemento são o novo elemento
            this.primeiro = elemento;
            this.ultimo = elemento;
        } else {
            // Caso a lista já tenha elementos, adiciona o novo elemento no final
            this.ultimo.setProximo(elemento); // Aponta o último para o próximo elemento
            this.ultimo = elemento; // Atualiza o último elemento da lista
        }
        this.tamanho++; // Incrementa o tamanho da lista
    }
    public void remover(String novoValor){

    }

    public Elemento get(int posicao){
        Elemento atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }
}
