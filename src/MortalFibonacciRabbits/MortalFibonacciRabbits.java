package MortalFibonacciRabbits;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;



public class MortalFibonacciRabbits {
	
	public static BigDecimal[] baby = new BigDecimal[1000];	
	public static BigDecimal[] adult = new BigDecimal[1000];
	public static double m = 81;
	public static int l = 20-1;
	
	
	public static int currentMonth = 1;
	
	public static void main(String[] args){
		Arrays.fill(baby, BigDecimal.ZERO);
		Arrays.fill(adult, BigDecimal.ZERO);
		BigDecimal x = new BigDecimal(1);
		baby[1] = baby[1].add(x);
		
		for(double i=0; i<m; i++){
		
			
			System.out.println(baby[currentMonth].add(adult[currentMonth]));
			Birth();
			Death();
			Mature();
			currentMonth++;
 			
		}
	}
	public static void Birth(){
		baby[currentMonth+1] = adult[currentMonth];
		
	}
	public static void Mature(){
		
		adult[currentMonth+1] = adult[currentMonth+1].add(baby[currentMonth]);
		adult[currentMonth+1] = adult[currentMonth+1].add(adult[currentMonth]);
		
		
	}
	public static void Death(){
		if(currentMonth>=l){
			
		adult[currentMonth] = adult[currentMonth].subtract(baby[ currentMonth-l]);
		
			
		}
		
	}
}
	

	


