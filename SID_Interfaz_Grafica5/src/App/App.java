package App;

import javax.swing.SwingUtilities;

import client.Login.LoginComponent;
import client.Login.LoginTemplate;

public class App {
public static void main(String [] args) {
	//hilo para errores de ejecucion
	Runnable runApplication = new Runnable() {
		
		@Override
		public void run() {
			//VistaPrincipalTemplate vista = new VistaPrincipalTemplate();
			LoginComponent login = new LoginComponent();
		}
	};
	
	SwingUtilities.invokeLater(runApplication);
	
}
}
