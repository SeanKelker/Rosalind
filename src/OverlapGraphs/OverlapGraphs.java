package OverlapGraphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OverlapGraphs {
    public static int[] markers = new int[1000];
    public static String[] Prefix = new String[1000];
    public static String[] Suffix = new String[1000];
    public static String[] markerTags = new String[1000];
    public static int markerSets = 0;
    public static int sets = 0;
    public static int strandLength = 0;
    public static int setLength = 0;

    public static void main(String[] args) throws FileNotFoundException {
	String rawSet = new Scanner(new File("rosalind.txt")).useDelimiter("\\A").next();
	String dataSet = rawSet.trim();
	dataSet = dataSet.replaceAll("\\s", "");
	String[] fullData = new String[dataSet.length()];
	setLength = dataSet.length();
	for (int i = 0; i < dataSet.length(); i++) {
	    fullData[i] = dataSet.substring(i, i + 1);
	}
	markers(fullData, dataSet);
	extrema(fullData);
	compare(fullData);

    }

    public static void markers(String[] fullData, String dataSet) {

	for (int i = 0; i < setLength; i++) {
	    if (fullData[i].equals(">")) {
		markers[sets] = i;
		sets++;

	    }
	}
	markers[sets] = dataSet.length();

    }

    public static void extrema(String[] fullData) {
	int counter = 0;
	int suffixCounter = 1;
	for (int i = 0; i < sets; i++) {
	    markerTags[counter] = fullData[markers[counter] + 1] + fullData[markers[counter] + 2]
		    + fullData[markers[counter] + 3] + fullData[markers[counter] + 4] + fullData[markers[counter] + 5]
		    + fullData[markers[counter] + 6] + fullData[markers[counter] + 7] + fullData[markers[counter] + 8]
		    + fullData[markers[counter] + 9] + fullData[markers[counter] + 10] + fullData[markers[counter] + 11]
		    + fullData[markers[counter] + 12] + fullData[markers[counter] + 13];
	    Prefix[counter] = fullData[markers[counter] + 14] + fullData[markers[counter] + 15]
		    + fullData[markers[counter] + 16];

	    Suffix[counter] = fullData[markers[suffixCounter] - 3] + fullData[markers[suffixCounter] - 2]
		    + fullData[markers[suffixCounter] - 1];

	    counter++;
	    suffixCounter++;
	}

    }

    public static void compare(String[] fullData) {

	for (int suffix = 0; suffix < sets; suffix++) {
	    for (int prefix = 0; prefix < sets; prefix++) {

		if (Suffix[suffix].equals(Prefix[prefix]) && suffix != prefix) {
		    System.out.println(markerTags[suffix] + " " + markerTags[prefix]);
		}

	    }
	}
    }

}
