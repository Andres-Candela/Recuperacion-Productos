package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import operation.Process;
import principal.Person;
import principal.Product;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.sound.midi.MidiDevice.Info;
import javax.swing.ButtonGroup;
import javax.swing.JButton;



public class WindowPrincipal extends JFrame implements ActionListener {

	WindowVoice myInvoice;
	ButtonGroup groupRadios;
	private JPanel containerPrincipal;
	private JTextField txtName, txtLastName, txtAge, txtCellphone, txtProduct, txtPrice, txtQuantity;
	private JRadioButton rdA, rdB, rdC, rdNoAplica;
	private JButton btnBuy, btnShowData, btnClean;
	Process myProcess;
	Product myProduct;
	Person client;

	public WindowPrincipal() {
		myProcess = new Process();
		startComponents();
		setTitle("SISTEMA DON APARATO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(890, 600);
		setLocationRelativeTo(null);
	}
	
	public void startComponents() {
		
		
		groupRadios = new ButtonGroup();
		
		containerPrincipal = new JPanel();
		containerPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		containerPrincipal.setLayout(null);
		
		JLabel lblTitle = new JLabel("SISTEMA DE COMPRAS");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("SansSerif", Font.BOLD, 50));
		lblTitle.setBounds(0, 0, 876, 100);
		containerPrincipal.add(lblTitle);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(0, 111, 876, 14);
		containerPrincipal.add(separator);
		
		getContentPane().add(containerPrincipal);
		
		JLabel lblSubTitle = new JLabel("REGISTRO");
		lblSubTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTitle.setFont(new Font("SansSerif", Font.PLAIN, 35));
		lblSubTitle.setBounds(311, 121, 228, 53);
		containerPrincipal.add(lblSubTitle);
		
		JLabel lblName = new JLabel("Nombre:");
		lblName.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(34, 208, 116, 40);
		containerPrincipal.add(lblName);
		
		txtName = new JTextField();
		txtName.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtName.setBounds(143, 212, 147, 34);
		containerPrincipal.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Apellido:");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblLastName.setBounds(329, 207, 116, 40);
		containerPrincipal.add(lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtLastName.setColumns(10);
		txtLastName.setBounds(438, 212, 147, 34);
		containerPrincipal.add(txtLastName);
		
		JLabel lblAge = new JLabel("Edad:");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblAge.setBounds(634, 208, 116, 40);
		containerPrincipal.add(lblAge);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtAge.setColumns(10);
		txtAge.setBounds(731, 212, 92, 34);
		containerPrincipal.add(txtAge);
		
		JLabel lblCellphone = new JLabel("Telefono:");
		lblCellphone.setHorizontalAlignment(SwingConstants.CENTER);
		lblCellphone.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblCellphone.setBounds(34, 283, 116, 40);
		containerPrincipal.add(lblCellphone);
		
		txtCellphone = new JTextField();
		txtCellphone.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtCellphone.setColumns(10);
		txtCellphone.setBounds(154, 287, 147, 34);
		containerPrincipal.add(txtCellphone);
		
		JLabel lblTipe = new JLabel("Tipo:");
		lblTipe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipe.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblTipe.setBounds(329, 283, 116, 40);
		containerPrincipal.add(lblTipe);
		
		rdA = new JRadioButton("A");
		rdA.setHorizontalAlignment(SwingConstants.LEFT);
		rdA.setFont(new Font("SansSerif", Font.BOLD, 20));
		rdA.setBounds(450, 283, 54, 36);
		groupRadios.add(rdA);
		containerPrincipal.add(rdA);
		
		rdB = new JRadioButton("B");
		rdB.setFont(new Font("SansSerif", Font.BOLD, 20));
		rdB.setBounds(520, 283, 54, 36);
		groupRadios.add(rdB);
		containerPrincipal.add(rdB);
		
		rdC = new JRadioButton("C");
		rdC.setFont(new Font("SansSerif", Font.BOLD, 20));
		rdC.setBounds(590, 283, 54, 36);
		groupRadios.add(rdC);
		containerPrincipal.add(rdC);
		
		rdNoAplica = new JRadioButton("No Aplica");
		rdNoAplica.setFont(new Font("SansSerif", Font.BOLD, 20));
		rdNoAplica.setBounds(660, 283, 144, 36);
		groupRadios.add(rdNoAplica);
		containerPrincipal.add(rdNoAplica);
	
		JLabel lblProducto = new JLabel("Producto:");
		lblProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblProducto.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblProducto.setBounds(34, 364, 116, 40);
		containerPrincipal.add(lblProducto);
		
		txtProduct = new JTextField();
		txtProduct.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtProduct.setColumns(10);
		txtProduct.setBounds(154, 368, 147, 34);
		containerPrincipal.add(txtProduct);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblPrecio.setBounds(329, 364, 116, 40);
		containerPrincipal.add(lblPrecio);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtPrice.setColumns(10);
		txtPrice.setBounds(449, 368, 147, 34);
		containerPrincipal.add(txtPrice);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblCantidad.setBounds(622, 364, 116, 40);
		containerPrincipal.add(lblCantidad);
		
		txtQuantity = new JTextField();
		txtQuantity.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtQuantity.setColumns(10);
		txtQuantity.setBounds(731, 368, 92, 34);
		containerPrincipal.add(txtQuantity);
		
		btnBuy = new JButton("Comprar");
		btnBuy.setForeground(new Color(255, 255, 255));
		btnBuy.setBackground(new Color(0, 0, 0));
		btnBuy.setFont(new Font("SansSerif", Font.BOLD, 25));
		btnBuy.setBounds(48, 480, 200, 50);
		btnBuy.addActionListener(this);
		containerPrincipal.add(btnBuy);
		
		btnShowData = new JButton("Mostrar Datos");
		btnShowData.setForeground(new Color(255, 255, 255));
		btnShowData.setFont(new Font("SansSerif", Font.BOLD, 25));
		btnShowData.setBackground(Color.BLACK);
		btnShowData.setBounds(311, 480, 246, 50);
		btnShowData.addActionListener(this);
		containerPrincipal.add(btnShowData);
		
		btnClean = new JButton("Limpiar");
		btnClean.setForeground(new Color(255, 255, 255));
		btnClean.setFont(new Font("SansSerif", Font.BOLD, 25));
		btnClean.setBackground(Color.BLACK);
		btnClean.setBounds(623, 480, 200, 50);
		btnClean.addActionListener(this);
		containerPrincipal.add(btnClean);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnBuy) {
			getData();
			
		}if (e.getSource()==btnShowData) {
			showData(); 
			
		}if (e.getSource()==btnClean) {
			cleanData();
		}
	
		
	}

	private void cleanData() {
		txtName.setText("");
		txtLastName.setText("");
		txtCellphone.setText("");
		txtAge.setText("");
		txtPrice.setText("");
		txtProduct.setText("");
		txtQuantity.setText("");
		groupRadios.clearSelection();
		JOptionPane.showMessageDialog(null, "Campos limpiados correctamente", "Limpiar", JOptionPane.INFORMATION_MESSAGE);
	}

	private void getData() {
		client = new Person();
		myProduct = new Product();
		
		try {
			if (txtName.getText().equals("") | txtLastName.getText().equals("")| txtCellphone.getText().equals("") | 
					txtAge.getText().equals("") | txtCellphone.getText().equals("") | txtPrice.getText().equals("") |
					txtProduct.getText().equals("") | txtQuantity.getText().equals("")){
				JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
				
			}else if (!rdA.isSelected() && !rdB.isSelected()
					&& !rdC.isSelected() && !rdNoAplica.isSelected()) {
				JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			else {
				myInvoice = new WindowVoice();
				
				if (rdA.isSelected()) {
					client.setTypeUser("A");
				}else if (rdB.isSelected()) {
					client.setTypeUser("B");
				}else if (rdC.isSelected()) {
					client.setTypeUser("C");
				}else {
					client.setTypeUser("No Aplica");
				}
				
				myProduct.setPriceProduct(Double.parseDouble(txtPrice.getText()));
				myProduct.setQuantityProduct(Integer.parseInt(txtQuantity.getText()));
				client.setName(txtName.getText());
				client.setLastName(txtLastName.getText());
				client.setAge(Integer.parseInt(txtAge.getText()));
				client.setCellphone(txtCellphone.getText());
				myInvoice.getDataWindow(client, myProduct);
				myInvoice.setVisible(true);
				myProcess.saveData(client);
			}
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Has ingresado datos incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "ERROR", JOptionPane.ERROR_MESSAGE);

		}
		
	}
	
	private void showData() {
		if (myProcess.getList().isEmpty()) {
			JOptionPane.showMessageDialog(null, "No hay compras registradas", "ERROR", JOptionPane.ERROR_MESSAGE);
		}else {
			WindowShowData myVent = new WindowShowData();
			myVent.setProcess(myProcess);
			myVent.fillTable();
			myVent.setVisible(true);
		}
	}
}
