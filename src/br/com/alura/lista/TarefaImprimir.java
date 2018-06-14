package br.com.alura.lista;

public class TarefaImprimir implements Runnable {

	private Lista lista;

	public TarefaImprimir(Lista lista) {
		this.lista = lista;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		
		
		demoraUmpouco(1000);
		
		
		synchronized(lista) {
		
			
			if(!lista.estacheia()) {
				try {
					System.out.println("indo dormir, aguardando notificação");
					lista.wait(); //manda a lista esperar um notify,  sem o synchronized nao funciona
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			for (int i = 0; i < lista.tamanho(); i++) {
				System.out.println(i + " - " + lista.pegaElemento(i));
			}

		}
	}

	private void demoraUmpouco(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
