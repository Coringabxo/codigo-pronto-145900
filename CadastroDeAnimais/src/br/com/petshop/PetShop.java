package br.com.petshop;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Cachorro");
            System.out.println("2 - Cadastrar Gato");
            System.out.println("3 - Cadastrar Furão");
            System.out.println("4 - Exibir Animais");
            System.out.println("5 - localizarANIMAL");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastro.cadastrarCachorro();
                    break;
                case 2:
                    cadastro.cadastrarGato();
                    break;
                case 3:
                    cadastro.cadastrarFurao();
                    break;
                case 4:
                    cadastro.exibirAnimais();
                    break;
                case 5:
                    cadastro.localizarANIMAL();
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 6);
    	scanner.close();
    	}
    }
        

