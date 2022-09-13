package Interfaces;

import asociaciones.Persona;

public class Celular implements Comunicable{

	private String marca;
	private String modelo;
	private String color;
	private int nroTelefono;
	private String mensaje;
	
	public Celular(String marca, String modelo, String color, int nroTelefono) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.nroTelefono = nroTelefono;
		this.mensaje= "";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public int getNroTelefono() {
		return nroTelefono;
	}

	public void setNroTelefono(int nroTelefono) {
		this.nroTelefono = nroTelefono;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", nroTelefono=" + nroTelefono
				+ "]";
	}

	@Override
	public void enviarMensajeA(Persona receptor) {
		receptor.recibirMensaje(this.mensaje);
	}

	@Override
	public void recibirMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
