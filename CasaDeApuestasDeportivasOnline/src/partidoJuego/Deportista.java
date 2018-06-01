package partidoJuego;

import java.util.List;

public class Deportista extends Protagonista{
	private String apellido;
	private String lugarNacimiento;
	private String fechaNacimiento;

	public Deportista(String nombre, String apellido, String lugarNacimiento, String fechaNacimiento) {
		super(nombre);
		this.apellido = apellido;
		this.lugarNacimiento = lugarNacimiento;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public List<String> getResultados() {
		return this.resultados;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public String getLugarNacimiento() {
		return this.lugarNacimiento;
	}
	
	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}
}
