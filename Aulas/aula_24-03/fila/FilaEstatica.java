
public class FilaEstatica implements Enfileiravel {

    private Object[] dados;
    private int ponteiroInicio;
    private int ponteiroFim;

    public FilaEstatica() {
        this(10);
    }

    public FilaEstatica(int tamanho) {
        dados = new Object[tamanho];
        ponteiroFim = 0;
        ponteiroInicio = -1;
    }

    @Override
    public boolean estaCheia() {
        return ponteiroFim == dados.length - 1;
    }

    @Override
    public boolean estaVazia() {
        return ponteiroFim == ponteiroInicio - 1;
    }

    @Override
    public String imprimir() {
        String retorno = "[";
        for (int i = ponteiroInicio; i <=ponteiroFim; i++) {
            if (i == ponteiroFim) {
                retorno += dados[i];
            } else {
                retorno += dados[i] + ", ";
            }
        }
        return retorno;
    }

    @Override
    public void enfileirar(Object dado) {
        if (!estaCheia()) {
            ponteiroFim ++;
            dados[ponteiroFim] = dado;
            
        } else {
            System.err.println("A fila está cheia");
        }

    }

    @Override
    public Object desenfileirar() {
        Object aux = null;

        if (!estaVazia()) {
            aux = dados[ponteiroInicio];
            ponteiroInicio ++;
        } else {
            System.err.println("A fila está vazia");
        }

        return aux;
    }

    @Override
    public Object frente() {
        Object aux = null;

        if (!estaVazia()) {
            aux = dados[ponteiroInicio];
        } else {
            System.err.println("A fila está vazia");
        }

        return aux;
    }
    
    @Override
    public void atualizarInicio(Object dado) {
        if (!estaVazia()) {
            dados[ponteiroInicio] = dado;
        } else {
            System.err.println("A fila está vazia");
        }
    }

    @Override
    public void atualizarFim(Object dado) {
        if (!estaCheia()) {
            dados[ponteiroFim] = dado;
        } else {
            System.err.println("A fila está cheia");
        }
    }
}
