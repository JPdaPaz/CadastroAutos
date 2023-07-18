package Principal;

import Classes.Carga;
import Classes.Passeio;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Interface {

    public void InsereCarga(ArrayList Dados){

        DateFormat dn = new SimpleDateFormat("dd/MM/yyyy");
        Carga auto = new Carga();

        auto.setMarca(JOptionPane.showInputDialog("Digite a marca do automóvel"));
        auto.setModelo(JOptionPane.showInputDialog("Digite o modelo do automóvel"));
        auto.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do automóvel")));
        try {
            auto.setDia_aquisicao(dn.parse(JOptionPane.showInputDialog("Digite a data de aquisição do automóvel \n(dd/mm/yyyy)")));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conversão de data, tente novamente na edição do cadastro.");
        }

        auto.setCor(JOptionPane.showInputDialog("Digite a cor do automóvel"));
        auto.setKilometragem(Integer.parseInt(JOptionPane.showInputDialog("Digite a kilometragem do automóvel (km)")));
        auto.setCombustivel((JOptionPane.showInputDialog("Digite o tipo de combustível do automóvel").charAt(0)));

        auto.setCapacidade_carga(Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade de carga do automóvel (kg)")));
        auto.setPlaca(JOptionPane.showInputDialog("Digite a placa do automóvel"));

        Dados.add(auto);

    }

    public void InserePasseio(ArrayList Dados) {

        Passeio auto = new Passeio();
        DateFormat dn = new SimpleDateFormat("dd/MM/yyyy");

        auto.setMarca(JOptionPane.showInputDialog("Digite a marca do automóvel"));
        auto.setModelo(JOptionPane.showInputDialog("Digite o modelo do automóvel"));
        auto.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do automóvel")));

        try {
            auto.setDia_aquisicao(dn.parse(JOptionPane.showInputDialog("Digite a data de aquisição do automóvel \n(dd/mm/yyyy)")));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na corversão de data.");
        }

        auto.setCor(JOptionPane.showInputDialog("Digite a cor do automóvel"));
        auto.setKilometragem(Integer.parseInt(JOptionPane.showInputDialog("Digite a kilometragem do automóvel (km)")));
        auto.setCombustivel((JOptionPane.showInputDialog("Digite o tipo de combustível do automóvel").charAt(0)));

        auto.setNr_portas(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de portas do automóvel")));
        auto.setOpcionais(JOptionPane.showInputDialog("Digite os atributos opcionais do automóvel"));

        Dados.add(auto);

    }

    public void Lista(ArrayList Dados) {

        String msg = "";
        int c1;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        msg = "Dados Coletados: \n____________________________________\n";

        for (c1 = 0; c1 < Dados.size(); c1++) {

            if (Dados.get(c1) instanceof Carga) {

                Carga modelo = new Carga();
                modelo = (Carga) Dados.get(c1);

                msg += "Número: " + c1
                        + "\nTipo: carga"
                        + "\nMarca: " + modelo.getMarca()
                        + "\nModelo: " + modelo.getModelo()
                        + "\nAno: " + modelo.getAno()
                        + "\nDia de aquisição: " + sdf.format(modelo.getDia_aquisicao())
                        + "\nCor: " + modelo.getCor()
                        + "\nKilometragem: " + modelo.getKilometragem()
                        + "\nCombustível: " + modelo.getCombustivel()
                        + "\nCapacidade de carga: " + modelo.getCapacidade_carga() + "kg"
                        + "\nPlaca: " + modelo.getPlaca()
                        + "\n____________________________________\n";

            } else {

                Passeio modelo = new Passeio();
                modelo = (Passeio) Dados.get(c1);

                msg += "Número: " + c1
                        + "\nTipo: passeio"
                        + "\nMarca: " + modelo.getMarca()
                        + "\nModelo: " + modelo.getModelo()
                        + "\nAno: " + modelo.getAno()
                        + "\nDia de aquisição: " + sdf.format(modelo.getDia_aquisicao())
                        + "\nCor: " + modelo.getCor()
                        + "\nKilometragem: " + modelo.getKilometragem()
                        + "\nCombustível: " + modelo.getCombustivel()
                        + "\nNúmero de portas: " + modelo.getNr_portas()
                        + "\nOpcionais: " + modelo.getOpcionais()
                        + "\n____________________________________\n";
            }

        }

        JOptionPane.showMessageDialog(null, msg);
    }

    public void Altera(ArrayList Dados) {

        DateFormat dn = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int c1;

        c1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a posição que quer editar."));

        if (Dados.get(c1) instanceof Carga) {

            Carga auto = new Carga();
            auto = (Carga) Dados.get(c1);

            auto.setMarca(JOptionPane.showInputDialog("Digite a marca do automóvel", auto.getMarca()));
            auto.setModelo(JOptionPane.showInputDialog("Digite o modelo do automóvel", auto.getModelo()));
            auto.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do automóvel", auto.getAno())));

            try {
                auto.setDia_aquisicao(dn.parse(JOptionPane.showInputDialog("Digite a data de aquisição do automóvel \n(dd/mm/yyyy)", sdf.format(auto.getDia_aquisicao()))));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro na conversão de data.");
            }

            auto.setCor(JOptionPane.showInputDialog("Digite a cor do automóvel", auto.getCor()));
            auto.setKilometragem(Integer.parseInt(JOptionPane.showInputDialog("Digite a kilometragem do automóvel (km)", auto.getKilometragem())));
            auto.setCombustivel((JOptionPane.showInputDialog("Digite o tipo de combustível do automóvel", auto.getCombustivel()).charAt(0)));

            auto.setCapacidade_carga(Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade de cargas do automóvel (kg)", auto.getCapacidade_carga())));
            auto.setPlaca(JOptionPane.showInputDialog("Digite a placa do automóvel", auto.getPlaca()));

        } else {

            Passeio auto = new Passeio();
            auto = (Passeio) Dados.get(c1);

            auto.setMarca(JOptionPane.showInputDialog("Digite a marca do automóvel", auto.getMarca()));
            auto.setModelo(JOptionPane.showInputDialog("Digite o modelo do automóvel", auto.getModelo()));
            auto.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do automóvel", auto.getAno())));

            try {
                auto.setDia_aquisicao(dn.parse(JOptionPane.showInputDialog("Digite a data de aquisição do automóvel \n(dd/mm/yyyy)", sdf.format(auto.getDia_aquisicao()))));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro na conversão de data.");
            }

            auto.setCor(JOptionPane.showInputDialog("Digite a cor do automóvel", auto.getCor()));
            auto.setKilometragem(Integer.parseInt(JOptionPane.showInputDialog("Digite a kilometragem do automóvel (km)", auto.getKilometragem())));
            auto.setCombustivel((JOptionPane.showInputDialog("Digite o tipo de combustível do automóvel", auto.getCombustivel()).charAt(0)));

            auto.setNr_portas(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de portas do automóvel", auto.getNr_portas())));
            auto.setOpcionais(JOptionPane.showInputDialog("Digite os atributos opcionais do automóvel", auto.getOpcionais()));
        }

    }

    public void Exclui(ArrayList Dados) {
        int c1;

        c1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a posição que quer excluir."));

        Dados.remove(c1);

    }
}
