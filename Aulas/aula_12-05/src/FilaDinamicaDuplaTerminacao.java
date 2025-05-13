
import java.util.NoSuchElementException;
import javax.lang.model.util.ElementScanner14;

public class FilaDinamicaDuplaTerminacao <T> implements DuplamenteEnfileravel <T>{  
    private NodoDuplo ponteiroInicio; 
    private NodoDuplo ponteiroFim;  
    private int quantidade;
    private int tamanho;  

    public FilaDinamicaDuplaTerminacao(){
        this(10);
    }

    public FilaDinamicaDuplaTerminacao(int tamanho) {
        this.ponteiroInicio = null;
        this.ponteiroFim = null;
        this.quantidade = 0;
        this.tamanho = tamanho;
    }

    @Override
    public void enfileirarInicio(Object dado) {
        throw new UnsupportedOperationException("Operação não suportada");
    }

    @Override
    public void enfileirarFim(T dado) {
        if (estaCheia()) {
            throw new NoSuchElementException("Fila vazia");
        }
        NodoDuplo<T> novoDado = new NodoDuplo<T>(dado);
        novoDado.setAnterior(ponteiroFim);
        if (!estaVazia()) {
            ponteiroFim.setProximo(novoDado);
        } else {
            ponteiroInicio = novoDado;
        }    
        ponteiroFim = novoDado;
        quantidade ++;
    }

    @Override
    public T desenfileirarInicio() {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila vazia");
        }
        T dadoInicio = ponteiroInicio.getDado();
        ponteiroInicio = ponteiroInicio.getProximo();
        ponteiroInicio.setAnterior(null);
        quantidade --;
        return dadoInicio;
    }

    @Override
    public Object desenfileirarFim() {
        throw new UnsupportedOperationException("Operação não suportada");
    }

    @Override
    public Object frente() {
        if(estaVazia()){
            throw new NoSuchElementException("Fila vazia");
        }
        return ponteiroInicio.getDado();
    }

    
    @Override
    public Object tras() {
        throw new UnsupportedOperationException("Operação não suportada");
    }

    /**
     * Atualiza o primeiro item da fila
     * @param dado é o novo dado a ser atualizado
     * @throws NoSuchElementException lança a exeção caso a fila esteje fazia
     */
    @Override
    public void atualizarInicio(T dado) {
        if(estaVazia()){
            throw new NoSuchElementException("Fila vazia");
        } 
        ponteiroInicio.setDado(dado);

    }

    @Override
    public void atualizarFim(T dado) {
        if(!estaVazia()){
            throw new NoSuchElementException("Fila vazia");
        }
        ponteiroFim.setDado(dado);
    }

    @Override
    public boolean estaCheia() {
        return (quantidade == tamanho);
    }

    @Override
    public boolean estaVazia() {
        return (quantidade == 0);
    }

    @Override
    public String imprimirTrasFrente() {
        throw new UnsupportedOperationException("Operação não suportada");
    } 

    @Override
    public String imprimirFrenteTras() {
        String aux = "[";
        NodoDuplo<T> auxNodo = ponteiroInicio;
        for(int i = 0;i < quantidade;i++){
            if (auxNodo.getProximo() != null){
                aux += auxNodo.getDado(); //% - Volta para o inicio, se alcançar o fim
            } else {
                aux += auxNodo.getProximo() + ", ";
            }
            auxNodo = auxNodo.getProximo();
        }
        return aux + "]";
    }

    
}