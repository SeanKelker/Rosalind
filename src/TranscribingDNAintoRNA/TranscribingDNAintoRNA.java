package TranscribingDNAintoRNA;

import java.util.Scanner;

import javax.sound.midi.Sequence;

public class TranscribingDNAintoRNA {
    public static void main(String[] args) {
	String Sequence = null;
	int pos = 0;
	Boolean end = true;

	Scanner scan = new Scanner(System.in);
	Sequence = scan.nextLine();
	String[] y = new String[Sequence.length()];

	for (int i = 0; i < y.length; i++) {
	    y[i] = Sequence.substring(i, i + 1);
	}
	for (int i = 0; i < y.length; i++) {
	    if (y[i].equals("T")) {
		y[i] = "U";
	    }

	}
	for (int i = 0; i < y.length; i++) {
	    System.out.print(y[i]);
	}
    }
}
