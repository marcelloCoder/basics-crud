package br.com.mcoder.ed;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
    
    public void adicionar(String elemento){
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }

    public void adicionarMelhor(String valor) throws Exception {
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = valor;
            this.tamanho++;
        }else {
            throw new Exception("TAMANHO LIMITE É: " + this.elementos.length);
        }
    }

    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);
        vetor.adicionar("AAA");

        vetor.adicionarMelhor("DEADPOOL");
        vetor.adicionarMelhor("DEADPOOL2");
        vetor.adicionarMelhor("DEADPOOL3");
        vetor.adicionarMelhor("DEADPOOL4");
        vetor.adicionarMelhor("DEADPOOL5");

    }
}
