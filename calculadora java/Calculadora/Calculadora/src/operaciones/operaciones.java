package operaciones;

import javax.swing.JOptionPane;

public class operaciones {

	public void operacion() {

	}

	public void suma(int num1, int num2) {

		int suma = num1 + num2;
		JOptionPane.showMessageDialog(null, "Resultado: " + suma);

	}

	public void resta(int num1, int num2) {
		int resta = num1 - num2;
		JOptionPane.showMessageDialog(null, "Resultado: " + resta);

	}

	public void multiplicacion(int num1, int num2) {
		int multiplicacion = num1 * num2;
		JOptionPane.showMessageDialog(null, "Resultado: " + multiplicacion);

	}

	public void division(int num1, int num2) {
			
		try {
			int division = num1 / num2;
			JOptionPane.showMessageDialog(null, "Resultado: " + division);
		} catch (Exception zero) {
			JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
		}
	}

	public void raiz(int num1, int num2) {
		double raiz = (int) Math.pow(num1, (1 / num2));
		JOptionPane.showMessageDialog(null, "Resultado: " + raiz);

	}

}
