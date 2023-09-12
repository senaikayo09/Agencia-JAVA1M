package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {


    Scanner teclado = new Scanner(System.in);

    Cliente objCliente = new Cliente();
    Veiculo objVeiculo = new Veiculo();
    Funcionario objFuncionario = new Funcionario();
    Venda objVenda = new Venda();

    public void menu(){

        boolean continuar = true;

        while (continuar){

            System.out.println("-------------------------");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Veiculo");
            System.out.println("3 - Cadastrar Funcionario");
            System.out.println("4 - Realizar Venda");
            System.out.println("5 - Sair do App");
            System.out.println("--------------------------");

            int decisaoUsuario = teclado.nextInt();
            teclado.nextLine();

            switch (decisaoUsuario){

                case 1:
                    objCliente.cadastrarCliente();
                    break;

                case 2:
                    objVeiculo.cadastrarVeiculo();
                    break;

                case 3:
                    objFuncionario.cadastrarFuncionario();
                    break;

                case 4:
                    boolean venda = objVenda.realizarVenda(objCliente, objVeiculo);

                    if (venda){
                        objCliente.dinheiroDisponivel -= objVeiculo.valor;
                        System.out.println("Seu saldo é: " + objCliente.dinheiroDisponivel);
                    }

                    break;

                case 5:
                    continuar = false;
                    break;

            }

            if (decisaoUsuario < 0 || decisaoUsuario > 5 ){
                System.out.println("Digite uma opção válida");
            }

        }

    }

}
