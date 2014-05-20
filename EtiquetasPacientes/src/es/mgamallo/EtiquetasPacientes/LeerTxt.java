package es.mgamallo.EtiquetasPacientes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeerTxt {
	public LeerTxt(){

		File ficheroMontecelo = new File("Cal\\Montecelo.txt");
		File ficheroMollavao = new File("Cal\\Mollavao.txt");
		File ficheroProvincial = new File("Cal\\Provincial.txt");
		
		InicioEtiquetas.tablaMontecelo = leeFichero(ficheroMontecelo);
		InicioEtiquetas.tablaMollavao = leeFichero(ficheroMollavao);
		InicioEtiquetas.tablaProvincial = leeFichero(ficheroProvincial);
		
	}
	
	private ArrayList<Servicio> leeFichero(File fichero){
		
		Scanner s;
		ArrayList<Servicio> servicios = new ArrayList<Servicio>();
		
		try {
			s = new Scanner(fichero);
			int filas = 0;
			
			while(s.hasNextLine()){
				Servicio servicio = new Servicio();
				
				if(filas != 0){
					String linea = s.nextLine();
					Scanner sl = new Scanner(linea);
					sl.useDelimiter(";");
					servicio.nombre = sl.next();
					servicio.agenda = sl.next();
					servicio.dobles = sl.next();
					sl.close();
					servicios.add(servicio);
				}else{
					s.nextLine();
				}
				
				filas++;
			}
			s.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(int i=0;i<servicios.size();i++){
			System.out.println(servicios.get(i).nombre + "\t" + servicios.get(i).agenda + "\t" 
					+ servicios.get(i).dobles);
		}
		
		
		return servicios;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new LeerTxt();

		
	}
	
}
