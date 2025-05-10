package br.com.locadora.model;

import javax.swing.*;

public class Veiculo {
    String modelo;
    String cor;
    String placa;
    boolean alugado;

    public void cadastroVeiculo() {
       this.modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
       this.cor = JOptionPane.showInputDialog("Digite a cor do carro");
       this.placa = JOptionPane.showInputDialog("Digite a placa do carro");

    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isAlugado() {
        return alugado;
    }
}
