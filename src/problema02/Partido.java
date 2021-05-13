package problema02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import problema02.eventos.Evento;

public class Partido {
	private Equipo local;
	private Equipo visitante;
	private LocalDateTime fechaPartido;
	private List<Evento> listaEventos;
	
	public Partido(Equipo local, Equipo visitante, LocalDateTime fechaPartido) {
		super();
		this.local = local;
		this.visitante = visitante;
		this.fechaPartido = fechaPartido;
		this.listaEventos = new ArrayList<Evento>();
	}
	
	public void agregarEvento(Evento e) {
		this.listaEventos.add(e);
	}
	
}
