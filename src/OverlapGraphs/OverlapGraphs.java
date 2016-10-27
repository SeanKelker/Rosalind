package OverlapGraphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OverlapGraphs {
    public static int[] markers = new int[100];
    public static int markerSets = 0;
    public static int sets = 0;
    public static int fullSetLength = 0;

    public static void main(String[] args) throws FileNotFoundException {
	String dataSet = new Scanner(new File("rosalind.txt")).useDelimiter("\\A").next();
	String[] fullData = new String[dataSet.length()];
	fullSetLength = dataSet.length();
	for (int i = 0; i < dataSet.length(); i++) {
	    fullData[i] = dataSet.substring(i, i + 1);
	}
	for (int i = 0; i < dataSet.length(); i++) {
	  System.out.println(fullData[i]+" "+i);  
	}
	
//	popMarkers(fullData);
    }

    public static void popMarkers(String[] fullData) {
	for (int i = 0; i < fullSetLength; i++) {
	    if (fullData[i].equals(">")) {
		markers[sets] = i;
		sets++;
	    }

	}

    }

}
