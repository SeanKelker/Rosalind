package CalculatingExpectedOffspring;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalculatingExpectedOffspring {

    public static void main(String[] args) throws FileNotFoundException {

	String dataSet = new Scanner(new File("rosalind.txt")).useDelimiter("\\A").next();
	int[] markers = new int[1000];
	int[] values = new int[6];
	int counter = 1;
	int AAAA = 0;
	int AAAa = 0;
	int AAaa = 0;
	int AaAa = 0;
	int Aaaa = 0;
	int aaaa = 0;

	for (int i = 0; i < dataSet.length(); i++) {
	    if (dataSet.substring(i, i + 1).equals(" ")) {
		markers[counter] = i;
		counter++;
	    }
	}
	markers[0] = -1;
	markers[6] = dataSet.length();

	for (int i = 0; i < 6; i++) {
	    values[i] = Integer.valueOf(dataSet.substring(markers[i] + 1, markers[i + 1]));

	}
	AAAA = values[0];
	AAAa = values[1];
	AAaa = values[2];
	AaAa = values[3];
	Aaaa = values[4];
	aaaa = values[5];

	double sum = (AAAA * 2 * 1) + (AAAa * 2 * 1) + (AAaa * 2 * 1) + (AaAa * 2 * .75) + (Aaaa * 2 * .5)
		+ (aaaa * 2 * 0);

	System.out.println(sum);

    }

}
