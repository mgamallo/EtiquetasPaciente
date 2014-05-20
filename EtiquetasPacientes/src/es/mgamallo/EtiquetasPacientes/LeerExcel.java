package es.mgamallo.EtiquetasPacientes;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import javax.swing.JOptionPane;

import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.biff.CountryCode;
import jxl.read.biff.BiffException;

public class LeerExcel {

/*
	public LeerExcel(String archivoDestino) {
		// TODO Auto-generated constructor stub

		WorkbookSettings wbSettings = new WorkbookSettings();
		wbSettings.setEncoding("ISO-8859-1");
		wbSettings.setLocale(new Locale("es", "ES"));
		wbSettings.setExcelDisplayLanguage("ES");
		wbSettings.setExcelRegionalSettings("ES");
		wbSettings.setCharacterSet(CountryCode.SPAIN.getValue());

		try {
			Workbook archivoExcel = Workbook.getWorkbook(new File(
					archivoDestino));

			// Extraemos tabla Montecelo
			Sheet hoja = archivoExcel.getSheet(0);
			int numColumnas = 3;
			int numFilas = 0;

			while (!hoja.getCell(0, numFilas).getContents().toString()
					.contains("#")) {
				numFilas++;
			}

			InicioEtiquetas.tablaMontecelo = new String[numFilas - 1][numColumnas];

			for (int fila = 1; fila < numFilas; fila++) {
				for (int columna = 0; columna < numColumnas; columna++) {
					InicioEtiquetas.tablaMontecelo[fila - 1][columna] = hoja
							.getCell(columna, fila).getContents().toString();
				}
			}

			// Extraemos tabla Mollavao
			hoja = archivoExcel.getSheet(1);
			numFilas = 0;

			while (!hoja.getCell(0, numFilas).getContents().toString()
					.contains("#")) {
				numFilas++;
			}

			InicioEtiquetas.tablaMollavao = new String[numFilas - 1][numColumnas];

			for (int fila = 1; fila < numFilas; fila++) {
				for (int columna = 0; columna < numColumnas; columna++) {
					InicioEtiquetas.tablaMollavao[fila - 1][columna] = hoja
							.getCell(columna, fila).getContents().toString();
				}
			}

			// Extraemos tabla Provincial
			hoja = archivoExcel.getSheet(2);
			numFilas = 0;

			while (!hoja.getCell(0, numFilas).getContents().toString()
					.contains("#")) {
				numFilas++;
			}

			InicioEtiquetas.tablaProvincial = new String[numFilas - 1][numColumnas];

			for (int fila = 1; fila < numFilas; fila++) {
				for (int columna = 0; columna < numColumnas; columna++) {
					InicioEtiquetas.tablaProvincial[fila - 1][columna] = hoja
							.getCell(columna, fila).getContents().toString();
				}
			}

			imprimirTabla(InicioEtiquetas.tablaMontecelo);
			
			archivoExcel.close();
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showConfirmDialog(null, "Error en el proceso de lectura");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showConfirmDialog(null, "Error en el acceso al archivo");
		}

	}

	private void imprimirTabla(String[][] tabla) {
		for (int fila = 0; fila < tabla.length; fila++) {
			for (int columna = 0; columna < 3; columna++) {
				System.out.print(tabla[fila][columna] + "\t");
			}
			System.out.println();
		}
	}
	*/
}
