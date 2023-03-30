package principal;

public class Persona {

	private String nombre;
	private String apellido;
	private String codigo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String Nombre) {
		this.nombre = Nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String Apellido) {
		this.apellido = Apellido;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String Codigo) {
		this.codigo = Codigo;
	}
	
	

	@Override
	public String toString() {
		return "Persona [Nombre=" + nombre + ", Apellido=" + apellido + "]";
	}
	public Object subTotal() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
		

	
	