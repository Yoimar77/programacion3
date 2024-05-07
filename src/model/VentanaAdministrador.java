package model;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class VentanaAdministrador extends JFrame implements ActionListener{
	JButton btnGestorEnvio ,btnGestorProceso,btnCliente,btnPublicador;
	private JPanel contentPane;
	private JButton btnSalir;
	private JLabel lblNewLabel;
	public static String rol;
	public VentanaAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("BIENVENIDO");
		setResizable(false);
		setLocationRelativeTo(null);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("¿A QUIÉN QUIERES REGISTRAR?");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitulo.setBounds(138, 11, 178, 14);
		contentPane.add(lblTitulo);
		
		btnPublicador = new JButton("PUBLICADOR");
		btnPublicador.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPublicador.setBounds(124, 36, 190, 23);
		btnPublicador.setBackground(Color.GRAY);
		btnPublicador.addActionListener(this);
		contentPane.add(btnPublicador);
		
		btnCliente = new JButton("CLIENTE");
		btnCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCliente.setBounds(124, 85, 190, 23);
		btnCliente.setBackground(Color.GRAY);
		btnCliente.addActionListener(this);
		contentPane.add(btnCliente);
		
		btnGestorProceso = new JButton("GESTOR PROCESO");
		btnGestorProceso.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGestorProceso.setBounds(124, 142, 190, 23);
		btnGestorProceso.setBackground(Color.GRAY);
		btnGestorProceso.addActionListener(this);
		contentPane.add(btnGestorProceso);
		
		btnGestorEnvio = new JButton("GESTOR ENVÍO");
		btnGestorEnvio.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGestorEnvio.setBounds(124, 196, 185, 23);
		btnGestorEnvio.setBackground(Color.GRAY);
		btnGestorEnvio.addActionListener(this);
		contentPane.add(btnGestorEnvio);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.setBounds(0, 0, 89, 23);
		btnSalir.setBackground(Color.red);
		btnSalir.addActionListener(this);
		contentPane.add(btnSalir);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VentanaAdministrador.class.getResource("/img/fondoAzul.jpeg")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnPublicador==e.getSource()) {
			RegistroAdministracion registro = new RegistroAdministracion();
			registro.setVisible(true);
			setVisible(false);
		}
		if(btnCliente==e.getSource()) {
			rol ="cliente";
			RegistroAdministracion2 registro = new RegistroAdministracion2();
			registro.setVisible(true);
			setVisible(false);
		}
		if(btnGestorEnvio==e.getSource()) {
			rol ="gestorEnvio";
			RegistroAdministracion3 registro = new RegistroAdministracion3();
			registro.setVisible(true);
			setVisible(false);
		}
		if(btnGestorProceso==e.getSource()) {
			rol ="gestorProcesamiento";
			RegistroAdministracion4 registro = new RegistroAdministracion4();
			registro.setVisible(true);
			setVisible(false);
		}
		if(btnSalir==e.getSource()) {
			LoginAdministrador registro = new LoginAdministrador();
			registro.setVisible(true);
			setVisible(false);
		}
		
		
	}
	public static String getRol() {
		return rol;
	}
}
