
public class Auto {
	// Caracteristicas (Propiedades de la Clase Auto)
	private String modelo, color, patente;
	private int anio;
	private Boolean estaEncendido;
	
	// Método Constructor crea la instancia de la Clase
	public Auto(String modelo, String color, String patente, int anio, Boolean estaEncendido){
		this.modelo = modelo;
		this.color = color;
		this.patente = patente;
		this.anio = anio;
		this.estaEncendido = estaEncendido;
	}
	// Sobrecarga de metodos
	public Auto(String modelo, String color, String patente) {
		this.modelo = modelo;
		this.color = color;
		this.patente = patente;
	}

	// Funciones (Métodos de la Clase Auto)
	public String encender() {
		if (estaEncendido) {
			return "Arranqué";
		} else {
			return "Todavía no arrancó";
		}
	}
	public String acelerar() {
		return "Estoy acelerando...";
	}
	public String frenar() {
		return "Frenamos!";
	}
	public String reversa() {
		return "Retrocedemos";
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Boolean getEstaEncendido() {
		return estaEncendido;
	}
	public void setEstaEncendido(Boolean estaEncendido) {
		this.estaEncendido = estaEncendido;
	}
	
	
}
