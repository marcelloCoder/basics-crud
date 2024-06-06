package br.com.mcoder;

import br.com.mcoder.domain.Cliente;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Marcello", 10L,"Masculino","Passos","MG");

        System.out.println(cliente);
    }
}
