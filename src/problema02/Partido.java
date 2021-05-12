package problema02;

import java.time.LocalDateTime;

public class Partido {
	private Equipo local;
	private Equipo visitante;
	private LocalDateTime fechaPartido;
	
	public Partido(Equipo local, Equipo visitante, LocalDateTime fechaPartido) {
		super();
		this.local = local;
		this.visitante = visitante;
		this.fechaPartido = fechaPartido;
	}
}
