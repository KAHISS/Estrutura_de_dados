
import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

/**
 * Esta classe implementa uma pilha dinâmica genérica 
 * com tipo LIFO (Last In First Out).
 * 
 * @param <T> Tipo genérico.
 * @author Kaique Silva Sousa
 * @version 1.0
 * @since 2019-02-15
 */

public class PilhaDinamicaGenerica <T> implements Empilhavel<T> {
    private NodoDuplo<T> topo;
    private int quantidade;
    private int tamanho;

    /**
     * construtor vazio que cria uma pilha com tamanho 10 usando o construtor da classe
     */
    public PilhaDinamicaGenerica() {
        this(10);
    }

    /**
     * Construtor da classe
     * @param tamanho, refere-se ao tamanho da lista
     */
    public PilhaDinamicaGenerica(int  tamanho) {
        this.topo = null;
        this.quantidade = 0;
        this.tamanho = tamanho;
    }


    /**
     * Verifica se a pilha está vazia
     * @return true se a pilha está vazia, false caso contrário
     */
    @Override
    public boolean estaVazia() {
        return this.quantidade == 0;
    }

    /**
     * Verifica se a pilha está cheia
     * @return true se a pilha está cheia, false caso contrário
     */
    @Override
    public boolean estaCheia() {
        return this.quantidade == this.tamanho;
    }

    /**
     * Gera uma string com os elementos da pilha
     * para visualização dos elementos
     * 
     * @return uma string com os elementos da pilha entre colchetes e separados por vírgula
     */
    @Override
    public String imprimir() throws UnsupportedOperationException{
        String saida = "[";
        NodoDuplo<T> aux = this.topo;
        for (int i = 0; i < this.quantidade; i++) {
            if (i == 0) {
                saida += aux.getDado();
            } else {
                saida += ", " + aux.getDado();
            }
            aux = aux.getAnterior();
        }
        return saida + "]";
    }

    /**
     * Mostra o elemento do topo da pilha
     * @return o elemento do topo da pilha
     * @throws NoSuchElementException se a pilha está vazia
     */
    @Override
    public T espiar() throws UnsupportedOperationException{
        if (this.estaVazia()) {
            throw new UnsupportedOperationException("A pilha está vazia!");
        } else {
            return this.topo.getDado();
        }
    }

    /**
     * atualiza o elemento do topo da pilha se a pilha não está vazia, 
     * caso contrário, lança uma exceção
     * 
     * @param dado, refere-se ao dado a ser inserido
     * @throws NoSuchElementException se a pilha está vazia
     */
    @Override
    public void atualizar(T dado) throws NoSuchElementException{
        if (this.estaVazia()) {
            throw new NoSuchElementException("A pilha está vazia!");
        } 
        this.topo.setDado(dado);
    }

    /**
     * Insere um elemento no topo da pilha verificando se a pilha está cheia, 
     * caso não esteja, incrementa a quantidade de elementos
     * @param dado, refere-se ao dado a ser inserido
     * @throws NoSuchElementException se a pilha está cheia
     */
    @Override
    public void empilhar(T dado) {
        if (this.estaCheia()) {
            throw new NoSuchElementException("A pilha está cheia!");
        } 
        NodoDuplo<T> novo = new NodoDuplo<T>(dado);
        this.topo.setProximo(novo);
        novo.setAnterior(this.topo);
        this.topo = novo;
        this.quantidade++;
    }

    /**
     * Remove o elemento do topo da pilha verificando se a pilha está vazia, caso não esteja, o 
     * elemento é removido e a quantidade de elementos é decrementada
     * 
     * @return o elemento removido
     * @throws NoSuchElementException se a pilha está vazia
     */
    @Override
    public T desempilhar() throws NoSuchElementException {
        if (this.estaVazia()) {
            throw new NoSuchElementException("A pilha está vazia!");
        }
        T aux = this.topo.getDado();
        this.topo = this.topo.getAnterior();
        this.topo.setProximo(null);
        this.quantidade--;
        return aux;
    }
}