package instituicao.instituicao;

import pacotecomplemento.primeirojava_5bcc.Pessoa;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Instituicao {
    static ArrayList<Aluno> alunos = new ArrayList<>();
    static ArrayList<Professor> professores = new ArrayList<>();
    static ArrayList<Tecnico> tecnicos = new ArrayList<>();

    public static void main(String[] args) {
        String nomeCompleto = JOptionPane.showInputDialog("Digite seu nome completo:");
        String primeiroNome = nomeCompleto.split(" ")[0].toUpperCase();
        String dataAtual = LocalDate.now().format(DateTimeFormatter.ofPattern("ddMMyyyy"));
        String senhaGerada = primeiroNome + dataAtual;

        boolean acesso = false;
        while (!acesso) {
            JOptionPane.showInputDialog("SENHA GERADA" + senhaGerada);
            String senha = JOptionPane.showInputDialog("Digite a senha:");
            if (senha.equals(senhaGerada)) {
                JOptionPane.showMessageDialog(null, "Acesso permitido!");
                acesso = true;
            } else {
                int resposta = JOptionPane.showConfirmDialog(null, "Senha incorreta. Tentar novamente?", "Erro", JOptionPane.YES_NO_OPTION);
                if (resposta != JOptionPane.YES_OPTION) return;
            }
        }

        int opcao;
        do {
            String menu = "Menu:\n" +
                    "1. Cadastrar Aluno\n" +
                    "2. Cadastrar Professor\n" +
                    "3. Cadastrar Técnico\n" +
                    "4. Consultar Pessoas\n" +
                    "5. Editar Pessoa\n" +
                    "6. Excluir Pessoa\n" +
                    "0. Sair";
            String entrada = JOptionPane.showInputDialog(menu + "\n\nDigite o número da opção desejada:");
            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    alunos.add(cadastrarAluno());
                    break;
                case 2:
                    professores.add(cadastrarProfessor());
                    break;
                case 3:
                    tecnicos.add(cadastrarTecnico());
                    break;
                case 4:
                    consultar();
                    break;
                case 5:
                    editar();
                    break;
                case 6:
                    excluir();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opcao != 0);
    }

    static Aluno cadastrarAluno() {
        String nome = JOptionPane.showInputDialog("Nome:");
        String cpf = lerCPF();
        String email = JOptionPane.showInputDialog("Email:");
        String matricula = JOptionPane.showInputDialog("Matrícula:");
        String curso = JOptionPane.showInputDialog("Curso:");
        return new Aluno(nome, cpf, email, matricula, curso);
    }

    static Professor cadastrarProfessor() {
        String nome = JOptionPane.showInputDialog("Nome:");
        String cpf = lerCPF();
        String email = JOptionPane.showInputDialog("Email:");
        String cargo = JOptionPane.showInputDialog("Cargo:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));
        String disciplina = JOptionPane.showInputDialog("Disciplina:");
        int carga = Integer.parseInt(JOptionPane.showInputDialog("Carga Horária:"));
        return new Professor(nome, cpf, email, cargo, salario, disciplina, carga);
    }

    static Tecnico cadastrarTecnico() {
        String nome = JOptionPane.showInputDialog("Nome:");
        String cpf = lerCPF();
        String email = JOptionPane.showInputDialog("Email:");
        String cargo = JOptionPane.showInputDialog("Cargo:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));
        String setor = JOptionPane.showInputDialog("Setor:");
        String turno = JOptionPane.showInputDialog("Turno:");
        return new Tecnico(nome, cpf, email, cargo, salario, setor, turno);
    }

    static String lerCPF() {
        String cpf;
        int status;
        do {
            cpf = JOptionPane.showInputDialog("CPF (somente números):");
            status = Pessoa.validaCpf(cpf);
            if (status != 0) JOptionPane.showMessageDialog(null, "CPF inválido.");
        } while (status != 0);
        return cpf;
    }

    static void consultar() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ALUNOS]\n");
        for (Aluno a : alunos) sb.append(a).append("\n\n");
        sb.append("[PROFESSORES]\n");
        for (Professor p : professores) sb.append(p).append("\n\n");
        sb.append("[TÉCNICOS]\n");
        for (Tecnico t : tecnicos) sb.append(t).append("\n\n");
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    static void editar() {
        String[] tipos = {"Aluno", "Professor", "Técnico"};
        int tipo = JOptionPane.showOptionDialog(null, "Editar:", "Tipo de Pessoa",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, tipos, tipos[0]);

        switch (tipo) {
            case 0:
                editarAluno();
                break;
            case 1:
                editarProfessor();
                break;
            case 2:
                editarTecnico();
                break;
            default:
                break;
        }
    }

    static void editarAluno() {
        if (!alunos.isEmpty()) {
            int i = escolherPessoa(alunos);
            if (i != -1) {
                alunos.get(i).setCurso(JOptionPane.showInputDialog("Novo curso:"));
                alunos.get(i).setMatricula(JOptionPane.showInputDialog("Nova matrícula:"));
            }
        } else JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado.");
    }

    static void editarProfessor() {
        if (!professores.isEmpty()) {
            int i = escolherPessoa(professores);
            if (i != -1) {
                professores.get(i).setDisciplina(JOptionPane.showInputDialog("Nova disciplina:"));
                professores.get(i).setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Nova carga horária:")));
            }
        } else JOptionPane.showMessageDialog(null, "Nenhum professor cadastrado.");
    }

    static void editarTecnico() {
        if (!tecnicos.isEmpty()) {
            int i = escolherPessoa(tecnicos);
            if (i != -1) {
                tecnicos.get(i).setSetor(JOptionPane.showInputDialog("Novo setor:"));
                tecnicos.get(i).setTurno(JOptionPane.showInputDialog("Novo turno:"));
            }
        } else JOptionPane.showMessageDialog(null, "Nenhum técnico cadastrado.");
    }

    static void excluir() {
        String[] tipos = {"Aluno", "Professor", "Técnico"};
        int tipo = JOptionPane.showOptionDialog(null, "Excluir:", "Tipo de Pessoa",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, tipos, tipos[0]);

        switch (tipo) {
            case 0:
                excluirPessoa(alunos);
                break;
            case 1:
                excluirPessoa(professores);
                break;
            case 2:
                excluirPessoa(tecnicos);
                break;
            default:
                break;
        }
    }

    static <T> void excluirPessoa(ArrayList<T> lista) {
        if (!lista.isEmpty()) {
            int i = escolherPessoa(lista);
            if (i != -1) {
                lista.remove(i);
                JOptionPane.showMessageDialog(null, "Pessoa excluída com sucesso.");
            }
        } else JOptionPane.showMessageDialog(null, "Nenhum cadastro encontrado.");
    }

    static <T> int escolherPessoa(ArrayList<T> lista) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lista.size(); i++) {
            sb.append(i).append(" - ").append(lista.get(i)).append("\n\n");
        }
        String input = JOptionPane.showInputDialog("Escolha pelo índice:\n" + sb);
        try {
            int index = Integer.parseInt(input);
            if (index >= 0 && index < lista.size()) return index;
        } catch (NumberFormatException ignored) {
        }
        JOptionPane.showMessageDialog(null, "Índice inválido.");
        return -1;
    }
}
