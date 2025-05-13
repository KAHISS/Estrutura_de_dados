// fila (Queue)
// fila circular (Cycle queue)
// fila com dupla terminação (DeQue)

public interface DuplamenteEnfileravel <T>{
    void enfileirarInicio(T dado); 
    void enfileirarFim(T dado); 

    T frente();  
    T tras();   

    void atualizarInicio(T dado);         
    void atualizarFim(T dado);  

    T desenfileirarInicio();   
    T desenfileirarFim();      
   
    boolean estaCheia();
    boolean estaVazia();

    String imprimirTrasFrente();
    String imprimirFrenteTras();
}
