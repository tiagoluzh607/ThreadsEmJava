package br.com.alura.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		
		//List<String> lista = new ArrayList(); //não é sincronizado
		//List<String> lista = Collections.synchronizedList(new ArrayList<String>()); //é sincronizado
		//List<String> lista = new Vector<String>(); //é sincronizado
		Lista lista = new Lista();
		
		for (int i = 0; i < 10; i++) {
			
			new Thread(new TarefaAdicionarElemento(lista, i)).start();;
			
		}
		
		new Thread(new TarefaImprimir(lista)).start();

	}

}
