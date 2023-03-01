package com.senati.windows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ejercicio002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Controles
			JFrame f = new JFrame("Ejercicio 02");
			JLabel lblNombre, lblApellido, lblCorreo, lblTelefono;
			JTextField txtNombre, txtApellido, txtCorreo, txtTelefono;
			JButton btnRegistro, btnLimpiar;
			DefaultListModel<String> l1 = new DefaultListModel<>();
			DefaultListModel<String> l2 = new DefaultListModel<>();
			DefaultListModel<String> l3 = new DefaultListModel<>();
			DefaultListModel<String> l4 = new DefaultListModel<>();
			
			l1.addElement("Nombre");
			l2.addElement("Apellido");
			l3.addElement("Correo");
			l4.addElement("Telefono");
			JList<String> lista1 = new JList<>(l1);
			JList<String> lista2 = new JList<>(l2);
			JList<String> lista3 = new JList<>(l3);
			JList<String> lista4 = new JList<>(l4);
			
			lista1.setBounds(30,230,100,100);
			lista2.setBounds(140,230,100,100);
			lista3.setBounds(250,230,100,100);
			lista4.setBounds(360,230,100,100);
			
			// Definicion
			lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(30, 30, 100, 30);
			lblApellido = new JLabel("Apellido:");
			lblApellido.setBounds(30, 60, 100, 30);
			lblCorreo = new JLabel("Correo:");
			lblCorreo.setBounds(30, 90, 100, 30);
			lblTelefono = new JLabel("Telefono:");
			lblTelefono.setBounds(30, 120, 100, 30);
			
			txtNombre = new JTextField("Nombre");
			txtNombre.setBounds(140, 30, 160, 30);
			txtApellido = new JTextField("Apellidos");
			txtApellido.setBounds(140, 60, 160, 30);
			txtCorreo = new JTextField("Correo");
			txtCorreo.setBounds(140, 90, 200, 30);
			txtTelefono = new JTextField("Telefono");
			txtTelefono.setBounds(140, 120, 200, 30);
			
			btnRegistro = new JButton("Registro");
			btnRegistro.setBounds(30,180,100,30);
			
			btnLimpiar = new JButton("Limpiar");
			btnLimpiar.setBounds(180,180,100,30);
			
			btnRegistro.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					l1.addElement(txtNombre.getText());
					l2.addElement(txtApellido.getText());
					l3.addElement(txtCorreo.getText());
					l4.addElement(txtTelefono.getText());
				}
				
			});
			
			f.add(lblNombre);
			f.add(lblApellido);
			f.add(lblCorreo);
			f.add(lblTelefono);
			f.add(txtNombre);
			f.add(txtApellido);
			f.add(txtCorreo);
			f.add(txtTelefono);
			f.add(btnRegistro);
			f.add(btnLimpiar);
			f.add(lista1);
			f.add(lista2);
			f.add(lista3);
			f.add(lista4);
			f.setSize(500, 400);
			
			f.setLayout(null);
			f.setVisible(true);
	}

}
