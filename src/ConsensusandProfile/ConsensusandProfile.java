package ConsensusandProfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConsensusandProfile {
	public static int x = 0;
	public static int y = -1;
	public static int length = 0;	
	public static int Sets = 0;
	public static void main(String[] args) throws FileNotFoundException{
	 String DataSet = new Scanner(new File("rosalind_gc.txt")).useDelimiter("\\A").next();
     String [][] Data = new String[1000][1000];
     int [][] Matrix = new int[1000][4];
     String [] FS = new String[DataSet.length()];
     int[] FN = new int[DataSet.length()];
     Scanner scan = new Scanner(System.in);
     
    
     
     
     
     
     
     
     for(int i=0; i<DataSet.length(); i++){
    	 if(DataSet.substring(i, i+1).equals(">")){
        	y++;
        	x=0;
        	length = 0;
        	Sets++;
        	
    	 }
    	 if(DataSet.substring(i, i+1).equals("A")){
    		 Data[x][y] = DataSet.substring(i, i+1);
    		 x++;
    		 length++;
    		
       	 }
    	 if(DataSet.substring(i, i+1).equals("T")){
    		 Data[x][y] = DataSet.substring(i, i+1);
    		 x++;
    		// System.out.println("T"+x+y);
    		 length++;
       	 }
    	 if(DataSet.substring(i, i+1).equals("C")){
    		 Data[x][y] = DataSet.substring(i, i+1);
    		 x++;
    		// System.out.println("C"+x+y);
    		 length++;
       	 }
    	 if(DataSet.substring(i, i+1).equals("G")){
    		 Data[x][y] = DataSet.substring(i, i+1);
    		 x++;
    		 //System.out.println("G"+x+y);
    		 length++;
       	 }
    	
     }

     	 
      
     x=0;
     y=0;
     
     for(int i=0; i<Sets*length; i++){
    	if(Data[x][y].equals("A")){
    	Matrix[x][0]++;
    
    	}
    	if(Data[x][y].equals("C")){
        	Matrix[x][1]++;
        	
        	}
    	if(Data[x][y].equals("G")){
        	Matrix[x][2]++;
        	}
    	if(Data[x][y].equals("T")){
        	Matrix[x][3]++;
        	
        	}
     	x++;
     	if(x==length){
     	
     	x=0;
     	y++;
     	}
     	
   
    	 
     }
   
     x=0;
     y=0;
     int p = 0;
     for(int i=0; i<length*4; i++){
    	 if(Matrix[x][y]>p){ 
    		 p=Matrix[x][y];
    		 FN[x]=p;
    		 if(y==0)
    			 FS[x]="A";
    		 if(y==1)
    			 FS[x]="C";
    		 if(y==2)
    			 FS[x]="G";
    		 if(y==3)
    			 FS[x]="T";
    		 //System.out.print(Matrix[x][y]);
    	 }
    	 y++;
    	 if(y==4){
    		 p=0;
    		 y=0;
    		 x++;
    	 }
    	 
     }
     for(int i=0; i<length; i++){
System.out.print(FS[i]);
     }
     x=0;
     y=0;
     System.out.println("");
     System.out.print("A: ");
     for(int i=0; i<length*4; i++){
     	 
     	System.out.print(Matrix[x][y]+" ");
     	 x++;
     	 if(x==length){
     		System.out.println("");
     		
     	    	x=0;
     	     	y++;
     	     	if(y==1)
     	     		System.out.print("C: ");
     	     	if(y==2)
     	     		System.out.print("G: ");
     	     	if(y==3)
     	     		System.out.print("T: ");
     	     	}
     	 
      }
	}
}
