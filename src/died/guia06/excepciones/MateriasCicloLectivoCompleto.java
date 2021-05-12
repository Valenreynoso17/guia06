package died.guia06.excepciones;

public class MateriasCicloLectivoCompleto extends Exception {
	public MateriasCicloLectivoCompleto() {
		super("El alumno ya está cursando 3 materias de ese ciclo lectivo.");
	}

}
