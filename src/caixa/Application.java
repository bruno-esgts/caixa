package caixa;

public class Application {

	public static void main(String[] args) {
		int linhas = 5;
		int colunas = 5;
		
		// TOPO
		horizontal(colunas);

		// LATERAL
		vertical(linhas, colunas);

		//FIM
		horizontal(colunas);
	}
	
	private static void horizontal(int colunas) {
		for (int i=0; i < colunas; i++) {
			System.out.print("0");
		}
		System.out.println("");
	}
	
	private static void vertical(int linhas, int colunas) {
		for (int i=0; i < linhas; i++) {
			System.out.print("0");
			for (int x=0; x < colunas - 2; x++) {
				System.out.print(" ");
			}
			System.out.print("0");
			System.out.println("");
		}
	}
}
