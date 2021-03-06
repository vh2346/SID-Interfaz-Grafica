package Login;

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
import javax.swing.BorderFactory;

public class LoginTemplate extends JFrame{

	//Declaracion objetos graficos
	
	private JPanel pIzquierda, pDerecha , pPantalla;
	private JLabel lTituloApp,lTituloApp2, lIdioma, lTituloLogin,lNotificaciones, lTituloFinal;
	private JLabel lCerrar,lLogo;
	private JTextField tNombreUsuario;
	private JPasswordField tClaveUsuario;
	private JComboBox cbTipoUsuario;
	private JButton bEntrar,bCerrar, bRegistrarse, bOpcion1, bOpcion2, bOpcion3;
	private JCheckBox checkSi, checkNo;
	private ButtonGroup grupo;
	private JRadioButton rbOpcion1, rbOpcion2;
	private JTextArea taSugerencias;
	
	//Declaracion de objetos decoradores 
	
	private Color colorpArriba, colorPrincipal, colorPrincipal2,colorGeneral;
	private Font fontPrincipal, fontTitulo, fontSubtitulo,fontSubtitulo2;
	private Cursor cMano;
	private Border bPrincipal,bInferior;
	private ImageIcon iCerrar,iDimAux,iLogo;
	
	public LoginTemplate() {
		
		super ("Facebook.com");
		generarFuentes();
		colorGeneral= new Color(255,255,255);
		colorpArriba = new Color(240,242,245);
		colorPrincipal = new Color(24,119,242);
		colorPrincipal2 = new Color (66,183,42);
		fontPrincipal =new Font("Klavika-Bold",Font.BOLD ,75);
		fontTitulo =new Font("Klavika",Font.PLAIN ,22);
		fontSubtitulo =new Font("Klavika",Font.PLAIN ,15);
		fontSubtitulo2 =new Font("Klavika",Font.BOLD ,15);
		cMano = new Cursor(Cursor.HAND_CURSOR);
		bPrincipal = BorderFactory.createRaisedBevelBorder();
		bInferior= BorderFactory.createLineBorder(colorpArriba,2,true);
		iCerrar = new ImageIcon ("resources/images/iCerrar.png");
		iLogo = new ImageIcon("resources/images/iLogo.png");
		
		pPantalla=new JPanel();
		pPantalla.setSize(800, 500);
		pPantalla.setLocation(0,0);
		//posicion manual
		pPantalla.setBackground(colorpArriba);
		pPantalla.setLayout(null);
		this.add(pPantalla);				;
		//atributos panel
		
		pIzquierda = new JPanel();
		pIzquierda.setSize(400, 500);
		pIzquierda.setLocation(0,0);
		//posicion manual
		
		pIzquierda.setBackground(colorpArriba);
		pIzquierda.setLayout(null);
		pPantalla.add(pIzquierda);
		
		
				
		pDerecha = new JPanel();
		pDerecha.setSize(350, 350);
		pDerecha.setLocation(410,65);
		pDerecha.setBorder(bPrincipal);
		pDerecha.setBackground(colorGeneral);
		pDerecha.setLayout(null);
		pPantalla.add(pDerecha);
		
		iDimAux = new ImageIcon(
				iLogo.getImage()
				 .getScaledInstance(400, 150, Image.SCALE_AREA_AVERAGING)
				);
		lTituloApp = new JLabel();
		lTituloApp.setBounds(10, 110, 400, 150);
		lTituloApp.setIcon(iDimAux);
		
	
		pIzquierda.add(lTituloApp);
		
		
		lTituloApp2 = new JLabel("<html><p>Facebook te ayuda a comunicarte y</p> <p>compartir con las personas que </p> <p>forman parte de tu vida.</p></html>");
		lTituloApp2.setBounds(45, 190, 500, 180);
		lTituloApp2.setFont(fontTitulo);
		lTituloApp2.setForeground(Color.black);
		pIzquierda.add(lTituloApp2);
		
		lIdioma = new JLabel("<html><center><b>Crea una página </b> para un personaje público, un grupo de música o un negocio.</center></html>");
		
		lIdioma.setBounds(420,430, 330, 40);
		lIdioma.setFont(fontSubtitulo);
		//lIdioma.setLocation((pAbajo.getWidth() -lIdioma.getWidth())/2,480);
		lIdioma.setForeground(Color.DARK_GRAY);
		lIdioma.setHorizontalAlignment(SwingConstants.CENTER);
		pPantalla.add(lIdioma);
		
		/*lTituloLogin = new JLabel("Inicio de sesion");
		lTituloLogin.setSize(150, 30);
		lTituloLogin.setLocation((pAbajo.getWidth() - lTituloLogin.getWidth()) / 2, 60);
		lTituloLogin.setForeground(Color.DARK_GRAY);
		lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
		pAbajo.add(lTituloLogin);
		*/
		
		lTituloFinal = new JLabel("______________________________________________");
		lTituloFinal.setSize(350, 20);
		lTituloFinal.setLocation((pDerecha.getWidth() - lTituloFinal.getWidth()) / 2, 255);
		lTituloFinal.setForeground(colorpArriba);
		lTituloFinal.setHorizontalAlignment(SwingConstants.CENTER);
		pDerecha.add(lTituloFinal);
		
		lNotificaciones = new JLabel("¿Has olvidado la contraseña?");
		lNotificaciones.setSize(230, 20);
		lNotificaciones.setCursor(cMano);
		lNotificaciones.setLocation((pDerecha.getWidth() - lNotificaciones.getWidth()) / 2, 230);
		lNotificaciones.setFont(fontSubtitulo);
		lNotificaciones.setForeground(colorPrincipal);
		lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
		pDerecha.add(lNotificaciones);
		
		tNombreUsuario = new JTextField("Correo electronico o número de teléfono");
		tNombreUsuario.setSize(310, 40);
		tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth()) / 2, 50);
		tNombreUsuario.setFont(fontSubtitulo);
		tNombreUsuario.setBorder(bInferior);
		tNombreUsuario.setForeground(Color.GRAY);
		tNombreUsuario.setBackground(Color.WHITE);
		tNombreUsuario.setCaretColor(colorPrincipal);
		tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		pDerecha.add(tNombreUsuario);
		
		tClaveUsuario = new JPasswordField("Contraseña");
		tClaveUsuario.setSize(310, 40);
		tClaveUsuario.setLocation((pDerecha.getWidth() - tClaveUsuario.getWidth()) / 2, 110);
		tClaveUsuario.setFont(fontSubtitulo);
		tClaveUsuario.setBorder(bInferior);
		tClaveUsuario.setForeground(Color.DARK_GRAY);
		tClaveUsuario.setCaretColor(Color.BLUE);
		tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		pDerecha.add(tClaveUsuario);
		
		/*cbTipoUsuario = new JComboBox();
		cbTipoUsuario.addItem("Samu");
		cbTipoUsuario.addItem("Diana");
		cbTipoUsuario.addItem("Paúl");
		cbTipoUsuario.setSize(220, 30);
		cbTipoUsuario.setLocation((pAbajo.getWidth() - cbTipoUsuario.getWidth()) / 2, 185);
		cbTipoUsuario.setForeground(Color.DARK_GRAY);
		cbTipoUsuario.setBackground(Color.WHITE);
		((JLabel) cbTipoUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		pAbajo.add(cbTipoUsuario);
		*/
		
		bEntrar = new JButton("Entrar");
		bEntrar.setSize(310, 40);
		bEntrar.setLocation((pDerecha.getWidth() - bEntrar.getWidth()) / 2, 170);
		bEntrar.setFont(fontSubtitulo2);
		bEntrar.setCursor(cMano);
		bEntrar.setBackground(colorPrincipal);
		bEntrar.setForeground(Color.WHITE);
	    bEntrar.setFocusable(false);
		pDerecha.add(bEntrar);

		iDimAux = new ImageIcon(
		iCerrar.getImage()
		 .getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)
		);
		
		bCerrar = new JButton(); // Se quita el texto que tenia al inicio
		bCerrar.setIcon(iDimAux);
		bCerrar.setContentAreaFilled(false);
		bCerrar.setFocusable(false);
		bCerrar.setBorder(null);
		
		
		bCerrar.setBounds(760, 1, 45, 45);
	
		
		bCerrar.setCursor(cMano);
		
		pPantalla.add(bCerrar);

		bRegistrarse = new JButton("Crear cuenta nueva");
		bRegistrarse.setSize(180,35);
		bRegistrarse.setLocation((pDerecha.getWidth() - bRegistrarse.getWidth()) / 2, 300);
		bRegistrarse.setFont(fontSubtitulo2);
		bRegistrarse.setCursor(cMano);
		bRegistrarse.setFocusable(false);
		bRegistrarse.setBackground(colorPrincipal2);
		bRegistrarse.setForeground(Color.WHITE);
		pDerecha.add(bRegistrarse);

		/* bOpcion1 = new JButton();
		bOpcion1.setBounds(10, 220, 30, 20);
		pArriba.add(bOpcion1);

		bOpcion2 = new JButton();
		bOpcion2.setBounds(10, 250, 30, 20);
		pArriba.add(bOpcion2);

		bOpcion3 = new JButton();
		bOpcion3.setBounds(10, 280, 30, 20);
		pArriba.add(bOpcion3);
		*/
		
		/*checkSi = new JCheckBox("Si");
		checkSi.setSize(45, 25);
		checkSi.setFocusable(false);
		checkSi.setBackground(Color.WHITE);
		checkSi.setLocation((pAbajo.getWidth() - checkSi.getWidth()) / 2 - 15, 345);
		pAbajo.add(checkSi);
		
		
		checkNo = new JCheckBox("No");
		checkNo.setSize(45, 25);
		checkNo.setFocusable(false);
		checkNo.setBackground(Color.WHITE);
		checkNo.setLocation((pAbajo.getWidth() + checkNo.getWidth()) / 2 - 15, 345);
		pAbajo.add(checkNo);
		
		grupo = new ButtonGroup();
		grupo.add(checkSi);
		grupo.add(checkNo);
		*/
		/*rbOpcion1 = new JRadioButton("opcion1");
		rbOpcion1.setBounds(50, 400, 120, 30);
		pIzquierda.add(rbOpcion1);
		
		
		rbOpcion2 = new JRadioButton("opcion2");
		rbOpcion2.setBounds(200, 400, 120, 30);
		pIzquierda.add(rbOpcion2);
		
		taSugerencias = new JTextArea("Escribe algo...");
		taSugerencias.setBounds(185, 180, 230, 140);
		pIzquierda.add(taSugerencias);
		*/
		//atributos de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setUndecorated(true);
		setSize(800,500);
		setLocationRelativeTo(this);
		setVisible(true);
	}
	private void generarFuentes() {
		  try {
		    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    ge.registerFont( Font.createFont(
		        Font.TRUETYPE_FONT,
		        new File("resources/fonts/klavika-bold.otf")
		    ));
		  } catch (IOException | FontFormatException e) {
		    System.out.println(e);
		  }
		}
}
