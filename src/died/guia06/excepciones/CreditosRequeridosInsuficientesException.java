package died.guia06.excepciones;

public class CreditosRequeridosInsuficientesException extends Exception {
	public CreditosRequeridosInsuficientesException(){
		super("Los créditos obtenidos no son suficientes para inscribirse al curso.");
	}
}
