
public class FilaEstaticaCircular implements Enfileiravel {

    private Object[] dados;
    private int ponteiroInicio;
    private int ponteiroFim;
    private int quantidade;

    public FilaEstaticaCircular() {
        this(10);
    }

    public FilaEstaticaCircular(int tamanho) {
        dados = new Object[tamanho];
        ponteiroFim = 0;
        ponteiroInicio = -1;
        quantidade = 0;
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
        for (int i = ponteiroInicio; i < quantidade + ponteiroInicio; i++) {

            //if (i == dados.length) 
            //    i = 0;
            if (i == quantidade + ponteiroInicio - 1) {
                retorno += dados[i%dados.length];
            } else {
                retorno += dados[i] + ", ";
            }
        }
        return retorno;
    }

    @Override
    public void enfileirar(Object dado) {
        if (!estaCheia()) {
            ponteiroFim = (ponteiroFim + 1) % 8;
            dados[ponteiroFim] = dado;
            quantidade ++;
        } else {
            System.err.println("A fila está Cheia");
        }

    }

    @Override
    public Object desenfileirar() {
        Object aux = null;

        if (!estaVazia()) {
            aux = dados[ponteiroInicio];
            ponteiroInicio = (ponteiroInicio + 1) % 8;
            quantidade --;
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
