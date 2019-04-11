
package mitocode1;

import java.io.IOException;


public class Excepciones {
    public void mostrar() {
		try {
			throw new IOException("IOException");
		} catch (NullPointerException | IOException | NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void main(String[] args) {
		Excepciones app = new Excepciones();
		app.mostrar();
	}
}
