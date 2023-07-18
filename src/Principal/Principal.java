package Principal;

import Util.Util;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Interface execucao = new Interface();
        ArrayList Dados = new ArrayList();

        int code;
        do {
            code = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite: \n0 - Sair \n1 - Registrar p/carga "
                    + "\n2 - Registrar p/passeio \n3 - Listar \n4 - Alterar \n5 - Excluir \n6 - Obter dados salvos \n7 - Salvar"));

            switch (code) {

                case 0 -> {
                    Util.gravar(Dados);
                    JOptionPane.showMessageDialog(null, "Fim.");
                }

                case 1 -> {
                    execucao.InsereCarga(Dados);
                }

                case 2 -> {
                    execucao.InserePasseio(Dados);
                }

                case 3 -> {
                    if (Dados.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ainda não há dados cadastrados.");
                    } else {
                        execucao.Lista(Dados);
                    }
                }

                case 4 -> {
                    if (Dados.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ainda não há dados cadastrados.");
                    } else {
                        execucao.Altera(Dados);
                    }
                }

                case 5 -> {
                    if (Dados.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ainda não há dados cadastrados.");
                    } else {
                        execucao.Exclui(Dados);
                    }
                }

                case 6 -> {
                    Dados = Util.ler();
                }

                case 7 -> {
                    Util.gravar(Dados);
                }

                default -> {
                    JOptionPane.showMessageDialog(null, "Código inválido, tente novamente.");
                }
            }

        } while (code != 0);

    }

}
