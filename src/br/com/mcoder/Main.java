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


        while (isOpcaoValida(opcao)){

            if(isOpcaoCadastro(opcao)){
                String nome = JOptionPane.showInputDialog(null, "Digite os dados do cliente \n-Nome-");
                String cpf = JOptionPane.showInputDialog(null, "-CPF-");
                String genero = JOptionPane.showInputDialog(null, "-Genero-");
                String cidade = JOptionPane.showInputDialog(null, "-Cidade-");
                String estado = JOptionPane.showInputDialog(null, "-Estado-");

            }else{

            }
            break;
        }
    }

    private static boolean isOpcaoCadastro(String opcao) {
        if("1".equals(opcao)){
            return true;
        }else{
            return false;
        }

    }

    private static boolean isOpcaoValida(String opcao) {

        if(opcao.isEmpty()){
            return false;
        }
        return true;
    }
}
