package com.tiy.BaseballAvgCal;
import java.awt.List;
import java.util.ArrayList;

public class CalculateAverage {
	private double countTotal, countHits;
	private double average = 0;
	
	public double calculateBatAverage(ArrayList <Integer> marks) {

		  if(!marks.isEmpty()) {
			    for (Integer mark : marks) {
			    	countTotal++;
			    	if(mark == 0);  
			    	else 
			        countHits++; 
			    }
			  }
			    return countHits / countTotal;
		}
	
	public double calculateSluggingPercentage(ArrayList <Integer> marks){
		
		if(!marks.isEmpty()) {
		    for (Integer mark : marks) {
		    	if(mark == 0)continue;  
		    	else 
		    		average += mark;
		    }
		    return average / marks.size();
		  }
		  return average;
	}
	
}
