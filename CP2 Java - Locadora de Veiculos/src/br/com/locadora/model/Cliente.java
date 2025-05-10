package br.com.locadora.model;

import javax.swing.*;

public class Cliente {
   private String nome;
   private String cpf;
   private boolean alugando;
   private Endereco endereco;
   private Veiculo veiculo;

   public void cadastrarCliente() {
       this.nome = JOptionPane.showInputDialog("Digite o nome do cliente");
       this.cpf = JOptionPane.showInputDialog("Digite o cpf do cliente");

       this.endereco = new Endereco();

       endereco.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro do cliente"));
       endereco.setBairro(JOptionPane.showInputDialog("Digite o bairro do cliente"));
       endereco.setCidade(JOptionPane.showInputDialog("Digite o cidade do cliente"));
       endereco.setEstado(JOptionPane.showInputDialog("Digite o estado do cliente"));
       endereco.setCep(JOptionPane.showInputDialog("Digite o CEP do cliente"));
   }
   public void alugarCarro(String modelo, String cor, String placa, boolean carroAlugado) {
       if (!alugando && !carroAlugado) {
           this.alugando = true;
           this.veiculo = new Veiculo();
           this.veiculo.alugado = true;
           this.veiculo.modelo = modelo;
           this.veiculo.cor = cor;
           this.veiculo.placa = placa;
       }
       else{
           System.out.println("Não foi possível completar a locação do veiculo");
       }
   }

   public void conferirLocacao(){
        if (alugando) {
            System.out.println("O cliente: " + this.nome + " alugou o seguinte carro: ");
            System.out.println("Modelo: " + veiculo.modelo);
            System.out.println("Cor: " + veiculo.cor);
            System.out.println("Placa: " + veiculo.placa);
        }
        else{
            System.out.println("O cliente não está alocando nenhum carro no momento!");
        }
   }

    public String getNome() {
        return nome;
    }


}
