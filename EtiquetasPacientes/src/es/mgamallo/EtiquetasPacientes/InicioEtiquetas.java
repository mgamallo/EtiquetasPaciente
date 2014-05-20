package es.mgamallo.EtiquetasPacientes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.freixas.jcalendar.JCalendar;
import org.freixas.jcalendar.JCalendarCombo;

public class InicioEtiquetas {

	/**
	 * @param args
	 */

	public static Fecha fecha;
	
	public static ArrayList<Servicio> tablaProvincial = new ArrayList<Servicio>();
	public static ArrayList<Servicio> tablaMontecelo = new ArrayList<Servicio>();
	public static ArrayList<Servicio> tablaMollavao = new ArrayList<Servicio>();
	
	static String archivoDestino = "EtiquetasPacientes.xls";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fecha = new Fecha();
		new Hotkeys();
		//LeerExcel excel = new LeerExcel(archivoDestino);
		new Calendario();
		
		new LeerTxt();

		
	}

}

class Fecha {
	String dia = "";
	String mes = "";
	String año = "";
}

class Servicio {
	String nombre = "";
	String agenda = "";
	String dobles = "";
}