package loops;

import javax.swing.JOptionPane;

public class Ex41 {

	public static void main(String[] args) {

		int userInput;

		userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Input value: "));

		if (userInput <= 0) {

			JOptionPane.showMessageDialog(null, "Only positive values and greater than zero are available!!");

			return;
		}

		else {

			int factorial = userInput;

			for (int i = userInput - 1; i >= 1; i--) {

				factorial *= i;

			}

			JOptionPane.showMessageDialog(null, "Factorial: " + factorial);

		}
	}

}
