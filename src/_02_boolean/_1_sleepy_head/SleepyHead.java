package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		String input = JOptionPane.showInputDialog("What day is it?");
		if (input.equalsIgnoreCase("Saturday")) {
		isWeekend = true;
		JOptionPane.showMessageDialog(null, "You get to sleep in");
		}
		else if( input.equalsIgnoreCase("Sunday")) {
			isWeekend = true;
			JOptionPane.showMessageDialog(null, "You get to sleep in");
		}else {
			isWeekend = false;
			JOptionPane.showMessageDialog(null, "Get out of bed and go to school!");
		}
		
		// Write code to ask the user what day it is.
        
		// Set the boolean isWeekend based on the value they enter
		
		
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		String input1 = JOptionPane.showInputDialog("What percentage did you score in your last exam? Round up if necesary");
		int score = Integer.parseInt(input1);
		if (score > 69) {
			isWeekend = true;
			JOptionPane.showMessageDialog(null, "Congratulations on passing");
		}
		else {
			isWeekend = false;
			JOptionPane.showMessageDialog(null, "Better luck next time");
		}
		
// Write code to ask the user what percentage they scored in their last exam

		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("Is the game over? If so say yes, if not say no");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
				JOptionPane.showMessageDialog(null, "Game is over");
			// If they answer "yes", change gameIsOver to true
			
		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
	}	
}
