package br.com.locadora.view;

import br.com.locadora.model.Cliente;
import br.com.locadora.model.Endereco;
import br.com.locadora.model.Veiculo;

public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Veiculo();
        Cliente cliente = new Cliente();

        carro.cadastroVeiculo();
        cliente.cadastrarCliente();
        cliente.alugarCarro(carro.getModelo(), carro.getCor(), carro.getPlaca(), carro.isAlugado());

        System.out.println("O cliente: " + cliente.getNome() + " Está alugando o seguinte carro:");
        cliente.conferirLocacao();

    }
}
