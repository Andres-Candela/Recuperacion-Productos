package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import operacion.Procesos;
import principal.Persona;
import principal.Productos;

public class VentanaPrincipal extends JFrame  implements ActionListener{

	WindowVoice miFactura;
	private JPanel containerPrincipal;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCodigo;
	private JTextField txtProducto;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnComprar;
	private JButton btnMostarCompras;
	private JButton btnBuscar;
	private JButton btnEliminar;
	Procesos misProcesos;
	Productos misProductos;
	Persona Cliente;
	
	Hashtable<String, Persona> misClientes;
	
	public VentanaPrincipal() {
		misProcesos = new Procesos();
		startComponents();
		setTitle("COMPRA DE PRODUCTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(890, 600);
		setLocationRelativeTo(null);
		
		misClientes=new Hashtable<String, Persona>();
	}
	
	public void startComponents() {
		
		
		containerPrincipal = new JPanel();
		containerPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		containerPrincipal.setLayout(null);
		
		JLabel lblTitle = new JLabel("SISTEMA DE COMPRAS");
		lblTitle.setBounds(10, 0, 876, 100);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("SansSerif", Font.BOLD, 50));
		containerPrincipal.add(lblTitle);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 111, 876, 14);
		separator.setForeground(new Color(0, 0, 0));
		containerPrincipal.add(separator);
		
		getContentPane().add(containerPrincipal);
		
		JLabel lblSubTitle = new JLabel("INGRESO DE DATOS");
		lblSubTitle.setBounds(260, 121, 368, 53);
		lblSubTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTitle.setFont(new Font("SansSerif", Font.PLAIN, 35));
		containerPrincipal.add(lblSubTitle);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(34, 208, 116, 40);
		lblNombre.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		containerPrincipal.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(143, 212, 147, 34);
		txtNombre.setFont(new Font("SansSerif", Font.PLAIN, 18));
		containerPrincipal.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(329, 207, 116, 40);
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setFont(new Font("SansSerif", Font.BOLD, 20));
		containerPrincipal.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(438, 212, 147, 34);
		txtApellido.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtApellido.setColumns(10);
		containerPrincipal.add(txtApellido);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(622, 208, 116, 40);
		lblCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo.setFont(new Font("SansSerif", Font.BOLD, 20));
		containerPrincipal.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(731, 212, 92, 34);
		txtCodigo.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtCodigo.setColumns(10);
		containerPrincipal.add(txtCodigo);
		
		JLabel lblProducto = new JLabel("Producto:");
		lblProducto.setBounds(34, 364, 116, 40);
		lblProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblProducto.setFont(new Font("SansSerif", Font.BOLD, 20));
		containerPrincipal.add(lblProducto);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(154, 368, 147, 34);
		txtProducto.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtProducto.setColumns(10);
		containerPrincipal.add(txtProducto);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(329, 364, 116, 40);
		lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio.setFont(new Font("SansSerif", Font.BOLD, 20));
		containerPrincipal.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(438, 368, 147, 34);
		txtPrecio.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtPrecio.setColumns(10);
		containerPrincipal.add(txtPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(622, 364, 116, 40);
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setFont(new Font("SansSerif", Font.BOLD, 20));
		containerPrincipal.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(731, 368, 92, 34);
		txtCantidad.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtCantidad.setColumns(10);
		containerPrincipal.add(txtCantidad);
		
		btnComprar = new JButton("Comprar");
		btnComprar.setBounds(34, 480, 153, 50);
		btnComprar.setForeground(new Color(255, 255, 255));
		btnComprar.setBackground(new Color(0, 0, 0));
		btnComprar.setFont(new Font("SansSerif", Font.BOLD, 25));
		btnComprar.addActionListener(this);
		containerPrincipal.add(btnComprar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(211, 480, 153, 50);
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setFont(new Font("SansSerif", Font.BOLD, 25));
		btnBuscar.setBackground(Color.BLACK);
		containerPrincipal.add(btnBuscar);
		
		btnMostarCompras = new JButton("Mostrar Compras");
		btnMostarCompras.setBounds(388, 480, 262, 50);
		btnMostarCompras.setForeground(new Color(255, 255, 255));
		btnMostarCompras.setFont(new Font("SansSerif", Font.BOLD, 25));
		btnMostarCompras.setBackground(Color.BLACK);
		btnMostarCompras.addActionListener(this);
		containerPrincipal.add(btnMostarCompras);
		
		
		btnEliminar = new JButton("Limpiar");
		btnEliminar.setBounds(672, 480, 172, 50);
		btnEliminar.setForeground(new Color(255, 255, 255));
		btnEliminar.setFont(new Font("SansSerif", Font.BOLD, 25));
		btnEliminar.setBackground(Color.BLACK);
		btnEliminar.addActionListener(this);
		containerPrincipal.add(btnEliminar);
		
		
	}	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnComprar) {
			registrarCliente(misClientes);
			getData();	
		}
		if(e.getSource()==btnBuscar) {
			ConsultarCliente(misClientes);
		}
		if (e.getSource()==btnMostarCompras) {
			VentanaConsulta ventanaConsulta=new VentanaConsulta(this,true,misClientes);
			showData();
			
		}if (e.getSource()==btnEliminar) {
			cleanData();
		}
		
	}

	private void ConsultarCliente(Hashtable<String, Persona> misClientes) {
		String mensaje="DATOS DE LA PERSONA\n";
		String Codigo=JOptionPane.showInputDialog("Ingrese el codigo del producto");
		
		if(misClientes.containsKey(Codigo)==true) {
			Persona persona=misClientes.get(Codigo);
			mensaje+="Codigo: "+persona.getCodigo();
			mensaje+="Nombre: "+persona.getNombre();
			mensaje+="Apellido: "+persona.getApellido();
			
			JOptionPane.showMessageDialog(null, mensaje);
		}else {
			JOptionPane.showMessageDialog(null, "El codigo no existe!!!","ERROR",JOptionPane.ERROR_MESSAGE);
		}
	}

	private void registrarCliente(Hashtable<String, Persona> misClientes) {
		Persona miPersona=new Persona();
		miPersona.setCodigo(txtCodigo.getText());
		miPersona.setNombre(txtNombre.getText());
		miPersona.setApellido(txtApellido.getText());
		
		if (misClientes.containsKey(miPersona.getCodigo())==false) {
			misClientes.put(miPersona.getCodigo(),miPersona);
		System.out.println("Almacena");
		}else{
			JOptionPane.showMessageDialog(null, "El documento ya existe!!!","Advertencia",JOptionPane.WARNING_MESSAGE);
		}
	}

	private void cleanData() {
		txtNombre.setText("");
		txtApellido.setText("");
		txtCodigo.setText("");
		txtPrecio.setText("");
		txtProducto.setText("");
		txtCantidad.setText("");
		JOptionPane.showMessageDialog(null, "Campos limpiados correctamente", "Limpiar", JOptionPane.INFORMATION_MESSAGE);
		
	}

	private void getData() {
		Cliente = new Persona();
		misProductos = new Productos();
		
		try {
			if (txtNombre.getText().equals("") | txtApellido.getText().equals("")| txtCodigo.getText().equals("") | 
					txtPrecio.getText().equals("") |txtProducto.getText().equals("") | txtCantidad.getText().equals("")){
				JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
				
				
				misProductos.setPrecioProducto(Double.parseDouble(txtPrecio.getText()));
				misProductos.setCantidadProducto(Integer.parseInt(txtCantidad.getText()));
				misProductos.setCodigoProducto(txtCodigo.getText());
				Cliente.setNombre(txtNombre.getText());
				Cliente.setApellido(txtApellido.getText());
				miFactura.getDataWindow(Cliente, misProductos);
				miFactura.setVisible(true);
				misProcesos.guardarDatos(Cliente);
			}
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Has ingresado datos incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "ERROR", JOptionPane.ERROR_MESSAGE);

		}
		
	}
	
	
	private void showData() {
		if (misProcesos.getList().isEmpty()) {
			JOptionPane.showMessageDialog(null, "No hay compras registradas", "ERROR", JOptionPane.ERROR_MESSAGE);
		}else {
			WindowShowData myVent = new WindowShowData();
			myVent.setProcesos(misProcesos);
			myVent.fillTable();
			myVent.setVisible(true);
		}
		
	}
}


