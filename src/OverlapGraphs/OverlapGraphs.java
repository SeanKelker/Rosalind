package OverlapGraphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OverlapGraphs {
    public static int[] markers = new int[100];
    public static String[] startStrand = new String[100];
    public static String[] endStrand = new String[100];
    public static String[] markerTags = new String[100];
    public static int markerSets = 0;
    public static int sets = 0;
    public static int strandLength = 0;
    public static int fullSetLength = 0;

    public static void main(String[] args) throws FileNotFoundException {
	String dataSet = new Scanner(new File("rosalind.txt")).useDelimiter("\\A").next();
	String[] fullData = new String[dataSet.length()];
	fullSetLength = dataSet.length();
	for (int i = 0; i < dataSet.length(); i++) {
	    fullData[i] = dataSet.substring(i, i + 1);
	}
	for (int i = 0; i < dataSet.length(); i++) {

	}

	popMarkers(fullData, dataSet);
	endStrands(fullData);
	matches(fullData);
    }

    public static void popMarkers(String[] fullData, String dataSet) {
	for (int i = 0; i < fullSetLength; i++) {
	    if (fullData[i].equals(">")) {
		markers[sets] = i;
		sets++;
	    }

	}
	int tags = 0;
	strandLength = markers[2] - markers[1];
	for (int i = 0; i < fullSetLength; i++) {
	    if (fullData[i].equals(">")) {
		
		markerTags[tags] = dataSet.substring(markers[tags]+1, markers[tags] + 14);
		tags++;
		 
	    }
	}
	for (int i = 0; i < sets; i++) {
	    
	 
	}
    }

    public static void endStrands(String[] fullData) {

	for (int i = 0; i < sets; i++) {
	    startStrand[i] = fullData[markers[i] + 15] + fullData[markers[i] + 16] 
		    + fullData[markers[i] + 17];

	}
	for (int i = 0; i < sets; i++) {

	    endStrand[i] = fullData[markers[i] + (strandLength - 4)] + fullData[markers[i] + (strandLength - 3)]
		    + fullData[markers[i] + (strandLength - 2)];

	}

    }

    public static void matches(String[] fullData) {
	int sol = 0;
	for (int i = 0; i < sets; i++) {
	    for (int a = 0; a < sets; a++) {
		
		if (a == i && startStrand[a].equals(endStrand[i])) {
		   
		} 
		else if (startStrand[a].equals(endStrand[i])) {
		   System.out.println(markerTags[i] +" "+ markerTags[a]);
		   
		}

	    }

	}

    }
}
