package died.guia06;

import java.util.List;


public class Alumno implements Comparable<Alumno>{

	private String nombre;
	private Integer nroLibreta;
	private List<Curso> cursando;
	private List<Curso> aprobados;

	public int creditosObtenidos() {
		return 1;
	}

	public void aprobar(Curso c) {
		//
	}

	public void inscripcionAceptada(Curso c) {
		//
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 	return true;
		
		if (!(obj instanceof Alumno))	return false;
		
		Alumno other = (Alumno) obj;
		if (nroLibreta == null) {
			if (other.nroLibreta != null)
				return false;
		} else if (!nroLibreta.equals(other.nroLibreta))
			return false;
		return true;
	}

	@Override
	public int compareTo(Alumno o) {
		return this.nombre.compareTo(o.getNombre());
	}
	
	private String getNombre() {
		return this.nombre;
	}
	
	
	
	
	

}
