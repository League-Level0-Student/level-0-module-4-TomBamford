package _01_double._1_change_calculator;

import java.util.concurrent.SynchronousQueue;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String input1 = JOptionPane.showInputDialog("How many nickels do you have?");
		double nickels = Integer.parseInt(input1);
		String input2 = JOptionPane.showInputDialog("How many dimes do you have?");
		double dimes = Integer.parseInt(input2);
		String input3 = JOptionPane.showInputDialog("How many quarters do you have?");
		double quarters = Integer.parseInt(input3);
		double cents =nickels *5 + dimes *10 + quarters * 25; 
		double money = cents * 0.01;
		System.out.println(money);
		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

