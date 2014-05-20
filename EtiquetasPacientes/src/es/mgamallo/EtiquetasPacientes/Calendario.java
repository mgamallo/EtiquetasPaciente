package es.mgamallo.EtiquetasPacientes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.freixas.jcalendar.JCalendarCombo;

class Calendario extends JFrame {

	JCalendarCombo comboCalendario = new JCalendarCombo();

	JButton boton = new JButton("Aceptar");

	JButton botonProvincial = new JButton("Imprimir Provincial");
	JButton botonMontecelo = new JButton("Imprimir Montecelo");
	JButton botonMollavao = new JButton("Imprimir Mollavao");

	JPanel panelPrincipal = new JPanel();
	JPanel panelCentral = new JPanel();

	public Calendario() {

		setTitle("Impresión de etiquetas por centros");

		botonProvincial.setVisible(false);
		botonMontecelo.setVisible(false);
		botonMollavao.setVisible(false);
		
		botonProvincial.setBackground(Color.red);
		botonMontecelo.setBackground(Color.red);
		botonMollavao.setBackground(Color.red);
		
		
		panelCentral.setLayout(new FlowLayout());
		panelCentral.add(botonProvincial, BorderLayout.CENTER);
		panelCentral.add(botonMontecelo, BorderLayout.CENTER);
		panelCentral.add(botonMollavao, BorderLayout.CENTER);

		panelPrincipal.setLayout(new FlowLayout());
		panelPrincipal.add(comboCalendario);
		panelPrincipal.add(boton);
		panelPrincipal.add(panelCentral);

		panelPrincipal.setBackground(Color.white);
		panelCentral.setBackground(Color.white);

		setContentPane(panelPrincipal);

		boton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Date fechaEtiquetas = comboCalendario.getDate();

				Calendar calendario = Calendar.getInstance();
				calendario.setTime(fechaEtiquetas);

				InicioEtiquetas.fecha.dia = String.valueOf(calendario
						.get(Calendar.DATE));
				InicioEtiquetas.fecha.mes = String.valueOf(calendario
						.get(Calendar.MONTH) + 1);
				InicioEtiquetas.fecha.año = String.valueOf(calendario
						.get(Calendar.YEAR));

				// System.out.println("hola");

				System.out.println(InicioEtiquetas.fecha.dia);
				System.out.println(InicioEtiquetas.fecha.mes);
				System.out.println(InicioEtiquetas.fecha.año);

				botonProvincial.setVisible(true);
				botonMontecelo.setVisible(true);
				botonMollavao.setVisible(true);

				boton.setEnabled(false);
				comboCalendario.setEnabled(false);

			}

		});

		botonProvincial.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				botonProvincial.setBackground(Color.green);
				
				RobotEtiquetas.inicializa();
				RobotEtiquetas.introduceDatos(3);
			}
		});

		botonMontecelo.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				botonMontecelo.setBackground(Color.green);
				
				RobotEtiquetas.inicializa();
				RobotEtiquetas.introduceDatos(1);
			}
		});

		botonMollavao.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				botonMollavao.setBackground(Color.green);
				
				RobotEtiquetas.inicializa();
				RobotEtiquetas.introduceDatos(2);
			}
		});

		this.setLayout(new FlowLayout());
		this.setSize(800, 80);
		this.setResizable(false);

		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		this.setLocationRelativeTo(null);
	}
}