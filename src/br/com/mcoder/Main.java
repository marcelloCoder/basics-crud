package br.com.mcoder;

import br.com.mcoder.dao.ClienteMapDAO;
import br.com.mcoder.dao.IClienteDAO;
import br.com.mcoder.domain.Cliente;

import javax.swing.*;

public class Main {

    public static IClienteDAO iClienteDAO;
    public static void main(String[] args) {

        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null, "DIGITE 1 - CADASTRO \n" +
                "DIGITE 2 - CONSULTAR\n" +
                "DIGITE 3 - EXCLUIR\n" +
                "DIGITE 4 - ALTERAR\n" +
                "DIGITE 5 - SAIR\n",
                "Cadastro",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
