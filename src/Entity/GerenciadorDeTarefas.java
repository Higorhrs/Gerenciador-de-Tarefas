package Entity;

import java.util.ArrayList;
import java.util.List;


public class GerenciadorDeTarefas {
	
	private List<Tarefa> tarefas;
	
	public GerenciadorDeTarefas() {
		tarefas = new ArrayList<>();
	}
	
	public void adicionarTarefa(Tarefa tarefa) {
		if (!tarefaExiste(tarefa.getNome())) {
            tarefas.add(tarefa);
            System.out.println("Tarefa adicionada: " + tarefa.getNome());
        } else {
            System.out.println("Tarefa com esse nome já existe.");
        }
	}
	public void removerTarefa(String nome) {
		Tarefa tarefaParaRemover = null;
        for (Tarefa t : tarefas) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                tarefaParaRemover = t;
                break;
            }
        }
        if (tarefaParaRemover != null) {
            tarefas.remove(tarefaParaRemover);
            System.out.println("Tarefa removida: " + nome);
        } else {
            System.out.println("Tarefa não encontrada: " + nome);
        }
	}
	public void listarTarefas() {
		if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        System.out.println("Lista de tarefas:");
        for (Tarefa t : tarefas) {
            System.out.println(t);
        }
	}
	public boolean tarefaExiste(String nome) {
		  for (Tarefa t : tarefas) {
	            if (t.getNome().equalsIgnoreCase(nome)) {
	                return true;
	            }
	        }
	        return false;
	}
	public void substituirTarefa(String nomeAntigo, Tarefa novaTarefa) {
		for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getNome().equalsIgnoreCase(nomeAntigo)) {
                tarefas.set(i, novaTarefa);
                System.out.println("Tarefa substituída: " + nomeAntigo + " por " + novaTarefa.getNome());
                return;
            }
        }
        System.out.println("Tarefa não encontrada: " + nomeAntigo);
    }
	
}
