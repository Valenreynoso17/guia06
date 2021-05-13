package problema02;

import java.util.ArrayList;
import java.util.List;

public class Fecha {
	private Integer numFecha;
	private List<Partido> listaPartidos;
	
	public Fecha(Integer numFecha) {
		super();
		this.numFecha = numFecha;
		this.listaPartidos = new ArrayList<Partido>();
	}
	
	public void agregarPartido(Partido p) {
		this.listaPartidos.add(p);
	}
}
