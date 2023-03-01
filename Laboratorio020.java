package com.senati.windows;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Formulario de Registro");
		JLabel lblTitulo,lblCodigo,lblNombre,lblApellido,lblCorreo;
		JTextField txtCodigo,txtNombre,txtApellido,txtCorreo;
		JButton btnRegistrar, btnLimpiar, btnCerrar;
		
		lblTitulo = new JLabel("Registro");
		lblTitulo.setBounds(100,25,100,30);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(30,60,100,30);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(30,90,100,30);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(30,120,100,30);
		
		lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(30,150,100,30);
		
		txtCodigo = new JTextField("Codigo a registrar");
		txtCodigo.setBounds(100,60,100,30);
		
		txtNombre = new JTextField("Nombre a registrar");
		txtNombre.setBounds(100,90,150,30);
		
		txtApellido = new JTextField("Apellido a registrar");
		txtApellido.setBounds(100,120,150,30);
		
		txtCorreo = new JTextField("Correo a registrar");
		txtCorreo.setBounds(100,150,180,30);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(20,190,100,30);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(120,190,100,30);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(220,190,100,30);
		
		f.add(lblTitulo);
		f.add(lblCodigo);
		f.add(lblNombre);
		f.add(lblApellido);
		f.add(lblCorreo);
		f.add(txtCodigo);
		f.add(txtNombre);
		f.add(txtApellido);
		f.add(txtCorreo);
		f.add(btnRegistrar);
		f.add(btnLimpiar);
		f.add(btnCerrar);
		f.setSize(350, 300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
