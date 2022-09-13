package Interfaces;

import asociaciones.Persona;

public class PalomaMensajera extends Paloma implements Comunicable {
	
	private String mensaje;

	public PalomaMensajera(String nombre, String color) {
		super(nombre, color);
		this.mensaje = "";
	}
	
	@Override
	public void recibirMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public void enviarMensajeA(Persona receptor) {
		receptor.recibirMensaje(this.mensaje);
	}

}
