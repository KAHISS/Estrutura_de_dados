public class FilaEstaticaPilha implements Enfileiravel{
    
    private Empilhavel pilha1;
    private Empilhavel pilha2;

    public FilaEstaticaPilha(){
        this(10);
    }

    public FilaEstaticaPilha(int tamanho){
        pilha1 = new PilhaEstatica(tamanho);
        pilha2 = new PilhaEstatica(tamanho);
    }

    @Override
    public boolean estaVazia() {
        return pilha1.estaVazia();
    }

    @Override
    public boolean estaCheia() {
        return pilha1.estaCheia();
    }

    @Override
    public void enfileirar(Object dado) {
        if (!estaCheia()){
            pilha1.empilhar(dado);
        }
    }

    @Override
    public Object desenfileirar() {
        Object dadoInicio = null;

        if (!estaVazia()) {
            while(!pilha1.estaVazia()){
                pilha2.empilhar(pilha1.desempilhar());
            }
            dadoInicio = pilha2.desempilhar();

            while(!pilha2.estaVazia()){
                pilha1.empilhar(pilha2.desempilhar());
            }
        }
        
        return dadoInicio;
    }

    @Override
    public Object frente() {
        Object dadoInicio = null;

        if (!estaVazia()){
            while(!pilha1.estaVazia()){
                pilha2.empilhar(pilha1.desempilhar());
            }
            dadoInicio = pilha2.espiar();

            while(!pilha2.estaVazia()){
                pilha1.empilhar(pilha2.desempilhar());
            }
        }
        
        return dadoInicio;
    }

    @Override
    public void atualizarInicio(Object dado) {
        if (!estaVazia()){
            while(!pilha1.estaVazia()){
                pilha2.empilhar(pilha1.desempilhar());
            }
            pilha2.atualizar(dado);
            while(!pilha2.estaVazia()){
                pilha1.empilhar(pilha2.desempilhar());
            }
        }
    }

    @Override
    public void atualizarFim(Object dado) {
        if (!estaVazia()){
            pilha1.atualizar(dado);
        }
    }

    @Override
    public String imprimir() {
        String impressao = "";
        if (!estaVazia()){
            while(!pilha1.estaVazia()){
                pilha2.empilhar(pilha1.desempilhar());
            }

            impressao = pilha2.imprimir();
            
            while(!pilha2.estaVazia()){
                pilha1.empilhar(pilha2.desempilhar());
            }
        }
        return impressao;
    }

}
