package died.guia06.excepciones;

public class CreditosRequeridosInsuficientesException extends Exception {
	public CreditosRequeridosInsuficientesException(){
		super("Los cr�ditos obtenidos no son suficientes para inscribirse al curso.");
	}
}
