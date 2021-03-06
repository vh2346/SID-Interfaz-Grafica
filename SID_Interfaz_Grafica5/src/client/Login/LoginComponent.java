package client.Login;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import client.vistaPrincipal.VistaPrincipalComponent;

import java.awt.event.ActionEvent;

public class LoginComponent implements ActionListener{
	
	private LoginTemplate loginTemplate;
	
	public LoginComponent () {
		loginTemplate = new LoginTemplate(this); 
		
	}

	public LoginTemplate getLoginTemplate() {
	    return loginTemplate;
	  }

	 public void actionPerformed(ActionEvent e) {
		    if (e.getActionCommand().equals("Entrar")) {
		    	mostrarDatos();
		    	entrar();
		    }
		    	
		    	
		    if(e.getSource()==loginTemplate.getBRegistrarse())
		    	JOptionPane.showMessageDialog(null, "Boton Registrarse", "Advertencia", 1);
		  
		    if(e.getSource()==loginTemplate.getBOlvido())
		    	JOptionPane.showMessageDialog(null, "Ingrese correo para recuperar clave", "Advertencia", 2);
	 		if(e.getSource()==loginTemplate.getBCerrar())
	    	System.exit(0);
	 		
	 
	 		
	 }
	 public void mostrarDatos(){
		 String nombreusuario=loginTemplate.getTNombreUsuario().getText();
		String claveusuario=new String (loginTemplate.getTClaveUsuario().getPassword());
		 JOptionPane.showMessageDialog(null, "Nombre: "+nombreusuario+ "\n"+"Clave: " +claveusuario, "Advertencia", 2);
	 }
	 public void entrar() {
		 VistaPrincipalComponent vpComponent= new VistaPrincipalComponent();
		 loginTemplate.setVisible(false);
	 }
}
