package com.senati.windows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Prueba01 {
	// Seccion de varibles globales

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Formulario de Registro");
		JButton btnPrueba;
		JButton btnCalcular;
		JLabel lblNro1,lblNro2,lblSuma,lblResta,lblProducto,lblDivision;
		JTextField txtNro1,txtNro2,txtS,txtR,txtP,txtD;
		
		
		lblNro1 = new JLabel("Ingrese primer número: ");
		lblNro1.setBounds(30,60,150,30);
		lblNro2 = new JLabel("Ingrese segundo número: ");
		lblNro2.setBounds(30,90,150,30);
		lblSuma = new JLabel("Suma: ");
		lblSuma.setBounds(30,120,150,30);
		lblResta = new JLabel("Resta: ");
		lblResta.setBounds(30,150,150,30);
		lblProducto = new JLabel("Producto: ");
		lblProducto.setBounds(30,180,150,30);
		lblDivision = new JLabel("División: ");
		lblDivision.setBounds(30,210,150,30);
		
		txtNro1 = new JTextField("0");
		txtNro1.setBounds(200,60,100,30);		
		txtNro2= new JTextField("0");
		txtNro2.setBounds(200,90,100,30);
		txtS= new JTextField("0");
		txtS.setBounds(200,120,100,30);
		txtR= new JTextField("0");
		txtR.setBounds(200,150,100,30);
		txtP= new JTextField("0");
		txtP.setBounds(200,180,100,30);
		txtD= new JTextField("0");
		txtD.setBounds(200,210,100,30);
		
		btnPrueba = new JButton("Finalizar");
		btnPrueba.setBounds(200,400,100,30);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(20,400,100,30);
		f.add(lblNro1);
		f.add(lblNro2);
		f.add(lblSuma);
		f.add(lblResta);
		f.add(txtNro1);
		f.add(txtNro2);
		f.add(txtS);
		f.add(txtR);
		f.add(txtP);
		f.add(txtD);
		f.add(lblProducto);
		f.add(lblDivision);
		
		f.add(btnPrueba);
		f.add(btnCalcular);
		
		btnPrueba.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a,b,s,r,p,d;
				a = Integer.parseInt(txtNro1.getText());
				b = Integer.parseInt(txtNro2.getText());
				s = a+b; 
				r = a-b;
				p = a*b;
				d = a/b;
				txtS.setText(""+s);
				txtR.setText(""+r);
				txtP.setText(""+p);
				txtD.setText(""+d);
			}
			
		});
		
		f.setSize(350, 500);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
