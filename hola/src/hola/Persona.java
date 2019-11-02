package hola;

public class Persona {
	private int altura;
	private String nombre;
	private boolean fuma;   
	private String nacionalidad;
	private Persona padre;
	public Persona getPadre() {
		return padre;
	}
	public void setPadre(Persona padre) {
		this.padre = padre;
	}
	public Persona getMadre() {
		return madre;
	}
	public void setMadre(Persona madre) {
		this.madre = madre;
	}
	private Persona madre;
	
	

	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isFuma() {
		return fuma;
	}
	public void setFuma(boolean fuma) {
		this.fuma = fuma;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int alt) {
		altura = alt;
	}
	
}
