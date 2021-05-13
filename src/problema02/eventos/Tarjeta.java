package problema02.eventos;

import problema02.Jugador;

public class Tarjeta extends Evento {

	private String motivo;
	
	public Tarjeta(Integer minutoPartido, Jugador jugadorPrincipal, String motivo) {
		super(minutoPartido, jugadorPrincipal);
		this.motivo = motivo;
	}

}
