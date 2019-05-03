package OPPsCengiz;

import javax.swing.JOptionPane;

public class GUI_Practise1 {
	public static void main(String[] args) {

		String fn = javax.swing.JOptionPane.showInputDialog("Enter first Number");

		String sn = javax.swing.JOptionPane.showInputDialog("Enter second Number");

		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;

		JOptionPane.showMessageDialog(null, "The answer is " + sum, "My First GUI", JOptionPane.PLAIN_MESSAGE);

	}

}
