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

        while(!isOpcaoValida(opcao)){
                if(opcao.isEmpty()){
                    sair();
                }
            opcao = JOptionPane.showInputDialog(null, "OPÇÃO INVALIDA\n" +
                    "DIGITE 1 - CADASTRO \n" +
                    "DIGITE 2 - CONSULTAR\n" +
                    "DIGITE 3 - EXCLUIR\n" +
                    "DIGITE 4 - ALTERAR\n" +
                    "DIGITE 5 - SAIR\n");
        }

        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isOpcaoCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, GENERO, CIDADE, ESTADO",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar1(dados);
            } else if(isOpcaoConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o cpf",
                        "Consultar", JOptionPane.INFORMATION_MESSAGE);

                consultar(dados);
            }

            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consulta, 3 para cadastro, 4 para alteração ou 5 para sair",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        //Tentar validar se todos os campos estão preenchidos.
        //Se não tiver, passr null no construtor onde o valor é nulo
        //Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],null,dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6])
        Cliente cliente = new Cliente(dadosSeparados[0],null,dadosSeparados[1],dadosSeparados[2],dadosSeparados[3]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void cadastrar1(String dados) {
        String[] dadosSeparados = dados.split(",");

        Cliente cliente = new Cliente();
        cliente.setNome(dadosSeparados[0]);
        cliente.setCpf(null);
        cliente.setGenero(dadosSeparados[2]);
        cliente.setCidade(dadosSeparados[3]);
        cliente.setEstado(dadosSeparados[4]);

        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            System.out.println(cliente);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }



    private static void consultar(String dados) {
        //Validar se foi passado somente o cpf
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static void sair() {
        System.exit(0);
    }

    private static boolean isOpcaoAlterar(String opcao) {
        if("4".equals(opcao)){
            return true;
        }else{
            return false;
        }
    }

    private static boolean isOpcaoExcluir(String opcao) {
        if("3".equals(opcao)){
            return true;
        }else{
            return false;
        }
    }

    private static boolean isOpcaoConsultar(String opcao) {
        if("2".equals(opcao)){
            return true;
        }else{
            return false;
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

        if("1".equals(opcao) || "2".equals(opcao)
                || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }
    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }
}
