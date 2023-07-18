

package Classes;

import java.io.Serializable;
import java.util.Date;



public abstract class Automovel implements Serializable{

    String marca;
    String modelo;
    int ano;
    Date dia_aquisicao;
    String cor;
    int kilometragem;
    char combustivel;

    public Automovel(String marca, String modelo, int ano, Date dia_aquisicao, String cor, int kilometragem, char combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.dia_aquisicao = dia_aquisicao;
        this.cor = cor;
        this.kilometragem = kilometragem;
        this.combustivel = combustivel;
    }

    public Automovel() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Date getDia_aquisicao() {
        return dia_aquisicao;
    }

    public void setDia_aquisicao(Date dia_aquisicao) {
        this.dia_aquisicao = dia_aquisicao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public char getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(char combustivel) {
        this.combustivel = combustivel;
    }
    
}
