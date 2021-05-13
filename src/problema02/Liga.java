package problema02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Liga {
	
	private String nombre;
	private List<Fecha> fixture;
	private List<Equipo> equipos;
	
	private static Integer cantEquiposMax = 10;

	public Liga(String nombre) {
		super();
		this.nombre = nombre;
		this.fixture = new ArrayList<Fecha>();
		this.equipos = new ArrayList<Equipo>();
	}	
	
	public void agregarEquipo(Equipo e) {
		if (this.equipos.size() < Liga.cantEquiposMax) this.equipos.add(e);
	}
	
	public void eliminarEquipo(Equipo e) {
		this.equipos.remove(e);
	}
	
	public void agregarFecha(Fecha f) {
		this.fixture.add(f);
	}
	
	//TODO: hacer
	public void tablaPosiciones() {
		this.equipos.stream().filter(null);
	}
}
