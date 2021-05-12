package died.guia06;

import java.util.Comparator;

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
		
		System.out.println(ami.inscribir(a1));
		System.out.println(fisica.inscribir(a1));
		System.out.println(syo.inscribir(a1));
		System.out.println(algoritmos.inscribir(a1));
		
		System.out.println(a1.equals(a11));
		
		System.out.println(ami.inscribir(a2));
		System.out.println(matSuperior.inscribir(a2));
		
		Comparator<Alumno> compAlfabetico = (a,b) -> a.getNombre().compareTo(b.getNombre());
		Comparator<Alumno> compLegajo = (a,b) -> a.getNroLibreta().compareTo(b.getNroLibreta());
		
		ami.imprimirInscriptos(compAlfabetico);
		ami.imprimirInscriptos(compLegajo);
	}
}
