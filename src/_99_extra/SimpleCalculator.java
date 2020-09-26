package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		for ( int i = 0; i < 10000; i++) {
String input1 = JOptionPane.showInputDialog("Type a number");
String input2 = JOptionPane.showInputDialog("Type a number");
int number1 = Integer.parseInt(input1);
int number2 = Integer.parseInt(input2);
int Button1 = add(number1, number2);
int Button2 = sub(number1, number2);
int Button3 = mult(number1, number2);
int Button4 = div(number1, number2);

		// 1. Get 2 numbers from the user and convert them to integer.

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Button1", "Button2", "Button3", "Button4" },
				null);
		System.out.println(operation);
		if (operation == 0) {
			JOptionPane.showMessageDialog(null,Button1);
		}
		else if (operation == 1) {
				JOptionPane.showMessageDialog(null, Button2);
		}
			else if (operation == 2) {
				JOptionPane.showMessageDialog(null, Button3);
		}
		else {
			JOptionPane.showMessageDialog(null, Button4);
		}
		
		}
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
	
	static int add(int number1, int number2) {
		int total = number1 + number2;
		return total;
	}
	static int mult(int number1, int number2) {
		int total = number1 * number2;
		return total;
	}
	static int div(int number1, int number2) {
		int total = number1 / number2;
		return total;
	}
	static int sub(int number1, int number2) {
		int total = number1 - number2;
		return total;
	}
}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.}