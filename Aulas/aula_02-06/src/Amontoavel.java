// Heap = monte
// Heapify = organizar dados na forma de array
// Heapifiable = Amontável

public interface Amontoavel <T> {

    void inserir(T dado);  //c
    T obterRaiz(); //c
    void extrair(); //c

    boolean estaCheia(); //c
    boolean estaVazia(); //c
    String imprimir(); //c
    
}
