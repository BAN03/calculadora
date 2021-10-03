package logica;

import javax.swing.JOptionPane;
import operaciones.operaciones;

public class Inicio {
	
	public void calculadora() {
		operaciones o = new operaciones();
		int num1;
		int num2;
		String operacion;
		boolean a = false;
		JOptionPane.showMessageDialog(null, "Bienvenido a la calculadora");
		while (a == false) {
			
			operacion = JOptionPane.showInputDialog("Que operacion quieres realizar? " 
					+ "\n" + "1. suma" 
					+ "\n" + "2. resta" 
					+ "\n" + "3. multiplicacion" 
					+ "\n" + "4. division" 
					+ "\n" + "5. raiz" 
					+ "\n" + "6. cancelar");
			num1 = 0;
			num2 = 0;
			if (operacion.equals("1") || operacion.equals("2") || operacion.equals("3") || operacion.equals("4") || operacion.equals("5")) {
			num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Primer numero"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo numero"));
			}
			switch (operacion) {
			case "1":
				o.suma(num1, num2);
				break;
			case "2":
				o.resta(num1, num2);
				break;
			case "3":
				o.multiplicacion(num1, num2);
				break;
			case "4":
				o.division(num1, num2);
				break;
			case "5":
				o.raiz(num1, num2);
				break;
			case "6":
				a = true;
				break;
			default:
				a = false;
				JOptionPane.showMessageDialog(null, "invalido");
				break;
			}
		}
	}
}