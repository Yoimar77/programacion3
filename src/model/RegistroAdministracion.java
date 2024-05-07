package model;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesPrincipales.Administrador;
import ingreso.DividirNombre;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class RegistroAdministracion extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textFieldNombreCompleto;
	private JTextField textFieldTelefono;
	private JTextField textFieldId;
	private JButton btnRegistrar;
	private JButton btnAtras;
	private JLabel lblNewLabel_2;

	public RegistroAdministracion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("PUBLICADOR");
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PLANTILLA REGISTRO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(150, 11, 134, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("REVISTA:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 39, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("TELEFONO:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 82, 134, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("NUMERO DE D.I O DNI:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(10, 124, 134, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textFieldNombreCompleto = new JTextField();
		textFieldNombreCompleto.setBounds(89, 36, 172, 20);
		contentPane.add(textFieldNombreCompleto);
		textFieldNombreCompleto.setColumns(10);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setColumns(10);
		textFieldTelefono.setBounds(89, 79, 215, 20);
		contentPane.add(textFieldTelefono);
		
		textFieldId = new JTextField();
		textFieldId.setColumns(10);
		textFieldId.setBounds(150, 121, 215, 20);
		contentPane.add(textFieldId);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBounds(163, 189, 109, 23);
		btnRegistrar.setBackground(Color.yellow);
		btnRegistrar.addActionListener(this);
		contentPane.add(btnRegistrar);
		
		btnAtras = new JButton("ATRAS");
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAtras.setBounds(0, 0, 89, 23);
		btnAtras.setBackground(Color.red);
		btnAtras.addActionListener(this);
		contentPane.add(btnAtras);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(RegistroAdministracion.class.getResource("/img/fondoVerde.jpeg")));
		lblNewLabel_2.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_2);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
			if(btnRegistrar==e.getSource()) {
		
				DividirNombre div = new DividirNombre();
				Administrador admin = new Administrador();
				
				String nombreCompleto=textFieldNombreCompleto.getText();
				String id=textFieldId.getText();
				String telefono=textFieldTelefono.getText();
				String []nombrePartes = div.dividirNombre(nombreCompleto);
				String nombre=nombrePartes[0];
				String apellido=nombrePartes[1];
				boolean registro = admin.registrarPersona(nombre, id,apellido,telefono,"publicador");
				admin.crearCarpeta("publicadores",nombreCompleto,registro);

			}
		if (btnAtras==e.getSource()) {
			VentanaAdministrador admin = new VentanaAdministrador();
			admin.setVisible(true);
			setVisible(false);
			}
		
		}
}