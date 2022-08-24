package ConversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesConversionTemp {

	ConvertirTemperatura temperatura = new ConvertirTemperatura(); 
	
	public void ConvertirTemperatura(double valor){
		String opcion = (JOptionPane.showInputDialog(null, "Elije la temperatura que quieres convertir", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						"De Celcius a Fahrenheit","De Celcius a Kelvin"},"Selección")).toString();
		
		switch (opcion) {
		case "De Celcius a Fahrenheit":
			temperatura.CelciusAFahrenheit(valor);
			break;
		case "De Pesos a Euro":
			temperatura.CelciusAKelvin(valor);
			break;
		}
	}

}
