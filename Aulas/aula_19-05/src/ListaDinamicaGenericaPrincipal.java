import java.util.Scanner;

public class ListaDinamicaGenericaPrincipal {

	static Scanner sc = new Scanner(System.in);
	static ListaDinamicaGenerica<Integer> lista = new ListaDinamicaGenerica<Integer>();

	public static void main(String[] args) {
		int opcao = 0;
		do {
			menu();
			opcao = sc.nextInt();
			switch (opcao) {
				case 1:
					inseir();
					break;
				case 2:
					anexar();
					break;
				case 3:
					excluir();
					break;
				case 4:
					selecionar();
					break;
				case 5:
					selecionarTodos();
					break;
				case 6:
					atualizar();
					break;
				case 7:
					System.out.println(lista.imprimir());
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		} while (opcao != 0);

	}

	public static void menu() {
		System.out.println("============ Lista Dinâmica ============");
		System.out.println("1 - Inserir");
		System.out.println("2 - Anexar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Selecionar");
		System.out.println("5 - Selecionar Todos");
		System.out.println("6 - Atualizar");
		System.out.println("7 - Imprimir");
		System.out.println("0 - Sair");
		System.out.println("Escolha uma opção: ");
		System.out.println("========================================");
	}

	public static void inseir() {
		do {
			try {
				System.out.println("Digite a posição: ");
				int posicao = sc.nextInt();
				System.out.println("Digite o dado: ");
				int dado = sc.nextInt();
				lista.inserir(posicao, dado);
				return;
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		} while (true);
	}

	public static void anexar() {
		do {
			try {
				System.out.println("Digite o dado: ");
				int dado = sc.nextInt();
				lista.anexar(dado);
				return;
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		} while (true);
	}

	public static void excluir() {
		do {
			try {
				System.out.println("Digite a posição: ");
				int posicao = sc.nextInt();
				lista.apagar(posicao);
				return;
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		} while (true);
	}

	public static void selecionar() {
		do {
			try {
				System.out.println("Digite a posição: ");
				int posicao = sc.nextInt();
				System.out.println(lista.selecionar(posicao));
				return;
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		} while (true);
	}

	public static void selecionarTodos() {
		Integer[] dados = lista.selecionarTodos();
		for (Integer dado : dados) {
			System.out.println(dado);
		}
	}

	public static void atualizar() {
		do {
			try {
				System.out.println("Digite a posição: ");
				int posicao = sc.nextInt();
				System.out.println("Digite o novo dado: ");
				int novoDado = sc.nextInt();
				lista.atualizar(posicao, novoDado);
				return;
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		} while (true);
	}
}