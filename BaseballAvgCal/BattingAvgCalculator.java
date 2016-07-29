package com.tiy.BaseballAvgCal;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BattingAvgCalculator {


	private String atBatnum;
	private int atBat, atBatresult;

	public void openCal(){
		String userInput = "";

		while((!userInput.equalsIgnoreCase("n")))
		{

			userInput = JOptionPane.showInputDialog("Who is your Batter, Please enter their name" +"\n"+ "Or enter exit to exit" , userInput);
			if(userInput.equalsIgnoreCase("exit")) 
				break;
			atBat = Integer.parseInt(JOptionPane.showInputDialog("How many at-bats did this player do, please enter a number?", atBatnum));
		
			if(!(atBat >= 0))
			{
				JOptionPane.showMessageDialog(null, new IllegalArgumentException("Batting result can not be less than zerom" + "\n" + "Try Again!!"));  
				continue;
			}
			
			Batter b1 = new Batter(userInput, atBat);
			userInput = JOptionPane.showInputDialog("Another Batter? Y / N", userInput);
		}
	}

	public static void main(String[] args)
	{

		BattingAvgCalculator newCalAvg = new BattingAvgCalculator();
		newCalAvg.openCal();
		JOptionPane.showMessageDialog(null, "Goodbye!");

	}
}
