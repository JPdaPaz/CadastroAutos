

package Classes;

import java.io.Serializable;
import java.util.Date;



public class Passeio extends Automovel implements Serializable{
    
    int nr_portas;
    String opcionais;

    public Passeio(int nr_portas, String opcionais, String marca, String modelo, int ano, Date dia_aquisicao, String cor, int kilometragem, char combustivel) {
        super(marca, modelo, ano, dia_aquisicao, cor, kilometragem, combustivel);
        this.nr_portas = nr_portas;
        this.opcionais = opcionais;
    }

    public Passeio(int nr_portas, String opcionais) {
        this.nr_portas = nr_portas;
        this.opcionais = opcionais;
    }

    public int getNr_portas() {
        return nr_portas;
    }

    public void setNr_portas(int nr_portas) {
        this.nr_portas = nr_portas;
    }

    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    public Passeio() {
    }
    
}
