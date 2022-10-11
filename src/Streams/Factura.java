package Streams;

public class Factura {
	private String producto;
	private Integer importe;
	
	public Factura(String producto, Integer importe) {
		this.producto = producto;
		this.importe = importe;
	}
	
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public Integer getImporte() {
		return importe;
	}
	public void setImporte(Integer importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "Factura [producto=" + producto + ", importe=" + importe + "]";
	}
		
}
