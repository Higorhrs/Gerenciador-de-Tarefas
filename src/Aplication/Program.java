package Aplication;

import java.util.Scanner;
import Entity.GerenciadorDeTarefas;
import Entity.Tarefa;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
		
		int opcao = 0;
		
		while(opcao != 6) {
			System.out.println("----------------------------------\n    "
					+ "GERENCIADOR DE TAREFAS\n" 
					+ "----------------------------------");
			System.out.println("Selecione uma das opções:\n"
					+ "1 - Adicionar nova tarefa\n"
					+ "2 - Remover tarefa\n"
					+ "3 - Listar tarefas\n"
					+ "4 - Verificar se tarefa existe\n"
					+ "5 - Substituir tarefa\n"
					+ "6 - Sair");
			opcao = Integer.parseInt(sc.nextLine());
		
			switch(opcao){
			
				case 1: 
					System.out.println("ID: ");
					int id = Integer.parseInt(sc.nextLine());
					
					System.out.println("Nome:");
					String nome = sc.nextLine();
					
					System.out.println("Descrição: ");
					String descricao = sc.nextLine();
					
					System.out.println("Status: ");
					String status = sc.nextLine();
					
					Tarefa novaTarefa = new Tarefa(id, nome, descricao, status);
					gerenciador.adicionarTarefa(novaTarefa);
					break;
						
				case 2:
					System.out.println("Nome da tarefa a remover: ");
					String tarefaRemover = sc.nextLine();
					gerenciador.removerTarefa(tarefaRemover);
					break;
					
				case 3:
					gerenciador.listarTarefas();;
					break;
					
				case 4:
					System.out.println("Nome da tarefa a verificar: ");
					String nomeVerificar = sc.nextLine();
					boolean existe = gerenciador.tarefaExiste(nomeVerificar);
					System.out.println("Tarefa existe? "+ (existe ? "Sim" : "Não"));
					break;
				case 5:	
					System.out.println("Nome da tarefa a substituir: ");
					String tarefaSubstituir = sc.nextLine();
					
					System.out.println("ID: ");
					int novoId = Integer.parseInt(sc.nextLine());
					
					System.out.println("Nome:");
					String novoNome = sc.nextLine();
					
					System.out.println("Descrição: ");
					String novaDescricao = sc.nextLine();
					
					System.out.println("Status: ");
					String novoStatus = sc.nextLine();
					
					Tarefa substituir = new Tarefa(novoId, novoNome, novaDescricao, novoStatus);
					gerenciador.substituirTarefa(tarefaSubstituir, substituir);
					break;
					
				case 6:
					System.out.println("Você saiu da aplicação...");
	                break;
	
	            default:
	                System.out.println("Opção inválida, tente novamente.");			
			}
		}
		
		sc.close();

	}

}
