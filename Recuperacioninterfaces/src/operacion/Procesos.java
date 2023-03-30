package operacion;

import java.util.ArrayList;

import principal.Persona;

public class Procesos {
	ArrayList<Persona> misClientes;
	
	public Procesos() {
		misClientes =  new ArrayList<>();
	}
	
	public double calcularSubTotal (double precioProducto, int cantidadProducto) {
		
		return precioProducto*cantidadProducto;
		
	}
	
	public double calcularDescuento(double precioProducto, int cantidadProducto) {
			
		double descuento = 0;
			if (cantidadProducto < 5) {
				descuento = (precioProducto * 0.1);
			}else if(cantidadProducto >= 5 && precioProducto < 10) {
				descuento = (precioProducto * 0.2);
			}else {
				descuento = (precioProducto * 0.4);
			}
			
			return descuento;
		}
	
	public double calcularTotal(double subTotal, double descuento) {
		
		return subTotal-descuento;
	}
	
	public void guardarDatos(Persona cliente) {
		misClientes.add(cliente);
		
	}
	
	public ArrayList<Persona> getList(){
		return misClientes;
	}

	public double calcularDescuento(Object subTotal) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
