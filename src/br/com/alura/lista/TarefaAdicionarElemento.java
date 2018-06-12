package br.com.alura.lista;

import java.util.List;

public class TarefaAdicionarElemento implements Runnable {

	private List<String> lista;
	private int numeroDoThread;

	public TarefaAdicionarElemento(List<String> lista, int numeroDoThread) {
		this.lista = lista;
		this.numeroDoThread = numeroDoThread;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 100000; i++) {
			try {
				Thread.currentThread().sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lista.add("Thread " + numeroDoThread + " - " + i);
		}

	}

}
