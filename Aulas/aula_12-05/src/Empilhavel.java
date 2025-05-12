/*
 * Esta interface indica as operações que uma
 * classe deve implementar para ser considerada
 * uma pilha dinâmica.
 * 
 * @author: Kaique Silva Sousa
 * @version 1.0
 * @since 2025-05-05
*/

public interface Empilhavel <T> {
	//métodos principais
	void empilhar(T dado);
	T desempilhar();
	T espiar();
	void atualizar(T dado);
	//métodos auxiliares
	boolean estaCheia();
	boolean estaVazia();
	String imprimir();
}