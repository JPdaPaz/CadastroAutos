
package Classes;

import java.io.Serializable;
import java.util.Date;



public class Carga extends Automovel implements Serializable{
    
    int capacidade_carga;
    String placa;

    public Carga(int capacidade_carga, String placa, String marca, String modelo, int ano, Date dia_aquisicao, String cor, int kilometragem, char combustivel) {
        super(marca, modelo, ano, dia_aquisicao, cor, kilometragem, combustivel);
        this.capacidade_carga = capacidade_carga;
        this.placa = placa;
    }

    public Carga() {
    }

    public Carga(int capacidade_carga, String placa) {
        this.capacidade_carga = capacidade_carga;
        this.placa = placa;
    }

    public int getCapacidade_carga() {
        return capacidade_carga;
    }

    public void setCapacidade_carga(int capacidade_carga) {
        this.capacidade_carga = capacidade_carga;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
