package gui;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import operacion.Procesos;
import principal.Persona;

public class WindowShowData extends JFrame {
	private JPanel showData;
	private JTable tablaClientes;
	Procesos miProcesos;
	DefaultTableModel modelo;
		
	public WindowShowData() {
		startComponents();
		setTitle("SISTEMA DE COMPRAS");
		setSize(754, 500);
		setLocationRelativeTo(null);
	}
		
	public void startComponents() {
		showData = new JPanel();
		showData.setBorder(new EmptyBorder(5, 5, 5, 5));
		showData.setLayout(null);
			
		JLabel lblDatos = new JLabel("INGRESO DE DATOS");
		lblDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatos.setFont(new Font("SansSerif", Font.BOLD, 50));
		lblDatos.setBounds(0, 0, 740, 99);
		showData.add(lblDatos);
			
		setContentPane(showData);
			
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 110, 686, 353);
		showData.add(scrollPane);
			
		tablaClientes = new JTable();
			
		modelo = new DefaultTableModel();
		tablaClientes.setModel(modelo);
			
			modelo.addColumn("Nombre");
			modelo.addColumn("Apellido");
			modelo.addColumn("Codigo");
			modelo.addColumn("Precio");
			modelo.addColumn("Cantidad");
				
			scrollPane.setViewportView(tablaClientes);
			
	}

	public void setProcesos(Procesos miProcesos) {
		this.miProcesos = miProcesos;
	}

	public void fillTable() {
		ArrayList<Persona>listaCliente = miProcesos.getList();
		
		for (Persona persona : listaCliente) {
			Object[] fila = new Object[2];
			fila[0] = persona.getNombre();
			fila[1] = persona.getApellido();
			
			modelo.addRow(fila);
		
		}
	}
}
