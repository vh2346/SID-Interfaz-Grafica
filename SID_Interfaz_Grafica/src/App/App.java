package App;

import javax.swing.SwingUtilities;

import vistaPrincipal.VistaPrincipalTemplate;

public class App {
public static void main(String [] args) {
	//hilo para errores de ejecucion
	Runnable runApplication = new Runnable() {
		
		@Override
		public void run() {
			VistaPrincipalTemplate vista = new VistaPrincipalTemplate();
			
		}
	};
	
	SwingUtilities.invokeLater(runApplication);
	
}
}
