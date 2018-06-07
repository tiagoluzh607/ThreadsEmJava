package br.com.alura.threads;

public class TarefaImprimeString implements Runnable {

	@Override
	public void run() {
		
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("printei executando uma thread");
		
	}

}
