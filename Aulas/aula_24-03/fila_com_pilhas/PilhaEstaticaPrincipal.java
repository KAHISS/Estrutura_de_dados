//Para compilar os arquivos. javac *.java
//Para rodar o programa. java PilhaEstaticaPrincipal
public class PilhaEstaticaPrincipal {
	public static void main(String args[]) {
		PilhaEstatica pilha1 = new PilhaEstatica(30);
		// uma boa prática e instanciar o objeto usando a interface, porém quando ouver algum método 
		Empilhavel pilha2 = new PilhaEstatica(30);

		pilha1.empilhar("Bacharelado");
		pilha1.empilhar("em");
		System.out.println("Espiar:" + pilha1.espiar());
		pilha1.empilhar("Sistemas");
		pilha1.empilhar("de");
		pilha1.desempilhar();
		pilha1.empilhar("teste");
	}
}