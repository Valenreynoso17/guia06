package died.guia06.excepciones;

public class RegistroAuditoriaException extends Exception {
	public RegistroAuditoriaException(String mensaje) {
		super("Hubo un problema al momento de registrar: " + mensaje);
	}
}
