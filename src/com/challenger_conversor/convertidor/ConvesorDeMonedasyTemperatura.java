package com.challenger_conversor.convertidor;

import javax.swing.*;

@SuppressWarnings("serial")
public class ConvesorDeMonedasyTemperatura extends JFrame {

	public Object input;
	public double valorIngresado;

	@SuppressWarnings("unused")
	public void EscogerConversor() {

		String[] menu = new String[2];
		menu[0] = "Conversor de monedas";
		menu[1] = "Conversor de temperatura";

		input = JOptionPane.showInputDialog(null, "Seleccione una opcion de Conversor", "Menu",
				JOptionPane.PLAIN_MESSAGE, null, menu, null);

		if (input == null) {

			JOptionPane.showMessageDialog(null, "Se ha salido del programa ", "Mensaje",
					JOptionPane.INFORMATION_MESSAGE, null);
			System.exit(0);
		} else {

			if (input == menu[0]) {

				EscogerMoneda escogerMoneda = new EscogerMoneda();
			}

			if (input == menu[1]) {

				EscogerTemperatura escogerTemperatura = new EscogerTemperatura();

			}
		}
	}

}
