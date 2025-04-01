public class ListaEstaticaCircular implements Listavel {

    private Object[] dados;
    private int ponteiroInicio;
    private int ponteiroFim;
    private int quantidade;

    public ListaEstaticaCircular() {
        this(10);
    }

    public ListaEstaticaCircular(int tamanho) {
        dados = new Object[tamanho];
        ponteiroInicio = 0;
        ponteiroFim = -1;
        quantidade = 0;
    }

    @Override
    public void anexar(Object dado) {
        if (!estaCheia()) {
            ponteiroFim = (ponteiroFim + 1) % dados.length;
            dados[ponteiroFim] = dado;
            quantidade ++;
        } else {
            System.err.println("A lista está Cheia");
        }

    }

    private int mapeamento(int logica) {
        return (logica + ponteiroInicio)%dados.length;
    }

    @Override
    public void atualizar(Object dado, int index) {
        if (!estaVazia()) {
            if (index >= 0 && index < quantidade) {
                int posicaoFisica = mapeamento(index);
                dados[posicaoFisica] = dado;
            }
        }
    }

    @Override
    public boolean estaCheia() {
        return quantidade == dados.length;
    }

    @Override
    public boolean estaVazia() {
        return quantidade == 0;
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

}
