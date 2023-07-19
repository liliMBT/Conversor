package com.challenger_conversor.convertidor;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class DeseaContinuar extends ConvesorDeMonedasyTemperatura {

	public DeseaContinuar() {

		int inputDeseaContinuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Seleccione una opcion",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (inputDeseaContinuar == 1 || inputDeseaContinuar == 2) {
			JOptionPane.showMessageDialog(null, "El programa ha terminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE,
					null);
			System.exit(0);
		} else {
			while (inputDeseaContinuar == 0) {
				EscogerConversor();
			}
		}
	}
}
