package br.com.petshop;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Cadastro {
	private List<Cadastro> listaCadastro;
    private ArrayList<Animal> listaDeanimais;
    private Scanner scanner;


    public Cadastro() {
    	listaDeanimais = new ArrayList<>();
        this.scanner = new Scanner(System.in);
     
        
    }

    public void cadastrarCachorro() {
        System.out.print("Nome do cachorro: ");
        String nomeCachorro = scanner.nextLine();
        System.out.print("Tamanho do cachorro: ");
        int tamanhoCachorro = scanner.nextInt(); 
        System.out.print("Idade do cachorro: ");
        int idadeCachorro = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Raça do cachorro: ");
        String raca = scanner.nextLine();
        listaDeanimais.add(new Cachorro(nomeCachorro, idadeCachorro, tamanhoCachorro, raca));
        System.out.println("Cachorro cadastrado com sucesso!");
        
    }

    public void cadastrarGato() {
        System.out.print("Nome do gato: ");
        String nomeGato = scanner.nextLine();
        System.out.print("Tamanho do gato: ");
        int tamanhoGato = scanner.nextInt();
        System.out.print("Idade do gato: ");
        int idadeGato = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Cor do pelo do gato: ");
        String corPelo = scanner.nextLine();
        listaDeanimais.add(new Gato(nomeGato, idadeGato, tamanhoGato, corPelo));
        System.out.println("Gato cadastrado com sucesso!");
    	}
    
    

    public void cadastrarFurao() {
        System.out.print("Nome do furão: ");
        String nomeFurao = scanner.nextLine();
        System.out.print("Tamanho do furão: ");
        int tamanhoFurao = scanner.nextInt();
        System.out.print("Idade do furão: ");
        int idadeFurao = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Cor do pelo do furão: ");
        String corRaca = scanner.nextLine();
        listaDeanimais.add(new Furão(nomeFurao, idadeFurao, tamanhoFurao, corRaca));
        System.out.println("Furão cadastrado com sucesso!");
        
       
    }

    public void exibirAnimais() {
    	if (listaCadastro.isEmpty()) {
    	System.out.println("\"⚠ Nenhum Animal cadastrado!\"");
    	}else{
    		System.out.println("\n LISTA DE ANIMAIS CADASTRADOS ");
    		for (Animal animais : listaDeanimais) {
            animais .exibirInfo();
            System.out.println("------------------------");
    		}
        }
    }
    
    public void localizarANIMAL() {
		System.out.print("Digite o nome do animal que deseja localizar: ");
		String busca = scanner.nextLine();
		boolean encontrado = false;

		System.out.println("\n🔎 RESULTADO DA BUSCA:");
		for (Animal animais : listaDeanimais) {
			if (animais.getNome().equalsIgnoreCase(busca)) {
				animais.exibirInfo();
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("⚠ Nenhum veículo encontrado com a marca '" + busca + "'.");
		}
	}
}
	

    
    
    
    

    	
  
    
 
