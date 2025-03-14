public interface Empilhavel {
	//métodos principais
	void empilhar(Object dado);
	Object desempilhar();
	Object espiar();
	void atualizar(Object dado);
	//métodos auxiliares
	boolean estaCheia();
	boolean estaVazia();
	String imprimir();
}