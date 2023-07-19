package com.challenger_conversor.convertidor;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class EscogerTemperatura extends ConvesorDeMonedasyTemperatura {

	public String[] opcionesTemperatura;

	@SuppressWarnings("unused")
	public EscogerTemperatura() {

		opcionesTemperatura = new String[6];
		opcionesTemperatura[0] = ("Grados Celsius a Fahrenheit");
		opcionesTemperatura[1] = ("Grados Celsius a Kelvin");
		opcionesTemperatura[2] = ("Grados Fahrenheit a Celsius");
		opcionesTemperatura[3] = ("Grados Fahrenheit a Kelvin");
		opcionesTemperatura[4] = ("Grados Kelvin a Celsius");
		opcionesTemperatura[5] = ("Grados Kelvin a Fahrenheit");

		input = JOptionPane.showInputDialog(null, "Ingresa el valor de temperatura que deseas convertir", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, opcionesTemperatura, null);

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

		this.valorIngresado = Double
				.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad que deseas convertir"));

		if (input == opcionesTemperatura[0]) {
			double resultado = (1.8 * this.valorIngresado) + 32;
			BigDecimal bigDecimal= new BigDecimal(resultado).setScale(2, 2);
			JOptionPane.showMessageDialog(null, "Son " + bigDecimal + " Grados Fahrenheit", "Mensaje",
					JOptionPane.INFORMATION_MESSAGE, null);

		}
		if (input == opcionesTemperatura[1]) {
			double resultado = this.valorIngresado + 273;
			BigDecimal bigDecimal= new BigDecimal(resultado).setScale(2, 2);
			JOptionPane.showMessageDialog(null, "Son " + bigDecimal + " Grados Kelvin", "Mensaje",
					JOptionPane.INFORMATION_MESSAGE, null);

		}
		if (input == opcionesTemperatura[2]) {
			double resultado = (0.56 * (this.valorIngresado - 32));
			BigDecimal bigDecimal= new BigDecimal(resultado).setScale(2, 2);
			JOptionPane.showMessageDialog(null, "Son " + bigDecimal + " Grados Celsius", "Mensaje",
					JOptionPane.INFORMATION_MESSAGE, null);

		}
		if (input == opcionesTemperatura[3]) {
			double resultado = (0.56 * (this.valorIngresado - 32) + 273);
			BigDecimal bigDecimal= new BigDecimal(resultado).setScale(2, 2);
			JOptionPane.showMessageDialog(null, "Son " + bigDecimal + " Grados Kelvin", "Mensaje",
					JOptionPane.INFORMATION_MESSAGE, null);

		}
		if (input == opcionesTemperatura[4]) {
			double resultado = this.valorIngresado - 273;
			BigDecimal bigDecimal= new BigDecimal(resultado).setScale(2, 2);
			JOptionPane.showMessageDialog(null, "Son " + bigDecimal + " Grados Celsius", "Mensaje",
					JOptionPane.INFORMATION_MESSAGE, null);

		}
		if (input == opcionesTemperatura[5]) {
			double resultado = (1.8 * (this.valorIngresado - 273) + 32);
			BigDecimal bigDecimal= new BigDecimal(resultado).setScale(2, 2);
			JOptionPane.showMessageDialog(null, "Son " + bigDecimal + " Grados Fahrenheit", "Mensaje",
					JOptionPane.INFORMATION_MESSAGE, null);

		}
	}

}
