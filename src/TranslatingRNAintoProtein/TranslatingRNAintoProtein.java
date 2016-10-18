package TranslatingRNAintoProtein;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.sound.midi.Sequence;

public class TranslatingRNAintoProtein {
	public static int pos =0;
	
	
	public static void main(String[] args) throws FileNotFoundException{
	  String DataSet = new Scanner(new File("rosalind_gc.txt")).useDelimiter("\\A").next();
      String [] FullData = new String[DataSet.length()];
      String [] codons = new String[DataSet.length()/3];
      String [] finalsolution = new String[DataSet.length()/3];
      for(int i=0; i<DataSet.length(); i++){
    	  
      	FullData[i] = DataSet.substring(i ,i+1);

      	
      }
      for(int i=0; i<codons.length; i++){
    	  
        codons[i] = FullData[pos]+FullData[pos+1]+FullData[pos+2];
        pos=pos+3;
        	
        }
      for(int i=0; i<codons.length; i++){
    	  if( codons[i].equals("UUU")||codons[i].equals("UUC")){
    		 finalsolution [i] = "F";
    	  }
    	  else if( codons[i].equals("UUA")||codons[i].equals("UUG")||codons[i].equals("CUU")||codons[i].equals("CUG")||codons[i].equals("CUC")||codons[i].equals("CUA")){
     		 finalsolution [i] = "L";
  
     	  }
    	  else if( codons[i].equals("UCU")||codons[i].equals("UCC") ||codons[i].equals("UCA")||codons[i].equals("UCG")){
     		 finalsolution [i] = "S";
     		
     	  }
    	  else if( codons[i].equals("UAU")||codons[i].equals("UAC")){
     		 finalsolution [i] = "Y";
    	  }
     		
     		else if( codons[i].equals("UAA")||codons[i].equals("UAG") ||codons[i].equals("UGA")){
      		 finalsolution [i] = " ";
      	  }
     		else if( codons[i].equals("UGU")||codons[i].equals("UGC")){
     		 finalsolution [i] = "C";
     		
     	  }
     		else if( codons[i].equals("UGG")){
      		 finalsolution [i] = "W";
      		
      	  }
     		else if( codons[i].equals("CCU")||codons[i].equals("CCC") ||codons[i].equals("CCA")||codons[i].equals("CCG")){
      		 finalsolution [i] = "P";
      		
      	  }
     		else  if( codons[i].equals("CAU")||codons[i].equals("CAC")){
      		 finalsolution [i] = "H";
      		
      	  }
     		else  if( codons[i].equals("CAA")||codons[i].equals("CAG")){
       		 finalsolution [i] = "Q";
       		
       	  }
     		else  if( codons[i].equals("CGU")||codons[i].equals("CGC") ||codons[i].equals("CGA")||codons[i].equals("CGG")){
       		 finalsolution [i] = "R";
       		
       	  }
     		else	  if( codons[i].equals("ACU")||codons[i].equals("ACC") ||codons[i].equals("ACA")||codons[i].equals("ACG")){
       		 finalsolution [i] = "T";
       		
       	  }
     		else	  if( codons[i].equals("AUU")||codons[i].equals("AUC")||codons[i].equals("AUA")){
        		 finalsolution [i] = "I";
        		
          }
     		else  if( codons[i].equals("AUG")){
     		 finalsolution [i] = "M";
     		
     		
          }
     		else  if( codons[i].equals("AAU")||codons[i].equals("AAC")){
        		 finalsolution [i] = "N";
        		
          }
     		else  if( codons[i].equals("AAA")||codons[i].equals("AAG")){
     		 finalsolution [i] = "K";
     		
       }
     		else  if( codons[i].equals("AGU")||codons[i].equals("AGC")){
     		 finalsolution [i] = "S";
     		
       }
     		else if( codons[i].equals("AGA")||codons[i].equals("AGG")){
     		 finalsolution [i] = "R";
     		
       }
     		else  if( codons[i].equals("GUU")||codons[i].equals("GUC") ||codons[i].equals("GUA")||codons[i].equals("GUG")){
        		 finalsolution [i] = "V";
        		
        }
     		else  if( codons[i].equals("GCU")||codons[i].equals("GCC") ||codons[i].equals("GCA")||codons[i].equals("GCG")){
     		 finalsolution [i] = "A";
     		
     }
     		else  if( codons[i].equals("GGG")||codons[i].equals("GGA") ||codons[i].equals("GGC")||codons[i].equals("GGU")){
      		 finalsolution [i] = "G";
      		
      }
     		else  if( codons[i].equals("GAU")||codons[i].equals("GAC")){
      		 finalsolution [i] = "D";
      		
        }
     		else if( codons[i].equals("GAA")||codons[i].equals("GAG")){
      		 finalsolution [i] = "E";
      		
        }
     		
    	  
      }
      for(int i1=0; i1<codons.length; i1++){
	    	  System.out.print(finalsolution[i1]);
		  }
	}
}
    	     
      
     

       
      


