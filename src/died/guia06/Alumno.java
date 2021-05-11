package died.guia06;

import java.util.List;
import java.util.Optional;


public class Alumno implements Comparable<Alumno>{

	private String nombre;
	private Integer nroLibreta;
	private List<Curso> cursando;
	private List<Curso> aprobados;

	public int creditosObtenidos() {
		//Integer creditos = 0;
		
		/*
		for (Curso unCurso : this.aprobados) {
			creditos += unCurso.getCreditos();
		}*/
		
		Optional<Integer> creditos = 	(this.aprobados.stream()
							.map(c -> c.getCreditos())
							.reduce((acum, cred) -> {return acum+cred;}));
		
		return creditos.orElse(0);
	}

	public void aprobar(Curso c) {
		/* Una opción seria recorrer con un for verificando si es o no igual al curso dado,
		 * si es igual se eliminaria de la lista y se agregaria a la lista de aprobados
		 */
		/* Queria hacerlo con funcional pero no se si se puede ya que en principio no podria 
		 * eliminar un elemento de la lista original
		 */
		
		/* Que tanto tendría que ponerme a ver los errores? por ejemplo que el curso no este en la lista 
		 */
		for(Curso unCurso : this.cursando) {
			if(unCurso.equals(c)) {
				this.cursando.remove(unCurso);
				break;
			}
		}
		
		this.aprobados.add(c);
		
	}

	public void inscripcionAceptada(Curso c) {
		
		// TODO: se podría hacer que lance una excepción
		if (this.cursando.size() == 3) return;
		
		if (c.creditosSuficientes(this.creditosObtenidos())) {
			if (c.inscribir(this)) {
				this.cursando.add(c);
			}
		}
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
