package client.vistaPrincipal;

import java.awt.Button;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import App.services.ObjGraficosService;
import App.services.RecursosServices;
/*Hanna Villamil */
// hereda la ventana para propiedades graficas
//Definicion Clase
public class VistaPrincipalTemplate extends JFrame {
	//Atributos
	//crear button
	
	private ObjGraficosService sObjGraficosService;
	private RecursosServices sRecursosServices;
	private JPanel pNavegacion, pBarra, pPrincipal,pChat;
	
	private VistaPrincipalComponent vpComponent;
	
	//constructor
		public  VistaPrincipalTemplate (VistaPrincipalComponent vpComponent) {
		//titulo
		
		
		
		
		sObjGraficosService = ObjGraficosService.getService();
		sRecursosServices=RecursosServices.getService();
		this.vpComponent=vpComponent;
		this.vpComponent.getClass();
		
				crearJPanels();
		//cerrar ventana
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//tamaño
		this.setSize(1100, 650);
		//ubicacion central
		this.setLocationRelativeTo(this);
		//barra de navegacion quitar
		this.setUndecorated(true);
		//color
		//this.getContentPane().setBackground(sRecursosServices.getColorGeneral());
		//posicionar elementos de ventana manual
		this.setLayout(null);
		//visible
		this.setVisible(true);
	}
		public void crearJPanels() {
			pNavegacion = sObjGraficosService.construirJPanel(0, 56, 280, 700, sRecursosServices.getColorpIzquierda(), null);
			this.add(pNavegacion);

			pBarra = sObjGraficosService.construirJPanel(0, 0, 1100, 56, Color.WHITE, null);
			this.add(pBarra);

			pPrincipal = sObjGraficosService.construirJPanel(280, 56, 540, 600, Color.white, null);
			this.add(pPrincipal);
			
			pChat = sObjGraficosService.construirJPanel(820, 56, 280, 700, sRecursosServices.getColorpIzquierda(), null);
			this.add(pChat);
			
		}

		public JPanel getPNavegacion() { return this.pNavegacion; }

		public JPanel getPPrincipal() { return this.pPrincipal; }

		public JPanel getPBarra() { return this.pBarra; }
}
