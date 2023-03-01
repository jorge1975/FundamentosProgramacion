package com.senati.windows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class Ejercicio006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Ejercicio 06");
		
		JTextField txtUser;
		JButton btnAgregar,btnEliminar;
		
		
		DefaultListModel<String> l1 = new DefaultListModel<>();
		l1.addElement("Nombre");
		JList<String> lista1 = new JList<>(l1);
		lista1.setBounds(130,30,100,100);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(30,180,90,30);
		
		txtUser = new JTextField("Usuario");
		txtUser.setBounds(130, 180, 160, 30);
				
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(300,180,100,30);
		
		btnAgregar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l1.addElement(txtUser.getText());
				txtUser.setText("");
			}
			
		});
		f.add(lista1);
		f.add(txtUser);
		f.add(btnAgregar);
		f.add(btnEliminar);
		f.setSize(450, 300);
		
		f.setLayout(null);
		f.setVisible(true);
	}

}
