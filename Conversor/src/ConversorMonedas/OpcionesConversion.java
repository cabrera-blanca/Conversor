package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	ConvertirMonedas monedas = new ConvertirMonedas(); 
	
	public void ConvertiMonedas(double valor){
		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						"De Pesos a Dólar","De Pesos a Euro","De Pesos a Libras","De Pesos a Yen","De Pesos a Won"},"Selección")).toString();
		
		switch (opcion) {
		case "De Pesos a Dólar":
			monedas.PesosADolar(valor);
			break;
		case "De Pesos a Euro":
			monedas.PesosAEuro(valor);
			break;
		case "De Pesos a Libras":
			monedas.PesosALibraEsterlina(valor);
			break;
		case "De Pesos a Yen":
			monedas.PesosAYen(valor);
			break;
		case "De Pesos a Won":
			monedas.PesosAWon(valor);
			break;
		}
	}
	
}
