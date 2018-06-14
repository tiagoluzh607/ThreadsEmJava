package br.com.alura.lista;

import java.util.List;

public class TarefaAdicionarElemento implements Runnable {

	private Lista lista;
	private int numeroDoThread;

	public TarefaAdicionarElemento(Lista lista, int numeroDoThread) {
		this.lista = lista;
		this.numeroDoThread = numeroDoThread;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 1000; i++) {
			lista.adicionaElementos("Thread " + numeroDoThread + " - " + i);
		}

	}

}
