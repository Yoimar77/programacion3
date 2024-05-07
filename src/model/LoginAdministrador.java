package model;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ingreso.VerificarIngreso;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class LoginAdministrador extends JFrame implements ActionListener{
	JButton btnIngresarAdministrador,btnAtrasAdministrador;
	
	private JPanel contentPane;
	public static JTextField textFieldUsuarioAdministrador;
	public static JTextField textFieldContraseñaAdministrador;

	public LoginAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("ADMINISTRADOR");
		setResizable(false);
		setLocationRelativeTo(null);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloAdministrador = new JLabel("LOGIN ADMINISTRADOR");
		lblTituloAdministrador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTituloAdministrador.setBounds(165, 37, 148, 14);
		contentPane.add(lblTituloAdministrador);
		
		JLabel lblUsuarioAdministrador = new JLabel("USUARIO");
		lblUsuarioAdministrador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsuarioAdministrador.setBounds(132, 91, 84, 14);
		contentPane.add(lblUsuarioAdministrador);
		
		JLabel lblContrasea = new JLabel("CONTRASEÑA");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContrasea.setBounds(132, 152, 84, 14);
		contentPane.add(lblContrasea);
		
		textFieldUsuarioAdministrador = new JTextField();
		textFieldUsuarioAdministrador.setBounds(224, 88, 186, 20);
		contentPane.add(textFieldUsuarioAdministrador);
		textFieldUsuarioAdministrador.setColumns(10);
		
		textFieldContraseñaAdministrador = new JTextField();
		textFieldContraseñaAdministrador.setColumns(10);
		textFieldContraseñaAdministrador.setBounds(224, 149, 186, 20);
		contentPane.add(textFieldContraseñaAdministrador);
		
		btnAtrasAdministrador = new JButton("ATRAS");
		btnAtrasAdministrador.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAtrasAdministrador.setBounds(0, 0, 89, 23);
		btnAtrasAdministrador.setBackground(Color.red);
		btnAtrasAdministrador.addActionListener(this);
		contentPane.add(btnAtrasAdministrador);
		
		btnIngresarAdministrador = new JButton("INGRESAR");
		btnIngresarAdministrador.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnIngresarAdministrador.setBounds(181, 214, 105, 23);
		btnIngresarAdministrador.setBackground(Color.green);
		btnIngresarAdministrador.addActionListener(this);
		contentPane.add(btnIngresarAdministrador);
		
		JLabel lblLlave = new JLabel("");
		lblLlave.setIcon(new ImageIcon(LoginAdministrador.class.getResource("/img/llave.jpg")));
		lblLlave.setBounds(-115, 0, 342, 261);
		contentPane.add(lblLlave);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnIngresarAdministrador==e.getSource()) {
			VerificarIngreso ingreso = new VerificarIngreso();
			VentanaAdministrador administrador = new VentanaAdministrador();
			if(ingreso.verificarDatosAdministrador()) {
				administrador.setVisible(true);
				setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(null,"Su usuario o contraseña son incorrectos");
			}
		}
		if(btnAtrasAdministrador==e.getSource()) {
			VentanaInicial ventanaInicial = new VentanaInicial();
			ventanaInicial.setVisible(true);
			setVisible(false);
		}
		
	}
}
