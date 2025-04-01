// Todas pilhas e fila são uma lista mas nem toda lista é uma pilha ou fila

public interface Listavel {
    // C
    void inserir(Object dado, int index); // ou void anexar(Object dado); em inglês append
    void anexar(Object dado); // ou void anexar(Object dado); em inglês append
    // R
    Object selecionar(int index); // ou Object obter(int posicao); em inglês get
    Object[] selecionarTodos(); // ou Object[] obterTodos(); em inglês getAll
    // boolean contem(Object dado); // ou boolean contem(Object dado); em inglês contains
    // int primeiroIndice(Object dado); // ou int primeiroIndice(Object dado); em inglês firstIndex
    // U
    void atualizar(Object dado, int index); // ou void atualizar(int posicao, Object dado); em inglês update
    // D
    Object apagar(Object dado, int index); // ou void remover(); em inglês remove
    void limpar(); // ou void apagarTudo(); em inglês clear

    boolean estaCheia(); // ou boolean isCheia(); em inglês isFull
    boolean estaVazia(); // ou boolean isVazia(); em inglês isEmpty
    String imprimir(); // ou void mostrar(); em inglês show
}
