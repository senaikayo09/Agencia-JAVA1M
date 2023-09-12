package br.senai.sp.jandira.model;

public class Venda {

    public boolean realizarVenda(Cliente objCliente, Veiculo objVeiculo){

        System.out.println("------ Validando Venda -------");

        if (objCliente.dinheiroDisponivel >= objVeiculo.valor){

            System.out.println("------------------- Parabéns  --------------------");
            System.out.println("Olá " + objCliente.nome);
            System.out.println("Você acaba de adquirir um " + objVeiculo.modelo);
            System.out.println("No precinho de " + objVeiculo.valor);
            System.out.println("--------------------------------------------------");

            return true;

        } else {
            System.out.println("Escolha um carro mais acessivel");
            return false;
        }


    }


}
