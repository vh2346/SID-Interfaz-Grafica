package Login;

import java.awt.Color;

import javax.swing.ButtonGroup;
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

public class LoginTemplate extends JFrame{

	//Declaracion objetos graficos
	
	private JPanel pArriba, pAbajo;
	private JLabel lTituloApp, lIdioma, lTituloLogin,lNotificaciones, lTituloFinal;
	private JTextField tNombreUsuario;
	private JPasswordField tClaveUsuario;
	private JComboBox cbTipoUsuario;
	private JButton bEntrar,bCerrar, bRegistrarse, bOpcion1, bOpcion2, bOpcion3;
	private JCheckBox checkSi, checkNo;
	private ButtonGroup grupo;
	private JRadioButton rbOpcion1, rbOpcion2;
	private JTextArea taSugerencias;
	
	public LoginTemplate() {
		
		super ("Facebook.com");
		
		//atributos panel
		pArriba = new JPanel();
		pArriba.setSize(500, 200);
		pArriba.setLocation(0,0);
		//posicion manual
		pArriba.setBackground(Color.blue);
		pArriba.setLayout(null);
		this.add(pArriba);
		
		pAbajo = new JPanel();
		pAbajo.setSize(500, 500);
		pAbajo.setLocation(0,200);
		pAbajo.setBackground(Color.WHITE);
		pAbajo.setLayout(null);
		this.add(pAbajo);
		
		lTituloApp = new JLabel("Facebook");
		lTituloApp.setBounds(200, 20, 200, 30);
		lTituloApp.setForeground(Color.white);
		pArriba.add(lTituloApp);
		
		lIdioma = new JLabel("English | Portugues | Más...");
		lIdioma.setSize(230,20);
		lIdioma.setLocation((pAbajo.getWidth() -lIdioma.getWidth())/2,40);
		lIdioma.setForeground(Color.DARK_GRAY);
		lIdioma.setHorizontalAlignment(SwingConstants.CENTER);
		pAbajo.add(lIdioma);
		
		/*lTituloLogin = new JLabel("Inicio de sesion");
		lTituloLogin.setSize(150, 30);
		lTituloLogin.setLocation((pAbajo.getWidth() - lTituloLogin.getWidth()) / 2, 60);
		lTituloLogin.setForeground(Color.DARK_GRAY);
		lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
		pAbajo.add(lTituloLogin);
		*/
		
		lTituloFinal = new JLabel("o");
		lTituloFinal.setSize(180, 20);
		lTituloFinal.setLocation((pAbajo.getWidth() - lTituloFinal.getWidth()) / 2, 340);
		lTituloFinal.setForeground(Color.DARK_GRAY);
		lTituloFinal.setHorizontalAlignment(SwingConstants.CENTER);
		pAbajo.add(lTituloFinal);
		
		lNotificaciones = new JLabel("¿Olvidaste tu contraseña?");
		lNotificaciones.setSize(180, 20);
		lNotificaciones.setLocation((pAbajo.getWidth() - lNotificaciones.getWidth()) / 2, 300);
		lNotificaciones.setForeground(Color.BLUE);
		lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
		pAbajo.add(lNotificaciones);
		
		tNombreUsuario = new JTextField("Correo electronico o número de teléfono");
		tNombreUsuario.setSize(260, 40);
		tNombreUsuario.setLocation((pAbajo.getWidth() - tNombreUsuario.getWidth()) / 2, 120);
		tNombreUsuario.setForeground(Color.DARK_GRAY);
		tNombreUsuario.setBackground(Color.WHITE);
		tNombreUsuario.setCaretColor(Color.BLUE);
		tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		pAbajo.add(tNombreUsuario);
		
		tClaveUsuario = new JPasswordField("Contraseña");
		tClaveUsuario.setSize(260, 40);
		tClaveUsuario.setLocation((pAbajo.getWidth() - tClaveUsuario.getWidth()) / 2, 180);
		tClaveUsuario.setForeground(Color.DARK_GRAY);
		tClaveUsuario.setCaretColor(Color.BLUE);
		tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		pAbajo.add(tClaveUsuario);
		
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
		
		bEntrar = new JButton("Iniciar Sesión");
		bEntrar.setSize(250, 40);
		bEntrar.setLocation((pAbajo.getWidth() - bEntrar.getWidth()) / 2, 260);
		bEntrar.setBackground(Color.BLUE);
		bEntrar.setForeground(Color.WHITE);
		bEntrar.setFocusable(false);
		pAbajo.add(bEntrar);
		
		bCerrar = new JButton("X");
		bCerrar.setBounds(360, 10, 45, 30);
		bCerrar.setFocusable(false);
		bCerrar.setBackground(Color.BLUE);
		bCerrar.setForeground(Color.WHITE);
		pArriba.add(bCerrar);

		bRegistrarse = new JButton("Crear cuenta de Facebook");
		bRegistrarse.setSize(310,35);
		bRegistrarse.setLocation((pAbajo.getWidth() - bRegistrarse.getWidth()) / 2, 400);
		bRegistrarse.setFocusable(false);
		bRegistrarse.setBackground(Color.GREEN);
		bRegistrarse.setForeground(Color.WHITE);
		pAbajo.add(bRegistrarse);

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
		setSize(500,700);
		setLocationRelativeTo(this);
		setVisible(true);
	}
}
