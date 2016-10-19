package RabbitsandRecurrenceRelations;

import java.math.BigDecimal;
import java.util.Scanner;

import javax.sound.midi.Sequence;

public class RabbitsandRecurrenceRelations {
    public static void main(String[] args) {
		
	long N = 31 - 1;
	long K = 3;
	long Adult = 0;
	long Baby = 1;
	long RePop = 0;

	for (int i = 0; i < N; i++) {
	    RePop = Adult * K;
	    Adult = Adult + Baby;
	    Baby = 0;
	    Baby = RePop;
	  
	    System.out.println(Baby+Adult);

	}
    }
}
