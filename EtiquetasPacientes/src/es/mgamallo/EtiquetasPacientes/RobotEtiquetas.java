package es.mgamallo.EtiquetasPacientes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class RobotEtiquetas {

	public static void inicializa(){
		try {
			Robot robot = new Robot();
			
			robot.keyPress(KeyEvent.VK_F7);
			robot.keyRelease(KeyEvent.VK_F7);
			
			robot.delay(200);
			for(int i=0;i<8;i++){
				robot.keyPress(KeyEvent.VK_F11);
				robot.keyRelease(KeyEvent.VK_F11);
				robot.delay(100);
			}
			
			pulsarTecla(KeyEvent.VK_ENTER);
		

			//	Gestión de dossieres
			pulsarTecla(KeyEvent.VK_G);
			//pulsarTecla(KeyEvent.VK_ENTER);
			
			//	Etiquetas
			pulsarTecla(KeyEvent.VK_E);
			pulsarTecla(KeyEvent.VK_F11);
			pulsarTecla(KeyEvent.VK_E);

			robot.delay(200);
			
			pulsarTecla(KeyEvent.VK_F9);
			
			robot.delay(200);
			pulsarTecla(KeyEvent.VK_ENTER);
			
	//		pulsarTecla(KeyEvent.VK_F11);
			
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private static void pulsarTecla(int tecla){
		
		Robot robot;
		try {
			robot = new Robot();
			
			robot.keyPress(tecla);
			robot.keyRelease(tecla);
			robot.delay(70);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
	public static void introduceDatos(int centro){
		
		imprimeAgendas(centro);
	}
	
	
	private static void imprimeFecha(int centro){
		String fechaCompleta = InicioEtiquetas.fecha.dia + " " + InicioEtiquetas.fecha.mes 
				+ " " + InicioEtiquetas.fecha.año;
		
		for(int i=0;i<fechaCompleta.length();i++){
			pulsarTecla(getChar(fechaCompleta.charAt(i)));
		}
		
		pulsarTecla(KeyEvent.VK_ENTER);
		int teclaCentro;
		if(centro == 1){
			teclaCentro = KeyEvent.VK_1;
		}else if(centro == 2){
			teclaCentro = KeyEvent.VK_2;
		}else{
			teclaCentro = KeyEvent.VK_3;
		}
		
		pulsarTecla(teclaCentro);
		pulsarTecla(KeyEvent.VK_ENTER);
	}
	
	private static void imprimeAgendas(int centro){
		
		ArrayList<Servicio> tabla;
		
		if(centro == 1){
			tabla = InicioEtiquetas.tablaMontecelo;
		}else if(centro == 2){
			tabla = InicioEtiquetas.tablaMollavao;
		}else{
			tabla = InicioEtiquetas.tablaProvincial;
		}
		
		//System.out.println("Tamaño de la tabla del centro " + centro + " es " + tabla.size());
		
		for(int i=0;i<tabla.size();i++){
			System.out.println("Fila " + i + " de " + (tabla.size()-1));						
			boolean dobles=true;
			for(int z=0;z<2 && dobles;z++){
				if(tabla.get(i).dobles.contains("N")){
					dobles = false;
					//System.out.println("No hay dobles");
				}
				else{
					//System.out.println("Dobles");
				}
				
				imprimeFecha(centro);
				
				if(!tabla.get(i).nombre.equals("@")){
					if(tabla.get(i).agenda.equals("T")){
						for(int j=0;j<tabla.get(i).nombre.length();j++){
							pulsarTecla(getChar(tabla.get(i).nombre.charAt(j)));
						}
						//System.out.println(tabla.get(i).nombre);
					}
					else{
						pulsarTecla(KeyEvent.VK_ENTER);
						for(int j=0;j<tabla.get(i).agenda.length();j++){
							pulsarTecla(getChar(tabla.get(i).agenda.charAt(j)));
						}
						//System.out.println(tabla.get(i).agenda);
					}
				}
				else{
					pulsarTecla(KeyEvent.VK_ENTER);
					for(int j=0;j<tabla.get(i).agenda.length();j++){
						pulsarTecla(getChar(tabla.get(i).agenda.charAt(j)));
					}
					//System.out.println(tabla.get(i).agenda);
				}
				
				pulsarTecla(KeyEvent.VK_ENTER);
				pulsarTecla(KeyEvent.VK_F1);     //  Cambiar por F1
				// pulsarTecla(KeyEvent.VK_ENTER);
				
				try {
					Robot r = new Robot();
					r.delay(1000);
				} catch (AWTException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	private static int getChar(char c){
		int codigo=0;
		boolean inverso = false;
		boolean acento = false;
		
		switch (c){
		case 'a': codigo = KeyEvent.VK_A;break;
		case 'b': codigo = KeyEvent.VK_B;break;
        case 'c': codigo = KeyEvent.VK_C; break;
        case 'd': codigo = KeyEvent.VK_D; break;
        case 'e': codigo = KeyEvent.VK_E; break;
        case 'f': codigo = KeyEvent.VK_F; break;
        case 'g': codigo = KeyEvent.VK_G; break;
        case 'h': codigo = KeyEvent.VK_H; break;
        case 'i': codigo = KeyEvent.VK_I; break;
        case 'j': codigo = KeyEvent.VK_J; break;
        case 'k': codigo = KeyEvent.VK_K; break;
        case 'l': codigo = KeyEvent.VK_L; break;
        case 'm': codigo = KeyEvent.VK_M; break;
        case 'n': codigo = KeyEvent.VK_N; break;
        case 'o': codigo = KeyEvent.VK_O; break;
        case 'p': codigo = KeyEvent.VK_P; break;
        case 'q': codigo = KeyEvent.VK_Q; break;
        case 'r': codigo = KeyEvent.VK_R; break;
        case 's': codigo = KeyEvent.VK_S; break;
        case 't': codigo = KeyEvent.VK_T; break;
        case 'u': codigo = KeyEvent.VK_U; break;
        case 'v': codigo = KeyEvent.VK_V; break;
        case 'w': codigo = KeyEvent.VK_W; break;
        case 'x': codigo = KeyEvent.VK_X; break;
        case 'y': codigo = KeyEvent.VK_Y; break;
        case 'z': codigo = KeyEvent.VK_Z; break;
        case ' ': codigo = KeyEvent.VK_SPACE;break;
        case '-': codigo = KeyEvent.VK_MINUS;break;
        case '.': codigo = 46;break;
//        case '\\': codigo = KeyEvent.VK_ALT_GRAPH; break;
        case '_': inverso = true; codigo = KeyEvent.VK_MINUS;break;
        case ':': inverso = true; codigo = 46;break;       
        case 'A': inverso = true;codigo = KeyEvent.VK_A; break;
        case 'B': inverso = true; codigo = KeyEvent.VK_B; break;
        case 'C': inverso = true; codigo = KeyEvent.VK_C; break;
        case 'D': inverso = true; codigo = KeyEvent.VK_D; break;
        case 'E': inverso = true; codigo = KeyEvent.VK_E; break;
        case 'F': inverso = true; codigo = KeyEvent.VK_F; break;
        case 'G': inverso = true; codigo = KeyEvent.VK_G; break;
        case 'H': inverso = true; codigo = KeyEvent.VK_H; break;
        case 'I': inverso = true; codigo = KeyEvent.VK_I; break;
        case 'J': inverso = true; codigo = KeyEvent.VK_J; break;
        case 'K': inverso = true; codigo = KeyEvent.VK_K; break;
        case 'L': inverso = true; codigo = KeyEvent.VK_L; break;
        case 'M': inverso = true; codigo = KeyEvent.VK_M; break;
        case 'N': inverso = true; codigo = KeyEvent.VK_N; break;
        case 'O': inverso = true; codigo = KeyEvent.VK_O; break;
        case 'P': inverso = true; codigo = KeyEvent.VK_P; break;
        case 'Q': inverso = true; codigo = KeyEvent.VK_Q; break;
        case 'R': inverso = true; codigo = KeyEvent.VK_R; break;
        case 'S': inverso = true; codigo = KeyEvent.VK_S; break;
        case 'T': inverso = true; codigo = KeyEvent.VK_T; break;
        case 'U': inverso = true; codigo = KeyEvent.VK_U; break;
        case 'V': inverso = true; codigo = KeyEvent.VK_V; break;
        case 'W': inverso = true; codigo = KeyEvent.VK_W; break;
        case 'X': inverso = true; codigo = KeyEvent.VK_X; break;
        case 'Y': inverso = true; codigo = KeyEvent.VK_Y; break;
        case 'Z': inverso = true; codigo = KeyEvent.VK_Z; break;
        case 'á': acento = true; codigo = KeyEvent.VK_A; break;
        case 'é': acento = true; codigo = KeyEvent.VK_E; break;
        case 'í': acento = true; codigo = KeyEvent.VK_I; break;
        case 'ó': acento = true; codigo = KeyEvent.VK_O; break;
        case 'ú': acento = true; codigo = KeyEvent.VK_U; break;
        
 
        case '0': codigo = KeyEvent.VK_0; break;
        case '1': codigo = KeyEvent.VK_1; break;
        case '2': codigo = KeyEvent.VK_2; break;
        case '3': codigo = KeyEvent.VK_3; break;
        case '4': codigo = KeyEvent.VK_4; break;
        case '5': codigo = KeyEvent.VK_5; break;
        case '6': codigo = KeyEvent.VK_6; break;
        case '7': codigo = KeyEvent.VK_7; break;
        case '8': codigo = KeyEvent.VK_8; break;
        case '9': codigo = KeyEvent.VK_9; break;		
		
		
		
		
		
		default:
			codigo = KeyEvent.VK_C;
		}
		
		return codigo;
		
		// this.imprimeChar(inverso,codigo, acento);
		
	}
}
