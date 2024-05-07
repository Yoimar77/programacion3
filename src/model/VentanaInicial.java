package model;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class VentanaInicial extends JFrame implements ActionListener {

    private JPanel contentPane;
    JButton btnSalir;
    JButton btnGestorAdministrativo;
    JButton btnGestorEnvio;
    JButton btnCliente;
    JButton btnPublicador;
    JButton btnAdministrador;
    JButton btnEs;
    JButton btnEn;
    JButton btnFr;
    String idioma;
    ResourceBundle bundle;

    public VentanaInicial() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setTitle("GDUQ");
        setResizable(false);
        setLocationRelativeTo(null);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Declarar e inicializar el ResourceBundle
        idioma = "es"; // Idioma predeterminado
        bundle = ResourceBundle.getBundle("messages_" + idioma);

        btnAdministrador = new JButton(bundle.getString("ADMINISTRADOR"));
        btnAdministrador.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnAdministrador.setBounds(232, 22, 179, 23);
        btnAdministrador.setBackground(Color.white);
        btnAdministrador.addActionListener(this);
        contentPane.add(btnAdministrador);

        btnPublicador = new JButton(bundle.getString("PUBLICADOR"));
        btnPublicador.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnPublicador.setBounds(232, 70, 179, 23);
        btnPublicador.setBackground(Color.white);
        btnPublicador.addActionListener(this);
        contentPane.add(btnPublicador);

        btnCliente = new JButton(bundle.getString("CLIENTE"));
        btnCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnCliente.setBounds(232, 117, 179, 23);
        btnCliente.setBackground(Color.white);
        btnCliente.addActionListener(this);
        contentPane.add(btnCliente);

        btnGestorEnvio = new JButton("GESTOR ENVIO");
        btnGestorEnvio.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnGestorEnvio.setBounds(232, 166, 179, 23);
        btnGestorEnvio.addActionListener(this);
        btnGestorEnvio.setBackground(Color.white);
        contentPane.add(btnGestorEnvio);

        btnGestorAdministrativo = new JButton("GESTOR ADMINISTRATIVO");
        btnGestorAdministrativo.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnGestorAdministrativo.setBounds(232, 213, 179, 23);
        btnGestorAdministrativo.addActionListener(this);
        btnGestorAdministrativo.setBackground(Color.white);
        contentPane.add(btnGestorAdministrativo);

        btnSalir = new JButton(bundle.getString("SALIR"));
        btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnSalir.setBounds(0, -2, 89, 23);
        btnSalir.setBackground(Color.red);
        btnSalir.addActionListener(this);
        contentPane.add(btnSalir);

        btnEs = new JButton("es");
        btnEs.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnEs.setBounds(0, 45, 67, 36);
        btnEs.addActionListener(this);
        btnEs.setBackground(Color.white);
        contentPane.add(btnEs);

        btnEn = new JButton("en");
        btnEn.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnEn.setBounds(0, 127, 67, 36);
        btnEn.addActionListener(this);
        btnEn.setBackground(Color.white);
        contentPane.add(btnEn);

        btnFr = new JButton("fr");
        btnFr.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnFr.setBounds(0, 221, 67, 36);
        btnFr.addActionListener(this);
        btnFr.setBackground(Color.white);
        contentPane.add(btnFr);

        // todas las Imágenes de esta ventana
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(VentanaInicial.class.getResource("/img/francia.png")));
        lblNewLabel_2.setBounds(94, 186, 111, 71);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_1_1 = new JLabel("");
        lblNewLabel_1_1.setIcon(new ImageIcon(VentanaInicial.class.getResource("/img/español.jpg")));
        lblNewLabel_1_1.setBounds(94, 22, 145, 71);
        contentPane.add(lblNewLabel_1_1);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(VentanaInicial.class.getResource("/img/ingles.jpg")));
        lblNewLabel.setBounds(98, 104, 100, 72);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(VentanaInicial.class.getResource("/img/inicio.jpeg")));
        lblNewLabel_1.setBounds(-23, -2, 457, 259);
        contentPane.add(lblNewLabel_1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(btnSalir==e.getSource()) {
            System.exit(0);
        }
        if(btnAdministrador==e.getSource()) {
            LoginAdministrador login = new LoginAdministrador();
            login.setVisible(true);
            setVisible(false);
        }
        if(btnCliente==e.getSource()) {

        }
        if(btnGestorAdministrativo==e.getSource()) {

        }
        if(btnGestorEnvio==e.getSource()) {

        }
        if(btnPublicador==e.getSource()) {

        }
        if(btnEn==e.getSource()) {
            idioma = "en";
            btnEn.setBackground(Color.green);
            btnEs.setBackground(Color.white);
            btnFr.setBackground(Color.white);
        }
        if(btnEs==e.getSource()) {
            idioma = "es";
            btnEs.setBackground(Color.green);
            btnEn.setBackground(Color.white);
            btnFr.setBackground(Color.white);
        }
        if(btnFr==e.getSource()) {
            idioma = "fr";
            btnFr.setBackground(Color.green);
            btnEs.setBackground(Color.white);
            btnEn.setBackground(Color.white);
        }
        // Actualizar el ResourceBundle después de cambiar el idioma
        bundle = ResourceBundle.getBundle("messages_" + idioma);

        // Actualizar los textos de los botones 
        btnAdministrador.setText(bundle.getString("ADMINISTRADOR"));
        btnPublicador.setText(bundle.getString("PUBLICADOR"));
        btnCliente.setText(bundle.getString("CLIENTE"));
        btnSalir.setText(bundle.getString("SALIR"));

    }
}
