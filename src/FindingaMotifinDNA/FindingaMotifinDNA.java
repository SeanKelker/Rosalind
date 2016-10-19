package FindingaMotifinDNA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindingaMotifinDNA {
    public static void main(String[] args) throws FileNotFoundException {
	String DataSet = new Scanner(new File("rosalind.txt")).useDelimiter("\\A").next();
	String[] codons = new String[DataSet.length() / 3];
	String[] finalsolution = new String[DataSet.length() / 3];
	Scanner scan = new Scanner(System.in);
	String Sequence = scan.nextLine();
	for (int i = 0; i < DataSet.length() - Sequence.length(); i++) {
	    if (DataSet.substring(i, i + Sequence.length()).equals(Sequence)) {
		System.out.print(i + 1 + " ");
	    }
	}

    }
}
