package br.com.alura.lista;

public class Lista {

	
	private String[] elementos = new String[1000];
	private int indice = 0;
	
	public synchronized void adicionaElementos(String elemento) {
			this.elementos[indice] = elemento;
			this.indice++;
			
			//demoraUmPouco(10);
		
			if(this.indice == this.elementos.length) {
				System.out.println("lista tá cheia, notificando");
				this.notify();
			}
	}

	private void demoraUmPouco(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int tamanho() {
		return this.elementos.length;
	}
	
	public String pegaElemento(int posicao) {
		return this.elementos[posicao];
	}

	public boolean estacheia() {
		
		return this.indice == this.tamanho();
	}
	
}
