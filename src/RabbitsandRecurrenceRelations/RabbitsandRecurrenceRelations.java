package RabbitsandRecurrenceRelations;
import java.util.Scanner;

import javax.sound.midi.Sequence;

public class RabbitsandRecurrenceRelations {
	public static void main(String[] args){
		double N = 6-1;
		double K = 1;
		double Adult = 0;
		double Baby = 1 ;
		double RePop = 0;
		
		 for(int i=0; i<N; i++){
			 RePop = Adult*K;
			 Adult = Adult + Baby;
			 Baby  = 0;
			 Baby = RePop; 
			 System.out.println(Adult+Baby);
			 
	}
}
}
	

		
		

