package cliente;

import java.io.IOException;

public class ClienteStart {
	public static void main(String[] args) throws IOException {

		Cliente app = new Cliente();
		app.conectar();
		app.escutar();
	}
}
