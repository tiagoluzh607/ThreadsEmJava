package br.com.alura.deadlock;

public class TarefaAcessaBanco implements Runnable {

	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessaBanco(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		// TODO Auto-generated constructor stub
		this.tx = tx;
	}

	@Override
	public void run() {
		
		synchronized(pool) {
			System.out.println("peguei o pool");
			pool.getConnection();
			
			
			synchronized(tx) {
				
				System.out.println("comencando a gerenciar a tx");
				tx.begin();
			}
			
		}

	}

}
