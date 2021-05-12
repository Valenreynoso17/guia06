package problema02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Liga {
	private String nombre;
	private List<Fecha> fixture;
	
	private static Integer cantEquiposMax = 10;

	public Liga(String nombre) {
		super();
		this.nombre = nombre;
		this.fixture = new ArrayList<Fecha>();
	}
	
	
}
