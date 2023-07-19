package com.challenger_conversor.convertidor;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class EscogerMoneda extends ConvesorDeMonedasyTemperatura {

	public String[] opcionesMoneda1;
	public String[] opcionesMoneda2;

	@SuppressWarnings("unused")
	public EscogerMoneda() {

		opcionesMoneda1 = new String[5];
		opcionesMoneda1[0] = ("De pesos a Dolar");
		opcionesMoneda1[1] = ("De pesos a Euro");
		opcionesMoneda1[2] = ("De pesos a Libras");
		opcionesMoneda1[3] = ("De pesos a Yen");
		opcionesMoneda1[4] = ("De pesos a Won Coreano");

		opcionesMoneda2 = new String[5];

		opcionesMoneda2[0] = ("De Dolar a pesos");
		opcionesMoneda2[1] = ("De Euro a pesos");
		opcionesMoneda2[2] = ("De Libras a pesos");
		opcionesMoneda2[3] = ("De Yen a pesos");
		opcionesMoneda2[4] = ("De Won Coreano a pesos");

		String[] opcionesMonedaConcatenado = new String[opcionesMoneda1.length + opcionesMoneda2.length];
		System.arraycopy(opcionesMoneda1, 0, opcionesMonedaConcatenado, 0, opcionesMoneda1.length);
		System.arraycopy(opcionesMoneda2, 0, opcionesMonedaConcatenado, opcionesMoneda1.length, opcionesMoneda2.length);

		input = JOptionPane.showInputDialog(null, "Elija la moneda a la que deseas convertir tu dinero", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, opcionesMonedaConcatenado, null);

		if (input == null) {

			JOptionPane.showMessageDialog(null, "Se ha salido del programa", "Mensaje", JOptionPane.INFORMATION_MESSAGE,
					null);
			System.exit(0);

		} else {
			try {
				Calculadora();

			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Valor no valido", "Mensaje", JOptionPane.INFORMATION_MESSAGE,
						null);
				System.exit(0);

			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Se ha salido del programa", "Mensaje",
						JOptionPane.INFORMATION_MESSAGE, null);
				System.exit(0);
			}

		}
		DeseaContinuar opcion = new DeseaContinuar();
	}

	@SuppressWarnings("deprecation")
	public void Calculadora() {

		double[] tasa = new double[5];
		tasa[0] = 4102.13; // Dolar
		tasa[1] = 4611.20;// Euro
		tasa[2] = 5380.35;// Libra
		tasa[3] = 29.61;// Yen Japones
		tasa[4] = 3.24;// Won Coreano

		String[] nombreMoneda = new String[5];
		nombreMoneda[0] = "Dolares";
		nombreMoneda[1] = "Euros";
		nombreMoneda[2] = "Libras";
		nombreMoneda[3] = "Yen Japones";
		nombreMoneda[4] = "Won Coreanos";

		for (int i = 0; i < tasa.length; i++) {

			if (input == opcionesMoneda1[i]) {
				this.valorIngresado = Double
						.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad que deseas convertir"));
				double valorCalculado = this.valorIngresado / tasa[i];
				BigDecimal bigDecimal= new BigDecimal(valorCalculado).setScale(2, 2);
				JOptionPane.showMessageDialog(null, "Tienes $" + bigDecimal + " " + nombreMoneda[i],
						"Mensaje", JOptionPane.INFORMATION_MESSAGE, null);
			}

			if (input == opcionesMoneda2[i]) {
				this.valorIngresado = Double
						.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad que deseas convertir"));
				double valorCalculado = (this.valorIngresado * tasa[i]);
				BigDecimal bigDecimal= new BigDecimal(valorCalculado).setScale(2, 2);
				JOptionPane.showMessageDialog(null, "Tienes $" + bigDecimal + " pesos", "Mensaje",
						JOptionPane.INFORMATION_MESSAGE, null);

			}

		}

	}
}
