package problema02.eventos;

import problema02.Jugador;

public class TiroDeEsquina extends Evento {

	public String lado;
	
	public TiroDeEsquina(Integer minutoPartido, Jugador jugadorPrincipal, String lado) {
		super(minutoPartido, jugadorPrincipal);
		this.lado = lado;
	}

}
