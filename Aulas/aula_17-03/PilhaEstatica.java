public class PilhaEstatica implements Empilhavel {
	
	private int ponteiroTopo;
	private Object[] dados;

	public PilhaEstatica(int tamanho) {
		ponteiroTopo = -1;
		dados = new Object[tamanho];
	}
	
	public PilhaEstatica() {
		this(10);
		// Chama o contrutor que recebe um elemento
	}
	
	@Override
	public void empilhar(Object dado) {
		if(!estaCheia()) {
			ponteiroTopo++;
			dados[ponteiroTopo] = dado;
		} else {
			System.err.println("Pilha Cheia!");
		}
	}
	
	@Override	
	public Object desempilhar() {
		Object dadoTopo = null;
		if(!estaVazia()) {
			dadoTopo = dados[ponteiroTopo]; 
			ponteiroTopo--;
		} else {
			System.err.println("Pilha Vazia!");
		}
		return dadoTopo;
	}
	
	@Override	
	public Object espiar() {
		Object dadoTopo = null;
		if(!estaVazia()) {
			dadoTopo = dados[ponteiroTopo]; 
		} else {
			throw new Error("Pilha vazia");
		}
		return dadoTopo;	
	}
		
	@Override
	public boolean estaCheia() {
		return (ponteiroTopo == dados.length - 1);
		// se o ponteiro for igual ao ultimo index da pilha
	}
		
	@Override
	public boolean estaVazia() {
		return (ponteiroTopo == -1);
		// se o ponteiro for igual a -1 que indica que a pilha não tem nada
	}
		
	@Override
	public String imprimir() {
		String resultado = "[";
		for(int i = ponteiroTopo; i >= 0; i--) {
			if (i == 0) {
				resultado += dados[i];
			}
			else {
				resultado += dados[i] + ",";
			}
		}
		return resultado + "]";
	}
}
