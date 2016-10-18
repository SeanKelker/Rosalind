package ComputingGCContent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.sound.midi.Sequence;

	public class ComputingGCContent  {
		public static int [] Markers = new int[100];
        public static int MarkerSet = 0;
    	public static int sets = 0;
    	public static double [] GCF = new double[1110];
    	public static int setnum = 0;
		public static void main(String[] args) throws FileNotFoundException{
         String DataSet = new Scanner(new File("rosalind_gc.txt")).useDelimiter("\\A").next();
            String [] FullData = new String[DataSet.length()];
         
		    
			
            for(int i=0; i<DataSet.length(); i++){
            	FullData[i] = DataSet.substring(i, i+1);
            }
            
            for(int i=0; i<DataSet.length(); i++){
            	if(FullData[i].equals(">")){
            		Markers[MarkerSet] = i;
            		MarkerSet++;
            		sets++;
            	//	System.out.println(sets);  
            	}
            	 Markers[sets+1]=DataSet.length();
            }
            for(int i=0; i<sets; i++){
           Analyze(FullData);
           setnum++;
            }
            Display(FullData, DataSet);
            
            
	}
		public static void Analyze(String [] FullData) {
		
		int mark1 = Markers[setnum]+16;
		int mark2 = Markers[setnum+1];
		double searchlenght = mark2-mark1;
		int searchloc = mark1;
		double GC = 0;
		int error;
		double total=0;
		  
			
		
			  for(int i=0; i<searchlenght; i++){
				  
			if(FullData[searchloc].equals("C")||FullData[searchloc].equals("G")){
				GC++;
				
				
			}
			if(FullData[searchloc].equals("A")||FullData[searchloc].equals("T")){
				total++;
				
				
			}
			searchloc++;
		}
			error=(int) (searchlenght/30);
		
				total = GC+total;
				GCF[setnum]=GC/total*100;
		}
			

		public static void Display(String [] FullData, String Dataset) {
			double greatest=1;
			int finalset = 0;
			 for(int i=0; i<sets; i++){
				 if(GCF[i]>greatest){
					 greatest=GCF[i];
			//		 System.out.println(GCF[i]);
					 finalset = i;
				 }
				
			 }
		System.out.println(Dataset.substring(Markers[finalset]+1,Markers[finalset]+14));
			 System.out.println(greatest);
		}
	}
			
			



