package caixa;

public class Application {

	public static void main(String[] args) {
		// TOPO
		horizontal();

		// LATERAL
		vertical();

		//FIM
		horizontal();
	}
	
	private static void horizontal() {
		for (int i=0; i < 9; i++) {
			System.out.print("0");
		}
		System.out.println("");
	}
	
	private static void vertical() {
		for (int i=0; i < 9; i++) {
			System.out.print("0");
			System.out.print("       ");
			System.out.print("0");
			System.out.println("");
		}
	}
}
