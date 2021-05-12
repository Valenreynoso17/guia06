package died.guia06.excepciones;

public class CupoLlenoException extends Exception {
	public CupoLlenoException() {
		super("El cupo del curso se encuentra completo.");
	}
}
