package died.guia06;

import java.util.Comparator;

import died.guia06.excepciones.CreditosRequeridosInsuficientesException;
import died.guia06.excepciones.CupoLlenoException;
import died.guia06.excepciones.MateriasCicloLectivoCompleto;
import died.guia06.excepciones.RegistroAuditoriaException;

public class App {

	public static void main(String[] args) {
		
		Curso ami = new Curso(0, "Análisis Matemático I", 1, 25, 5, 0);
		Curso fisica = new Curso(1, "Física I", 1, 30, 6, 0);
		Curso algoritmos = new Curso(3, "Algoritmos y ...", 1, 35, 6, 0);
		Curso syo = new Curso(5, "Sistemas y Org", 1, 33, 7, 0);
		Curso matSuperior = new Curso(4, "Matemática Superior", 3, 20, 10, 5);
		
		Alumno a1 = new Alumno("Juan Perez", 11111);
		Alumno a11 = new Alumno("JUAN PEREZ", 11111);
		Alumno a2 = new Alumno("Mateo Tarsion", 22222);
		Alumno a4 = new Alumno("Alejo Ramirez", 33333);
		Alumno a5 = new Alumno("Pedro Aznar", 44444);
		
		try {
			ami.inscribirAlumno(a1);
			fisica.inscribirAlumno(a1);
			syo.inscribirAlumno(a1);
			algoritmos.inscribirAlumno(a1);
		} catch (	CupoLlenoException | CreditosRequeridosInsuficientesException | 
					MateriasCicloLectivoCompleto | RegistroAuditoriaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(a1.equals(a11));
		
		try {
			ami.inscribirAlumno(a2);
			matSuperior.inscribirAlumno(a2);
		} catch (CupoLlenoException | CreditosRequeridosInsuficientesException |
				MateriasCicloLectivoCompleto | RegistroAuditoriaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		Comparator<Alumno> compAlfabetico = (a,b) -> a.getNombre().compareTo(b.getNombre());
		Comparator<Alumno> compLegajo = (a,b) -> a.getNroLibreta().compareTo(b.getNroLibreta());
		
		ami.imprimirInscriptos(compAlfabetico);
		ami.imprimirInscriptos(compLegajo);
	}
}
