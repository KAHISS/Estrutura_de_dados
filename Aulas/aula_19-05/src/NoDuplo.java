/**
 * Esta classe representa um nó duplo.
 * @author Kaique Silva Sousa
 * @version 1.0
 * @since 2019-02-15
 */

public class NoDuplo <T> {
    private NoDuplo<T> anterior;
    private T dado;
    private NoDuplo<T> proximo;

    public NoDuplo(T dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public NoDuplo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }

    public NoDuplo<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }

}