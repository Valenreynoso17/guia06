package problema02.eventos;

import problema02.Jugador;

public class Infraccion extends Evento{

	private Jugador jugadorSecundario;
	
	public Infraccion(Integer minutoPartido, Jugador jugadorPrincipal, Jugador jugadorSecundario) {
		super(minutoPartido, jugadorPrincipal);
		this.jugadorSecundario = jugadorSecundario;
	}
	
}
