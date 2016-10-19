package CountingDNANucleotides;

import java.io.*;
import java.util.Scanner;

public class CountingDNANucleotides {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String Sequence = input.nextLine();
	int A = 0;
	int T = 0;
	int C = 0;
	int G = 0;
	int pos = 0;

	for (int i = 0; i < Sequence.length(); i++) {
	    if (Sequence.substring(pos, pos + 1).equals("A")) {
		A++;
		pos++;
	    } else if (Sequence.substring(pos, pos + 1).equals("T")) {
		T++;
		pos++;
	    } else if (Sequence.substring(pos, pos + 1).equals("C")) {
		C++;
		pos++;
	    } else if (Sequence.substring(pos, pos + 1).equals("G")) {
		G++;
		pos++;
	    }

	}
	System.out.println(A + " " + C + " " + G + " " + T);
    }

}
