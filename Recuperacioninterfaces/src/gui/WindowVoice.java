package gui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import operacion.Procesos;
import principal.Persona;
import principal.Productos;

public class WindowVoice extends JFrame {

	private JTextField txtNombre, txtApellido, txtCodigo, txtProducto, txtPrecio, txtCantidad;
	private JPanel showInvoice;
	Procesos miProcesos;
	private JLabel txtsubTotalFactura;
	private JLabel txtDescuentoFactura;
	private JLabel txtTotalFactura;
	
	
	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JTextField getTxtCodigo() {
		return txtCodigo;
	}

	public void setTxtCodigo(JTextField txtCodigo) {
		this.txtCodigo = txtCodigo;
	}

	public JTextField getTxtProducto() {
		return txtProducto;
	}

	public void setTxtProducto(JTextField txtProducto) {
		this.txtProducto = txtProducto;
	}

	public JTextField getTxtPrecio() {
		return txtPrecio;
	}

	public void setTxtPrecio(JTextField txtPrecio) {
		this.txtPrecio = txtPrecio;
	}

	public JTextField getTxtCantidad() {
		return txtCantidad;
	}

	public void setTxtCantidad(JTextField txtCantidad) {
		this.txtCantidad = txtCantidad;
	}

	public WindowVoice() {
		startComponents();
		setTitle("SISTEMA DE COMPRAS");
		setSize(890, 451);
		setLocationRelativeTo(null);
		
	}
	
private void startComponents() {
		
		showInvoice = new JPanel();
		showInvoice.setBorder(new EmptyBorder(5, 5, 5, 5));
		showInvoice.setBounds(0, 0, 876, 423);
		showInvoice.setLayout(null);
		
		JLabel lblFactura = new JLabel("FACTURA");
		lblFactura.setHorizontalAlignment(SwingConstants.CENTER);
		lblFactura.setFont(new Font("SansSerif", Font.BOLD, 50));
		lblFactura.setBounds(0, 26, 876, 100);
		showInvoice.add(lblFactura);
		
		JLabel lblNombrelbl = new JLabel("Nombre:");
		lblNombrelbl.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombrelbl.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNombrelbl.setBounds(55, 141, 116, 40);
		showInvoice.add(lblNombrelbl);
		
		
		JTextField txtNombreFactura = new JTextField();
		txtNombreFactura.setFont(new Font("SansSerif", Font.BOLD, 18));
		txtNombreFactura.setBounds(166, 142, 197, 40);
		txtNombreFactura.setColumns(10);
		txtNombreFactura.setEditable(false);
		showInvoice.add(txtNombreFactura);
		
		JLabel lblPrecioTotal = new JLabel("Subtotal:");
		lblPrecioTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecioTotal.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblPrecioTotal.setBounds(55, 213, 131, 40);
		showInvoice.add(lblPrecioTotal);
		
		JTextField txtSubTotalFactura = new JTextField();
		txtSubTotalFactura.setFont(new Font("SansSerif", Font.BOLD, 18));
		txtSubTotalFactura.setColumns(10);
		txtSubTotalFactura.setBounds(177, 214, 197, 40);
		txtSubTotalFactura.setEditable(false);
		showInvoice.add(txtSubTotalFactura);
		
		JLabel lblDescuento = new JLabel("Descuento:");
		lblDescuento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescuento.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblDescuento.setBounds(439, 213, 158, 40);
		showInvoice.add(lblDescuento);
		
		JTextField txtDescuentoFactura = new JTextField();
		txtDescuentoFactura.setFont(new Font("SansSerif", Font.BOLD, 18));
		txtDescuentoFactura.setColumns(10);
		txtDescuentoFactura.setBounds(595, 214, 197, 40);
		txtDescuentoFactura.setEditable(false);
		showInvoice.add(txtDescuentoFactura);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblTotal.setBounds(248, 305, 131, 40);
		showInvoice.add(lblTotal);
		
		JTextField txtTotalFactura = new JTextField();
		txtTotalFactura.setFont(new Font("SansSerif", Font.BOLD, 18));
		txtTotalFactura.setColumns(10);
		txtTotalFactura.setBounds(370, 306, 197, 40);
		txtTotalFactura.setEditable(false);
		showInvoice.add(txtTotalFactura);
		
		getContentPane().add(showInvoice);

	}

	public void getDataWindow(Persona cliente, Productos misProductos) {
		
		miProcesos = new Procesos();
		
		double subTotal = miProcesos.calcularSubTotal(misProductos.getPrecioProduto(), misProductos.getCantidadProducto());
		double descuento = miProcesos.calcularDescuento(cliente.subTotal());
		double total = miProcesos.calcularTotal(subTotal, descuento);
		
		
		txtNombre.setText(cliente.getNombre());
		txtsubTotalFactura.setText(subTotal+"");
		txtDescuentoFactura.setText(descuento+"");
		txtTotalFactura.setText(total+"");
		
	}


}
