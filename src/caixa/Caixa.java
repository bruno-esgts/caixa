package caixa;

/**
 * <h1>Classe caixa</h1>
 *
 * <p>Imprime uma caixa no ecrã com o numero de linhas e colunas definidos no construtor</p>
 *
 * @author Bruno Jesus
 * @version 1.0
 * @since 2022-03-17
 */
public class Caixa {

    /**
     * Numero de linhas da caixa
     */
    private final int linhas;

    /**
     * Numero de colunas da caixa
     */
    private final int colunas;

    /**
     * Numero de caracteres da caixa
     */
    private String caracter;

    public Caixa(int linhas, int colunas, String caracter) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.caracter = caracter;
    }

    /**
     * Muda o caracter a ser impresso para a caixa
     */
    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    /**
     * Imprime a caixa no ecrã
     *
     * @see System#out
     * @see Caixa#toString()
     * @deprecated use {@link Caixa#toString()} instead
     */
    public void imprimir() {
        System.out.print(horizontal()); //horizontal
        System.out.print(vertical());
		System.out.print(horizontal());
	}

    /**
     * Representação da caixa em String
     * @return String a caixa a ser desenhada
     */
    public String toString() {
        String resultado = "";
        resultado = resultado.concat(horizontal());
        resultado = resultado.concat(vertical());
        resultado = resultado.concat(horizontal());

        return resultado;
    }

    private String horizontal() {
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
            // ciclo para as colunas
            for (int x = 0; x < colunas - 2; x++) {
				resultado = resultado.concat(" ");
			}
			resultado = resultado.concat(caracter+"\n");
        }
		return resultado;
    }

}
