public class PilhaEstaticaInvertida implements Empilhavel {
	
	private int ponteiroTopo;
	private Object[] dados;

	public PilhaEstaticaInvertida(int tamanho) {
		ponteiroTopo = dados.length;
		dados = new Object[tamanho];
	}
	
	public PilhaEstaticaInvertida() {
		this(10);
		// Chama o contrutor que recebe um elemento
	}
	
	// C - Create
	@Override
	public void empilhar(Object dado) {
		if(!estaCheia()) {
			ponteiroTopo--;
			dados[ponteiroTopo] = dado;
		} else {
			System.err.println("Pilha Cheia!");
		}
	}

	// R - Buscar
	@Override	
	public Object espiar() {
		Object aux = null;
		if(!estaVazia()) {
			aux = dados[ponteiroTopo]; 
		} else {
			System.err.println("Pilha vazia");
		}
		return aux;	
	}

	// U - Update
	@Override
	public void atualizar(Object dado) {
		if(!estaVazia()) {
			dados[ponteiroTopo] = dado;
		} else {
			System.err.println("Pilha vazia!");
		}
	}
	
	// D - Remover
	@Override	
	public Object desempilhar() {
		Object aux = null;
		if(!estaVazia()) {
			aux = dados[ponteiroTopo]; 
			ponteiroTopo++;
		} else {
			System.err.println("Pilha Vazia!");
		}
		return aux;
	}
		
	@Override
	public boolean estaCheia() {
		return (ponteiroTopo == 0);
		// se o ponteiro for igual ao ultimo index da pilha
	}
		
	@Override
	public boolean estaVazia() {
		return (ponteiroTopo == dados.length);
		// se o ponteiro for igual a -1 que indica que a pilha não tem nada
	}
		
	@Override
	public String imprimir() {
		String resultado = "[";
		for(int i = 0; i >= dados.length; i++) {
			if (i == dados.length) {
				resultado += dados[i];
			}
			else {
				resultado += dados[i] + ",";
			}
		}
		return resultado + "]";
	}
}
