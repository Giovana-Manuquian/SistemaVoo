package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {


    public void exibirMenu(){

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while(continuar){
            System.out.println("-----------------------Menu Aeroporto------------------------");
            System.out.println("Escolha uma opção para seguir: ");
            System.out.println("1 - Pesquisar Voos\n" +
                    "2 - Sair"
            );
            System.out.println("Opção: ");

            int opcaoUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoUsuario){
                case 1:
                    System.out.println("1 - Número Voo\n" +
                            "2 - Capacidade de Passageiros\n" +
                            "3 - Origem de Destino\n" +
                            "4 - Destino\n" +
                            "5 - Data de Partida\n" +
                            "6 - Hora Partida"
                            );
                    System.out.println("Opção: ");

                    int opcaoPesquisa = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcaoPesquisa){
                        Voo vooEmirates = new VooEmirates("Teste");
                        case 1:

                    }
                case 2:
                    continuar = false;
            }
        }

    }
}
