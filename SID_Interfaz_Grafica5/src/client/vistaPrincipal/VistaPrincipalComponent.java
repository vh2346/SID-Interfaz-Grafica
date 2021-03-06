package client.vistaPrincipal;

public class VistaPrincipalComponent {

	
		
		private VistaPrincipalTemplate vpTemplate;
		
		public VistaPrincipalComponent() {
			vpTemplate=new VistaPrincipalTemplate(this);
		}
		
		
	public VistaPrincipalTemplate getVpTemplate() {
		return vpTemplate;
	}
}
