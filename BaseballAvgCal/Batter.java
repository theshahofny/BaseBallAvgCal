package com.tiy.BaseballAvgCal;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Batter {
	
	private String batterName;
	private int atBat;
	double avgResult, slugResult;
	private static ArrayList<Integer> baseNum = new ArrayList<>();
	
	public Batter(String batterName, int atBat){
		this.batterName = batterName;
		this.atBat = atBat;
		askForBatterResults(atBat);
	}
	
	
	public void askForBatterResults(int atBat){
		int atBatresult = 0;
		
		for(int i = 0; i < atBat; i++){
			atBatresult =  Integer.parseInt(JOptionPane.showInputDialog(String.format("What was the %s at-bat result?", i), atBatresult));
			baseNum.add(atBatresult);
		}
		getAverage(baseNum);
	}
	
	public void getAverage(ArrayList baseNum){
		CalculateAverage calAvg = new CalculateAverage();
		avgResult = calAvg.calculateBatAverage(baseNum);
		slugResult = calAvg.calculateSluggingPercentage(baseNum);
		JOptionPane.showMessageDialog(null, String.format("%s's average is %s", batterName, avgResult));
		JOptionPane.showMessageDialog(null, String.format("%s's slugging average is %s" , batterName, slugResult));
	}
	
//	public void addAverage(CalculateAverage average, String name){
//		results.add(average);
//	}
	
	

}
