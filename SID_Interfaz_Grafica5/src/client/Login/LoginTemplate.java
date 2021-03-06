package client.Login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.event.AncestorListener;

import App.services.ObjGraficosService;
import App.services.RecursosServices;

import javax.swing.BorderFactory;

public class LoginTemplate extends JFrame{

	//Declaracion objetos graficos
	
	private JPanel pIzquierda, pDerecha , pPantalla;
	private JLabel lTituloApp,lTituloApp2, lIdioma, lTituloLogin,lNotificaciones, lTituloFinal;
	private JLabel lCerrar,lLogo;
	private JTextField tNombreUsuario;
	private JPasswordField tClaveUsuario;
	private JComboBox cbTipoUsuario;
	private JButton bEntrar,bCerrar, bRegistrarse, bOlvido;
	private JCheckBox checkSi, checkNo;
	private ButtonGroup grupo;
	private JRadioButton rbOpcion1, rbOpcion2;
	private JTextArea taSugerencias;
	
	//Declaracion de objetos decoradores 
	
	
	private ImageIcon iCerrar,iDimAux,iLogo;
	
	//declaracion de servicios
	
	 private ObjGraficosService sObjGraficos;
	private RecursosServices sRecursos;
	private LoginComponent loginComponent;
	
	
	public LoginTemplate(LoginComponent loginComponent) {
		super ("Facebook.com");
		
		 
		 sObjGraficos = ObjGraficosService.getService();
		 sRecursos=RecursosServices.getService();
		 this.loginComponent =  loginComponent;
		 
		 this.crearObjetosDecoradores();
		    this.crearJPanels();
		    this.crearJTextFields();
		    this.crearJPasswordFields();
		    
		    this.crearJButtons();
		    
		    this.crearJLabels();
		   
		//atributos de la ventana
		    
		    setLayout(null);
		    setDefaultCloseOperation(EXIT_ON_CLOSE);
		    setSize(800, 500);
		    setLocationRelativeTo(this);
		    setUndecorated(true);
		    setLayout(null);
		    setVisible(true);
	
	}
		public void crearObjetosDecoradores(){
	
		iLogo = new ImageIcon("resources/images/iLogo.png");
	}
	public void crearJPanels(){
		pPantalla=sObjGraficos.construirJPanel(0,0, 800, 500, sRecursos.getColorpIzquierda(), null);
		this.add(pPantalla);
	
		pIzquierda=sObjGraficos.construirJPanel(0,0, 400, 500, sRecursos.getColorpIzquierda(), null);
		pPantalla.add(pIzquierda);
		
		pDerecha=sObjGraficos.construirJPanel(410,65, 350, 350, sRecursos.getColorGeneral(), sRecursos.getBorderbPrincipal());
		pPantalla.add(pDerecha);
		
	}
	
	public void crearJTextFields(){
		
		tNombreUsuario=sObjGraficos.construirJTextField("Correo electronico o número de teléfono", 
				(pDerecha.getWidth() - 310)/ 2, 50, 310, 40, sRecursos.getFontSubtitulo(),
				Color.WHITE, Color.GRAY, sRecursos.getColorPrincipal(), sRecursos.getBorderbInferior(), "c");
		
				pDerecha.add(tNombreUsuario);
		
			}
	public void crearJButtons(){
		
		 // BOTÓN ENTRAR-----------------------------------------------------------------------------
	    bEntrar = sObjGraficos.construirJButton(
			    "Entrar",(pDerecha.getWidth() - 310) / 2, 170 , 310, 40, sRecursos.getCMano(), null, sRecursos.getFontSubtitulo2(),
			    sRecursos.getColorPrincipal(), Color.WHITE, null, "c", true);
	    bEntrar.addActionListener(loginComponent);	  
	    pDerecha.add(bEntrar);
		
	    //BOTON CERRAR
	    iDimAux = new ImageIcon(
	    		sRecursos.getICerrar().getImage()
	    		 .getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)
	    		);
	    bCerrar = sObjGraficos.construirJButton(
	    		  null,  760, 1, 45, 30,  sRecursos.getCMano(),  iDimAux, 
	    		  null, null, null, null, "c", 	  false	);
	    		pPantalla.add(bCerrar);
	 
	   bCerrar.addActionListener(loginComponent);
	    bRegistrarse = sObjGraficos.construirJButton(
	    		"Crear cuenta nueva",(pDerecha.getWidth() - 180) / 2, 300 , 180, 35,  sRecursos.getCMano(), null, sRecursos.getFontSubtitulo2(),
	    				    sRecursos.getColorPrincipal2(), Color.WHITE, null, "c", true);
	    bRegistrarse.addActionListener(loginComponent);	  
	    		    pDerecha.add(bRegistrarse);
	   bOlvido=sObjGraficos.construirJButton("¿Has olvidado la contraseña?",(pDerecha.getWidth() - 230) / 2 ,
	    					230, 230, 20, sRecursos.getCMano(), null, sRecursos.getFontSubtitulo(), null, sRecursos.getColorPrincipal(), null, "c",false);
	    			bOlvido.addActionListener(loginComponent);  
	    			pDerecha.add(bOlvido);

	}
	public void crearJLabels(){
		iDimAux = new ImageIcon(
				iLogo.getImage()
				 .getScaledInstance(400, 150, Image.SCALE_AREA_AVERAGING)
				);
		
		lTituloApp=sObjGraficos.construirJLabel(null, 10, 110, 400,150, null, iDimAux, null, null, null, null, "c");
		pIzquierda.add(lTituloApp);
		
		
		lTituloApp2=sObjGraficos.construirJLabel("<html><p>Facebook te ayuda a comunicarte y</p> <p>compartir con las personas que </p> <p>forman parte de tu vida.</p></html>",
				45,190, 500, 180, null, null, sRecursos.getFontTitulo(), null, Color.black, null, "l");
		pIzquierda.add(lTituloApp2);
		
		
		lIdioma=sObjGraficos.construirJLabel("<html><center><b>Crea una página </b> para un personaje público, un grupo de música o un negocio.</center></html>",
				420, 430,330, 40, null, null, sRecursos.getFontSubtitulo(), null, Color.DARK_GRAY, null, "c");
		pPantalla.add(lIdioma);
	
		
		lTituloFinal=sObjGraficos.construirJLabel("______________________________________________", (pDerecha.getWidth() - 350) / 2, 255, 350, 20,
				null, null, null, null, sRecursos.getColorpIzquierda(), null,"c");
		pDerecha.add(lTituloFinal);
		
		/*
		lNotificaciones=sObjGraficos.construirJLabel("¿Has olvidado la contraseña?",(pDerecha.getWidth() - 230) / 2 ,
				230, 230, 20, sRecursos.getCMano(), null, sRecursos.getFontSubtitulo(), null, sRecursos.getColorPrincipal(), null, "c");
		//lNotificaciones.addAncestorListener((AncestorListener) loginComponent);	  
		pDerecha.add(lNotificaciones);
		*/
	}

	public void crearJPasswordFields(){
		tClaveUsuario=sObjGraficos.construirJPasswordField("Contraseña", (pDerecha.getWidth() -310) / 2, 110, 310, 40,
				sRecursos.getFontSubtitulo(),null, Color.DARK_GRAY, Color.BLUE,sRecursos.getBorderbInferior(), "c");
		pDerecha.add(tClaveUsuario);
		
	}
	
	public JButton getBRegistrarse() {
		return bRegistrarse;
	}
	public JButton getBCerrar() {
		return bCerrar;
	}
	public JTextField getTNombreUsuario() {
		return tNombreUsuario;
	}
	public JButton getBOlvido() {
		return bOlvido;
	}
	public JPasswordField getTClaveUsuario() {
		return tClaveUsuario;
	}

}