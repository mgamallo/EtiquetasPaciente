package es.mgamallo.EtiquetasPacientes;

import java.io.File;
import java.io.IOException;

public class Hotkeys {
	
	public Hotkeys() {
		// TODO Auto-generated constructor stub
		File ejecutable = new File("cal\\ImprimirEtiquetas.exe");
		
		try {
			Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + ejecutable);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
