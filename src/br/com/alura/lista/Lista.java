package br.com.alura.lista;

public class Lista {

	
	private String[] elementos = new String[10000];
	private int indice = 0;
	
	public synchronized void adicionaElementos(String elemento) {
			this.elementos[indice] = elemento;
			this.indice++;
			
			demoraUmPouco(10);
		
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
	
}
