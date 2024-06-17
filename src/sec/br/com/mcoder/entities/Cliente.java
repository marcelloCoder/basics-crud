package sec.br.com.mcoder.entities;

import java.util.Objects;

public class Cliente {

    private Long codigo;
    private String nome;
    private Double saldo;

    public Cliente() {

    }

    public Cliente(String nome, Double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void deposito(Double quantia){
        saldo += quantia;
        System.out.println("Novo saldo: " + saldo);
    }

    public void saque(Double quantia){
        saldo -= quantia + 2.5;
        System.out.println("Novo saldo: " + saldo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(codigo, cliente.codigo) && Objects.equals(nome, cliente.nome) && Objects.equals(saldo, cliente.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, saldo);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }


}
