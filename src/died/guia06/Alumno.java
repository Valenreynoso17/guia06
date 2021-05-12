package died.guia06;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Alumno implements Comparable<Alumno> {

	private String nombre;
	private Integer nroLibreta;
	private List<Curso> cursando;
	private List<Curso> aprobados;

	public Alumno(String nombre, Integer nroLibreta) {
		super();
		this.nombre = nombre;
		this.nroLibreta = nroLibreta;

		this.cursando = new ArrayList<Curso>();
		this.aprobados = new ArrayList<Curso>();
	}

	public int creditosObtenidos() {
		
		Optional<Integer> creditos = 	this.aprobados.stream()
										.map(c -> c.getCreditos())
										.reduce((acum, cred) -> {return acum + cred;});

		return creditos.orElse(0);
		
	}

	public void aprobar(Curso c) {
		
		this.cursando.remove(c);

		/*for (Curso unCurso : this.cursando) {
			if (unCurso.equals(c)) {
				this.cursando.remove(unCurso);
				break;
			}
		}*/

		this.aprobados.add(c);

	}

	public void inscripcionAceptada(Curso c) {
		
		// En principio cuando llego aca ya esta todo verificado
		this.cursando.add(c);

	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;

		if (!(obj instanceof Alumno))
			return false;

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

	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public Integer getNroLibreta(){
		return this.nroLibreta;
	}

	public Boolean creditosSuficientes(Integer creditosRequeridos) {
		
		return this.creditosObtenidos() >= creditosRequeridos;
		
	}

	public Boolean cursosEnCicloLectivo(Integer cicloLectivo) {
		// Verifico que tenga hasta 3 cursos del mismo ciclo lectivo
		Integer cantCursosEnCiclo = 0;

		for (Curso unCurso : this.cursando) {
			if (unCurso.getCicloLectivo().equals(cicloLectivo)) {

				if (++cantCursosEnCiclo == 3) {
					return false;
				}
			}
		}
		return true;
		
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nroLibreta=" + nroLibreta + "]";
	}
}
