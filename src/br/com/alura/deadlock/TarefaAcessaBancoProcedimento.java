package br.com.alura.deadlock;

public class TarefaAcessaBancoProcedimento implements Runnable {

	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessaBancoProcedimento(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		// TODO Auto-generated constructor stub
		this.tx = tx;
	}

	@Override
	public void run() {
		
		synchronized(tx) {
			System.out.println("peguei o tx");
			tx.begin();
			
			
			synchronized(pool) {
				
				System.out.println("comencando a gerenciar o pool");
				pool.getConnection();
			}
			
		}

	}

}
