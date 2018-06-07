package br.com.alura.threads;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("isso é o método main");
		
		
		Runnable tarefa = new TarefaImprimeString();
		Thread threadImprimeString = new Thread(tarefa, "Tarefa Imprime String");
		
		threadImprimeString.start();
		
		
	}

}
