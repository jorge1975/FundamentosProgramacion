package com.senati.windows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ejercicio001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Controles
		JFrame f = new JFrame("Ejercicio 01");
		JLabel lblUser, lblPassword;
		JTextField txtUser, txtPassword;
		JButton btnLogin;
		
		// Definicion
		lblUser = new JLabel("User name:");
		lblUser.setBounds(30, 30, 100, 30);
		lblPassword = new JLabel("Password:");
		lblPassword.setBounds(30, 60, 100, 30);
		txtUser = new JTextField("username");
		txtUser.setBounds(180, 30, 100, 30);
		txtPassword = new JPasswordField("0");
		txtPassword.setBounds(180, 60, 100, 30);
		btnLogin = new JButton("Login");
		btnLogin.setBounds(30,120,100,30);
		
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String usuario, clave;
				usuario = txtUser.getText();
				clave = txtPassword.getText();
				
				if (usuario.equals("jluque") && clave.equals("12345")) {
					System.out.println("Usuario correcto");
				}else {
					System.out.println("Usuario incorrecto");
				}
			}
			
		});
		// 
		f.add(lblUser);
		f.add(lblPassword);
		f.add(txtUser);
		f.add(txtPassword);
		f.setSize(350, 250);
		f.add(btnLogin);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
