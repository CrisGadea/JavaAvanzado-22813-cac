package Interfaces;

import asociaciones.Persona;

public interface Comunicable {
	
	public abstract void enviarMensajeA(Persona receptor);
	public abstract void recibirMensaje(String mensaje);
	
}
