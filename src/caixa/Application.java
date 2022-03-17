package caixa;

public class Application {

	public static void main(String[] args) {
		Caixa cx = new Caixa(5, 5, ".");
		cx.imprimir();

		cx.setCaracter("/");
		cx.imprimir();
	}
}
