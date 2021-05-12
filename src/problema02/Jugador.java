package problema02;

import java.time.LocalDate;

public class Jugador {
	
	private String nombre;
	private Long dni;
	private LocalDate fechaNacimiento;
	private Integer posicion;
	private Double altura;
	private Double peso;
	private String pieHabil;
	
	
	public Jugador(	String nombre, Long dni, LocalDate fechaNacimiento,
					Integer posicion, Double altura, Double peso, String pieHabil) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.posicion = posicion;
		this.altura = altura;
		this.peso = peso;
		this.pieHabil = pieHabil;
	}
	
}
