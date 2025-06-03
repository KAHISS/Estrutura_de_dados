/* 
 * Arvores binárias de heap e quando o pai é maior que os filhos.
 * 
 * max-heap: pai maior que filhos
 * min-heap: pai menor que filhos
 * raiz: nodo raiz
 * folha: nodo sem filhos
 * sub-árvore: conjunto de nodos de uma árvore
 */

import java.util.NoSuchElementException;

public class ArvoreBinariaHeapMaximo <T> implements Amontoavel <T>{

    private T[] dados;
    private int ponteiroFim;

    public ArvoreBinariaHeapMaximo(int tamanho) {
        dados = (T[]) new Object[tamanho];
        ponteiroFim = -1;
    }

    public ArvoreBinariaHeapMaximo() {
        this(10);
    }

    @Override
    public T obterRaiz() {
        if (estaVazia()) {
            throw new NoSuchElementException("Arvore vazia!");
        }
        return dados[0];
    }

    @Override
    public void inserir(T dado) {
        if (estaCheia()) {
            throw new OverflowException("Arvore Heap cheia!");
        }
        ponteiroFim++;
        dados[ponteiroFim] = dado;
        ajustarAcima(ponteiroFim);
    }

    @Override
    public T extrair() {
        if (estaVazia()) {
            throw new OverflowException("Arvore Heap cheia!");
        }
        T dado = dados[0];
        dados[0] = dados[ponteiroFim];
        ponteiroFim --;
        ajustarAbaixoRec(ponteiroFim);
        return dado;
    }

    @Override
    public boolean estaCheia() {
        return (ponteiroFim == dados.length - 1);
    }

    @Override
    public boolean estaVazia() {
        return (ponteiroFim == -1);
    }

    public int indiceGenitor(int filho) {
        return (filho - 1) / 2;
    }
    public int indiceFilhoEsquerda(int genitor) {
        return (2 * genitor) + 1;
    }

    public int indiceFilhoDireita(int genitor) {
        return (2 * genitor) + 2;
    }
    
    public void trocar(int i, int j) {
        T dadoTemporario = dados[i];
        dados[i] = dados[j];
        dados[j] = dadoTemporario;
    }

    public void ajustarAcima(int filho) {
        int indiceFilho = filho;
        while (indiceFilho != 0) {
            int indiceGenitor = indiceGenitor(indiceFilho);
            if ((Integer) dados[indiceFilho] > (Integer) dados[indiceGenitor]) {
                trocar(indiceFilho, indiceGenitor);
            }
            indiceFilho = indiceGenitor;
        }
    }

    private void ajustarAcimaRecursivo(int filho) {
        if (filho == 0) {
            int indiceGenitor = indiceGenitor(filho);
            if ((Integer) dados[filho] > (Integer) dados[indiceGenitor]) {
                trocar(filho, indiceGenitor);        
            }
            ajustarAcimaRecursivo(indiceGenitor);
        }
    }

    private void ajustarAbaixoRec(int genitor) {
        if (genitor >= ponteiroFim) {
            return;
        }
        int indiceFilhoEsquerda = indiceFilhoEsquerda(genitor);
        int indiceFilhoDireita = indiceFilhoDireita(genitor);
        int indiceMaior = genitor;
        if ((Integer) dados[indiceFilhoEsquerda] > (Integer) dados[indiceMaior)) {
            indiceMaior = indiceFilhoEsquerda;
        }
        if ((Integer) dados[indiceFilhoDireita] > (Integer) dados[indiceMaior]) {
            indiceMaior = indiceFilhoDireita;
        }
        if (indiceMaior != genitor) {
            trocar(genitor, indiceMaior);
            ajustarAbaixoRec(indiceMaior);
        }
    }

    @Override
    public String imprimir() {
        String resultado = "[";
        for (int i = 0; i <= ponteiroFim; i++) {
            if (i == ponteiroFim) {
                resultado += dados[i];
            } else {
                resultado += dados[i] + ",";
            }
        }
        return resultado += "]";
    }
}
