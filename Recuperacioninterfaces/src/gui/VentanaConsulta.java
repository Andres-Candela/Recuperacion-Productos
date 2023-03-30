package gui;

import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import principal.Persona;

public class VentanaConsulta {
	

	private JScrollPane scrollArea;
	private JTextArea textArea;
	
	public VentanaConsulta(VentanaPrincipal ventanaPrincipal, boolean b, Hashtable<String, Persona> misClientes) {
		super(ventanaPrincipal, modal);
		initialize();
		setLocationRelativeTo(null);
	
		mostrarListaPersonas(misClientes);
	
}
	private void initialize() {
		setSize(300,208);
		getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 33, 264, 102);
		
		scrollArea = new JScrollPane();
		scrollArea.setBounds(10, 50, 264, 102);
		scrollArea.setViewportView(textArea);
		getContentPane().add(scrollArea);
		
		JLabel lblConsultaDePersonas = new JLabel("CONSULTA DE PERSONA");
		lblConsultaDePersonas.setBounds(10,11, 153, 23);
		getContentPane().add(lblConsultaDePersonas);
	}
	private void mostrarListaPersonas(Hashtable<String, Persona> misClientes) {
	String mensaje="";
	
	Enumeration<Persona> elemento=misClientes.elements();
	while (elemento.hasMoreElements()) {
		Persona persona = elemento.nextElement();
		mensaje+="Cogido: "+persona.getCodigo()+"\n   Nombre: "+persona.getNombre()+"\n";
		mensaje+="Apellido: "+persona.getApellido()+"\n";
	}
	textArea.setText(mensaje);
	
	}
}
