package problema02.eventos;

import problema02.Jugador;

public class Gol extends Evento{
	private Jugador jugadorSecundario;
	private Boolean esEnContra;
	
	public Gol(Integer minutoPartido, Jugador jugadorPrincipal, Jugador jugadorSecundario, Boolean esEnContra) {
		super(minutoPartido, jugadorPrincipal);
		this.jugadorSecundario = jugadorSecundario;
		this.esEnContra = esEnContra;
	}
	
	
}
