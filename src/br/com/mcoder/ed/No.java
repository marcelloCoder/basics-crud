package br.com.mcoder.ed;

public class No<T> {

    private T elemento;
    private No proximo;

    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public No(T elemento, No proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("No{");
        sb.append("elemento=").append(elemento);
        sb.append(", proximo=").append(proximo);
        sb.append('}');
        return sb.toString();
    }
}
