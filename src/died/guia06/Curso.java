package died.guia06;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import died.guia06.excepciones.CreditosRequeridosInsuficientesException;
import died.guia06.excepciones.CupoLlenoException;
import died.guia06.excepciones.MateriasCicloLectivoCompleto;
import died.guia06.excepciones.RegistroAuditoriaException;
import died.guia06.util.Registro;

/**
 * Clase que representa un curso. Un curso se identifica por su ID y por su nombre y ciclo lectivo.
 * Un curso guarda una lista de los inscriptos actuales que tienen.
 * Un curso, al aprobarlo, otorga una cantidad de creditos definidas en el curso.
 * Un curso requiere que para inscribirnos tengamos al menos la cantidad de creditos requeridas, y que haya cupo disponible
 * @author marti
 *
 */
public class Curso {

	private Integer id;
	private String nombre;
	private Integer cicloLectivo;
	private Integer cupo; 
	private List<Alumno> inscriptos;
	private Integer creditos;
	private Integer creditosRequeridos;
	
	private Registro log;
	
	public Curso(Integer id, String nombre, Integer cicloLectivo, Integer cupo, Integer creditos, Integer creditosRequeridos) {
		super();
		this.inscriptos = new ArrayList<Alumno>();
		this.log = new Registro();
		
		this.id = id;
		this.nombre = nombre;
		this.cicloLectivo = cicloLectivo;
		this.cupo = cupo;
		this.creditos = creditos;
		this.creditosRequeridos = creditosRequeridos;
	}

	/**
	 * Este método, verifica si el alumno se puede inscribir y si es así lo agrega al curso,
	 * agrega el curso a la lista de cursos en los que está inscripto el alumno y retorna verdadero.
	 * Caso contrario retorna falso y no agrega el alumno a la lista de inscriptos ni el curso a la lista
	 * de cursos en los que el alumno está inscripto.
	 * 
	 * Para poder inscribirse un alumno debe
	 * 		a) tener como minimo los creditos necesarios
	 *      b) tener cupo disponibles
	 *      c) puede estar inscripto en simultáneo a no más de 3 cursos del mismo ciclo lectivo.
	 * @param a
	 * @return
	 */
	private Boolean inscribir(Alumno a) throws 	CupoLlenoException, CreditosRequeridosInsuficientesException,
												MateriasCicloLectivoCompleto, RegistroAuditoriaException{
		
		if (this.inscriptos.size() == this.cupo) throw new CupoLlenoException();
		
		if (! a.creditosSuficientes(this.creditosRequeridos)) throw new CreditosRequeridosInsuficientesException();
		
		if (! a.cursosEnCicloLectivo(this.cicloLectivo)) throw new MateriasCicloLectivoCompleto();
		
		// Tambien tendria que verificar si no se quiere agregar dos veces el mismo 
		
		try {
			log.registrar(this, "inscribir ",a.toString());
			this.inscriptos.add(a);
			a.inscripcionAceptada(this);
			return true;
			
		} catch (IOException e) {
			throw new RegistroAuditoriaException(e.getMessage());
		}
		
	}
	
	public void inscribirAlumno(Alumno a) throws 	CupoLlenoException, CreditosRequeridosInsuficientesException,
													MateriasCicloLectivoCompleto, RegistroAuditoriaException{
		
		this.inscribir(a);
		
	}
	
	/**
	 * imprime los inscriptos en orden alfabetico
	 */
	public void imprimirInscriptos(Comparator<Alumno> orden) {
		try {
			log.registrar(this, "imprimir listado",this.inscriptos.size()+ " registros ");
			
			this.inscriptos.stream().sorted(orden).forEach((alumno) -> System.out.println(alumno.toString()));
			
		} catch (IOException e) {
			System.out.println("Hubo un problema al momento de registrar: " + e.getMessage());
		}
	}

	public Integer getCreditos() {
		return this.creditos;
	}

	public Integer getCicloLectivo() {
		return this.cicloLectivo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Curso))
			return false;
		Curso other = (Curso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
}
