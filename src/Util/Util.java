package Util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Util {

    public static void gravar(ArrayList lista) {

        String acesso = "";
        JFileChooser escolhe = new JFileChooser();
        int returnVal = escolhe.showOpenDialog(null);
        if (returnVal == 0) {
            acesso = escolhe.getSelectedFile().getAbsolutePath();
        } else {
            JOptionPane.showMessageDialog(null, "Você não escolheu o arquivo");
        }

        try {
            FileOutputStream arquivo = new FileOutputStream(acesso);
            ObjectOutputStream fluxo = new ObjectOutputStream(arquivo);
            fluxo.writeObject(lista);
            fluxo.flush();
            JOptionPane.showMessageDialog(null, "Dados gravados com sucesso no arquivo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na gravação do arquivo" + (e));
        }
    }

    public static ArrayList ler() {
        ArrayList lista = new ArrayList<>();

        String acesso = "";
        JFileChooser escolhe = new JFileChooser();
        int returnVal = escolhe.showOpenDialog(null);
        if (returnVal == 0) {
            acesso = escolhe.getSelectedFile().getAbsolutePath();
        } else {
            JOptionPane.showMessageDialog(null, "Você não escolheu o arquivo");
        }

        try {
            FileInputStream arquivo = new FileInputStream(acesso);
            ObjectInputStream fluxo = new ObjectInputStream(arquivo);
            lista = (ArrayList) fluxo.readObject();
            JOptionPane.showMessageDialog(null, "Dados lidos com sucesso"
                    + " no arquivo" + acesso);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na leitura do arquivo" + (e));
        }
        return lista;
    }

}
