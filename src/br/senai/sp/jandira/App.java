package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Veiculo;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        System.out.println("-----------  Bem Vindo ------------");
        System.out.println("-    Concessionaria MultiMarcas   -");
        System.out.println("-----------------------------------");

        /** Instancia Cadastro */
        Veiculo objVeiculo = new Veiculo();

        /** Chama metodo de Cadastro Veiculos*/
        //objVeiculo.CadastrarVeiculo();

        /** Instancia Cliente */
        Cliente objCliente = new Cliente();

        /** Chama metodo de Cadastro Cliente */
        objCliente.CadastrarCliente();





    }
}
