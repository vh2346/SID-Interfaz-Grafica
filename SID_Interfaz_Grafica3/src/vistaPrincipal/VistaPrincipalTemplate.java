package vistaPrincipal;

import java.awt.Button;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/*Hanna Villamil */
// hereda la ventana para propiedades graficas
//Definicion Clase
public class VistaPrincipalTemplate extends JFrame {
	//Atributos
	//crear button
	private JButton bEntrar;
	private JTextField tNombre;
	private JLabel lNombre;
	//constructor
		public  VistaPrincipalTemplate () {
		//titulo
		super("Vista Principal");
		this.saludar();
		//cerrar ventana
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//tamaño
		this.setSize(1200, 700);
		//ubicacion central
		this.setLocationRelativeTo(null);
		//barra de navegacion quitar
		//this.setUndecorated(false);
		//color
		this.getContentPane().setBackground(Color.BLUE);
		//posicionar elementos de ventana manual
		this.setLayout(null);
		//visible
		this.setVisible(true);
	}
	//metodo
	public void saludar() {
		String mensaje = "Hola mundo";
		System.out.println(mensaje);
	}
}
