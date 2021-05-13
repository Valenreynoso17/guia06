package problema02;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private String nombre;
	private List<Jugador> listaJugadores;
	
	private static Integer cantidadJugadores = 21;

	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		this.listaJugadores = new ArrayList<Jugador>();
	}
	
	public void agregarJugador(Jugador j) {
		if (this.listaJugadores.size() < Equipo.cantidadJugadores) this.listaJugadores.add(j); 
	}
	
	
}
