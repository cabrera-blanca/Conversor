package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void PesosADolar(double valor){
		double monedaDolar = valor / 297;
		monedaDolar = (double) Math.round(monedaDolar * 100d )/100;
		JOptionPane.showMessageDialog(null, "Tienes $" +monedaDolar+ "Dólares" );
	}
	public void PesosAEuro(double valor){
		double monedaEuro = valor / 136.47;
		monedaEuro = (double) Math.round(monedaEuro * 100d )/100;
		JOptionPane.showMessageDialog(null, "Tienes $" +monedaEuro+ "Dólares" );
	}
	public void PesosALibraEsterlina(double valor){
		double monedaLibraEsterlina = valor / 161.82;
		monedaLibraEsterlina = (double) Math.round(monedaLibraEsterlina * 100d )/100;
		JOptionPane.showMessageDialog(null, "Tienes $" +monedaLibraEsterlina+ "Dólares" );
	}
	public void PesosAYen(double valor){
		double monedaYen = valor / 1;
		monedaYen = (double) Math.round(monedaYen * 100d )/100;
		JOptionPane.showMessageDialog(null, "Tienes $" +monedaYen+ "Dólares" );
	}
	public void PesosAWon(double valor){
		double monedaWon = valor / 0.10;
		monedaWon = (double) Math.round(monedaWon * 100d )/100;
		JOptionPane.showMessageDialog(null, "Tienes $" +monedaWon+ "Dólares" );
	}
}
