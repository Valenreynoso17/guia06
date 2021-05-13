package problema02.eventos;

import problema02.Jugador;

public abstract class Evento {
	protected Jugador jugadorPrincipal;
	protected Integer minutoPartido; // Se podr�a hacer para que sea del tipo LocalTime
	
	public Evento(Integer minutoPartido, Jugador jugadorPrincipal) {
		super();
		this.jugadorPrincipal = jugadorPrincipal;
		this.minutoPartido = minutoPartido;
	}
	
}
