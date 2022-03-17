package caixa;

public class Caixa {

    private final int linhas;
    private final int colunas;
    private String caracter;

    public Caixa(int linhas, int colunas, String caracter) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.caracter = caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public void imprimir() {
        System.out.print(horizontal());
        System.out.print(vertical());
		System.out.print(horizontal());
	}

    public String horizontal() {
        String resultado = "";

        for (int i = 0; i < colunas; i++) {
            resultado = resultado.concat(caracter);
        }
        resultado = resultado.concat("\n");

        return resultado;
    }

    private String vertical() {
		String resultado = "";
        for (int i = 0; i < linhas; i++) {
			resultado = resultado.concat(caracter);
            for (int x = 0; x < colunas - 2; x++) {
				resultado = resultado.concat(" ");
			}
			resultado = resultado.concat(caracter+"\n");
        }
		return resultado;
    }

}
