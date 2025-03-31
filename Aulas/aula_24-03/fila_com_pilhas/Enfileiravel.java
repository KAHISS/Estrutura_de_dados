// fila (Queue)
// fila circular (Cycle queue)
// fila com dupla terminação (DeQue)

public interface Enfileiravel {

    void enfileirar(Object dado);
    Object frente();
    void atualizarInicio(Object dado);
    void atualizarFim(Object dado);
    Object desenfileirar();

    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}