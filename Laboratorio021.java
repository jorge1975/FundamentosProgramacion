package com.senati.windows;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Formulario de Registro");
		JLabel lblTitulo,lblCodigo,lblNombre,lblApellido,lblCorreo,lblMensaje,lblEspecialidad;
		JTextField txtCodigo,txtNombre,txtApellido,txtCorreo;
		JButton btnRegistrar, btnLimpiar, btnCerrar;
		JTextArea txtMMensaje;
		JCheckBox chkPromociones;
		JComboBox cboEspecialidad;
		String especialidad[]={"Desarrollo","Diseño","Analisis","Documentacion"};

		
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
		
		lblMensaje = new JLabel("Mensaje");
		lblMensaje.setBounds(30,180,100,30);
		
		lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setBounds(30,320,100,30);
		
		txtCodigo = new JTextField("Codigo a registrar");
		txtCodigo.setBounds(100,60,100,30);
		
		txtNombre = new JTextField("Nombre a registrar");
		txtNombre.setBounds(100,90,150,30);
		
		txtApellido = new JTextField("Apellido a registrar");
		txtApellido.setBounds(100,120,150,30);
		
		txtCorreo = new JTextField("Correo a registrar");
		txtCorreo.setBounds(100,150,180,30);
		
		txtMMensaje=new JTextArea("Indicar el mensaje o solicitud");
		txtMMensaje.setBounds(100,190, 180,100);
		
		chkPromociones = new JCheckBox("Desea promociones al correo");
		chkPromociones.setBounds(30,290, 200,30);
		
		cboEspecialidad=new JComboBox(especialidad);
		cboEspecialidad.setBounds(140, 320,140,30);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(20,400,100,30);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(120,400,100,30);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(220,400,100,30);
					
		f.add(lblTitulo);
		f.add(lblCodigo);
		f.add(lblNombre);
		f.add(lblApellido);
		f.add(lblCorreo);
		f.add(lblMensaje);
		f.add(lblEspecialidad);
		f.add(txtCodigo);
		f.add(txtNombre);
		f.add(txtApellido);
		f.add(txtCorreo);
		f.add(txtMMensaje);
		f.add(chkPromociones);
		f.add(cboEspecialidad);
		f.add(btnRegistrar);
		f.add(btnLimpiar);
		f.add(btnCerrar);
		f.setSize(350, 500);
		f.setLayout(null);
		f.setVisible(true);
	}

}
