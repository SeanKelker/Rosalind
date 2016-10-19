package CountingPointMutations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingPointMutations {

    public static void main(String[] args) throws FileNotFoundException {
	String DataSet = new Scanner(new File("rosalind.txt")).useDelimiter("\\A").next();
	String[] original = new String[DataSet.length()];
	String[] secondSet = new String[DataSet.length()];
	int mutations = 0;

	for (int i = 0; i < DataSet.length() / 2; i++) {
	    original[i] = DataSet.substring(i, i + 1);
	    secondSet[i] = DataSet.substring(i + DataSet.length() / 2 + 1, (i + DataSet.length() / 2) + 2);
	}

	for (int i = 0; i < DataSet.length() / 2; i++) {

	    if (!original[i].equals(secondSet[i])) {
		mutations++;
	    }

	}
	System.out.println(mutations);
    }

}
