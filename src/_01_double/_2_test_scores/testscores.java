package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testscores {
public static void main(String[] args) {
	String testscore = JOptionPane.showInputDialog("What did you score on your test?");
		double score = Double.parseDouble(testscore);
		
		if (score > 90) {
			JOptionPane.showMessageDialog(null, "Congratulations on gettings an A, Good Job!");
		}
		else if (score > 80) {
			JOptionPane.showMessageDialog(null, "Try harder next time.");
		}
		else if (score > 70) {
			JOptionPane.showMessageDialog(null, "Wow, that isn't great.");
		}
		else {
			JOptionPane.showMessageDialog(null, "That really sucks.");
		}
	
}
}
