package br.senai.sp.jandira.model;

import br.senai.sp.jandira.model.Voo;
import br.senai.sp.jandira.model.VooAzul;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        List<Voo> listaDeVoos = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("-----------------------Menu Aeroporto------------------------");
            System.out.println("Escolha uma opção para seguir: ");
            System.out.println("1 - Pesquisar Voos\n2 - Adicionar Voo\n3 - Sair");
            System.out.print("Opção: ");
            int opcaoUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoUsuario) {
                case 1:
                    System.out.println("Escolha um critério de pesquisa: ");
                    System.out.println("1 - Número do Voo\n2 - Capacidade de Passageiros\n3 - Origem\n4 - Destino\n5 - Data de Partida\n6 - Hora de Partida");
                    System.out.print("Opção de pesquisa: ");
                    int opcaoPesquisa = scanner.nextInt();
                    scanner.nextLine();

                    List<Voo> voosEncontrados = new ArrayList<>();

                    switch (opcaoPesquisa) {
                        case 1:
                            System.out.print("Digite o número do voo: ");
                            int numeroVoo = scanner.nextInt();
                            scanner.nextLine();
                            for (Voo voo : listaDeVoos) {
                                if (voo.getNumeroVoo() == numeroVoo) {
                                    voosEncontrados.add(voo);
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Digite a capacidade de passageiros: ");
                            int capacidadePassageiros = scanner.nextInt();
                            scanner.nextLine();
                            for (Voo voo : listaDeVoos) {
                                if (voo instanceof VooAzul && ((VooAzul) voo).getCapacidadePassageiros() == capacidadePassageiros) {
                                    voosEncontrados.add(voo);
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Digite a origem: ");
                            String origem = scanner.nextLine();
                            for (Voo voo : listaDeVoos) {
                                if (voo.getOrigem().equalsIgnoreCase(origem)) {
                                    voosEncontrados.add(voo);
                                }
                            }
                            break;
                        case 4:
                            System.out.print("Digite o destino: ");
                            String destino = scanner.nextLine();
                            for (Voo voo : listaDeVoos) {
                                if (voo.getDestino().equalsIgnoreCase(destino)) {
                                    voosEncontrados.add(voo);
                                }
                            }
                            break;
                        case 5:
                            System.out.print("Digite a data de partida (no formato YYYY-MM-DD): ");
                            String dataPartidaStr = scanner.nextLine();
                            for (Voo voo : listaDeVoos) {
                                if (voo.getDataPartida().toString().equals(dataPartidaStr)) {
                                    voosEncontrados.add(voo);
                                }
                            }
                            break;
                        case 6:
                            System.out.print("Digite a hora de partida (no formato HH:MM): ");
                            String horaPartidaStr = scanner.nextLine();
                            for (Voo voo : listaDeVoos) {
                                if (voo.getHoraPartida().toString().contains(horaPartidaStr)) {
                                    voosEncontrados.add(voo);
                                }
                            }
                            break;
                        default:
                            System.out.println("Opção de pesquisa inválida. Tente novamente.");
                            break;
                    }

                    if (voosEncontrados.isEmpty()) {
                        System.out.println("Nenhum voo encontrado com base nos critérios fornecidos.");
                    } else {
                        System.out.println("Voos encontrados:");
                        for (Voo voo : voosEncontrados) {
                            System.out.println("Número do Voo: " + voo.getNumeroVoo());
                            System.out.println("Origem: " + voo.getOrigem());
                            System.out.println("Destino: " + voo.getDestino());
                            System.out.println("Data de Partida: " + voo.getDataPartida());
                            System.out.println("Hora de Partida: " + voo.getHoraPartida());
                        }
                    }
                    break;


                case 2:
                    Voo novoVoo = new Voo();
                    System.out.print("Digite o número do voo: ");
                    novoVoo.setNumeroVoo(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Digite a origem: ");
                    novoVoo.setOrigem(scanner.nextLine());
                    System.out.print("Digite o destino: ");
                    novoVoo.setDestino(scanner.nextLine());
                    System.out.print("Digite a data de partida (no formato YYYY-MM-DD): ");
                    novoVoo.setDataPartida(LocalDate.parse(scanner.nextLine()));
                    System.out.print("Digite a hora de partida (no formato HH:MM): ");
                    novoVoo.setHoraPartida(LocalTime.parse(scanner.nextLine()));
                    listaDeVoos.add(novoVoo);
                    System.out.println("Voo adicionado com sucesso.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;

                case 3:
                    continuar = false;
                    break;
            }
        }
    }
}
