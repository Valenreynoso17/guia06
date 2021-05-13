package problema02.eventos;

import problema02.Jugador;

public class TiroLibre extends Evento{

	private String descripcionResultado;
	
	public TiroLibre(Integer minutoPartido, Jugador jugadorPrincipal, String descripcionResultado) {
		super(minutoPartido, jugadorPrincipal);
		this.descripcionResultado = descripcionResultado;
	}

}
