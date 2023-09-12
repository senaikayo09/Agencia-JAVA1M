package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Veiculo {
    /** Declarar as variaveis **/
    String modelo, marca, cor, combustivel;
    int ano;
    double valor;

    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);

    public void cadastrarVeiculo(){

        System.out.println("----- Cadastro Veiculo ------");
        System.out.print("Informe qual a marca: ");
        marca = teclado.nextLine();
        System.out.print("Informe o modelo: ");
        modelo = teclado.nextLine();
        System.out.print("Informe o ano: ");
        ano = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Informe a cor: ");
        cor = teclado.nextLine();
        System.out.print("Informe o combustivel: ");
        combustivel = teclado.nextLine();
        System.out.print("Informe o valor: ");
        valor = teclado.nextDouble();
        System.out.println("------------------------------");

        System.out.println("Cadastro Finalizado !!");

    }

    public void listarVeiculos(){

    }




}
