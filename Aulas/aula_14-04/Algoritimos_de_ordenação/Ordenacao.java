public class Ordenacao {

    int dados[] = {6, 8, 3, 1, 9, 0, 2, 5};

    public void imprimirTela() {
        for (int dado: dados) {
            System.out.print(dado + " ");
        }
        System.out.println();
    }

    public void selectionSort() {
        for (int j = 0; j < dados.length; j++) {
            int menor = j;
            for (int i = 1+j; i < dados.length; i++) {
                if (dados[menor] > dados[i]) {
                    menor = i;
                }
            }
            troca(j, menor);
        }
    }

    public void insertionSort() {
        for (int j = 1; j < dados.length; j++) {
            for (int i = j-1; i >= 0; i--) {
                if (dados[i+1] < dados[i]) {
                    troca(i, i+1);
                }
            }
        }
    }

    public void bubbleSort() {
        for (int j = 0; j < dados.length - 1; j++) {
            for (int i = 0; i < (dados.length - 1) - j; i++) {
                if (dados[i] > dados[i+1]) {
                    troca(i, i+1);
                }
            }
        }
        
    }

    private void troca(int indice1, int indice2) {
        int temp = dados[indice1];
        dados[indice1] = dados[indice2];
        dados[indice2] = dados[temp];
    }

    public static void main(String[] args) {
        Ordenacao ordenacao = new Ordenacao();
        ordenacao.imprimirTela();
        ordenacao.insertionSort();
        ordenacao.imprimirTela();
    }
}