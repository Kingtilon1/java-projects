package assignments;//Tilon Bobb 
import java.io.*;
import java.util.Scanner;
public class Assignment6 {
	/*Tilon Bobb
	 * assignment6
	 * This program calls a series of methods to do the following
	 * reads the data of two arrays of an id and the donations
	 * prints the data
	 * sorts the id  in ascending order
	 * sorts the donations in descending order
	 * prints the highest donor
	 * prints the median donor
	 */
	public static void main(String[] args)throws IOException{
		
	PrintWriter out= new PrintWriter("outsss.txt");
	int[]id= new int[50];
	double[]donation= new double[50];
	int donorcount=readData(id,donation,out);
	out.println("Original data");
	printdata(id,donation,donorcount,out);
	System.out.println();
	Sortid(id,donation,donorcount);
	out.println("Sorted id");
	printdata(id,donation,donorcount,out);
	out.println();
	Sortdonations(id,donation,donorcount,out);
	out.println("Sorted donations");
	printdata(id,donation,donorcount,out);
	higher(id,donation,donorcount,out);
	median(id,donation,donorcount,out);
	out.close();
	}
	/*Method read data
	 * Input:
	 * id,donations-references arrays to be filled
	 * Output:
	 * the filled array
	 * donorcount-number of elements in the Array
	 */
	
	public  static int readData(int[]id,double[]donation,PrintWriter out)throws IOException{
		int donorCount=0;
		Scanner infile=new Scanner(new File("inpfile.txt"));
		
		while(infile.hasNext()) {
			id[donorCount]=infile.nextInt();
			donation[donorCount]=infile.nextDouble();
		donorCount++;
		}
		infile.close();
		return donorCount;
		}
	/*Method print data
	 * Input:
	 * id,double references the arrays to be printed
	 * Output:
	 * The printed id array along with the donations 
	 */
	public static void printdata(int[]id,double[]donation,int donorcount,PrintWriter out){
		
		out.println("ID  Donation");
		for(int i=0;i<donorcount;i++) {
			out.println(id[i]+" "+donation[i]);
		}
			
			
		
	}
	
	/*Method sortid 
	 * Input:
	 * temp,temps-holds the values of arrays that has to be swapped
	 * id,double-references the arrays of the id and the donations
	 * Output:
	 * goes to main method and prints the sorted array
	 * 
	 */
	public static void Sortid(int[]id,double[]donation,int donorCount) {
		int temp;
		double temps;
		for(int pos=0; pos<(donorCount-1);pos++) 
			for(int pers=(pos+1);pers<donorCount;pers++)
				if(id[pos]>id[pers]) {
					temp=id[pos];
					temps=donation[pos];
					id[pos]=id[pers];
					donation[pos]=donation[pers];
					id[pers]=temp;
					donation[pers]=temps;
					
					
				}
			
		
	}
	/*Method Sortdonations
	 * Boolean method 
	 * 
	 */
	public static void Sortdonations(int[]id,double[]donation,int donorCount,PrintWriter out) {
		boolean swapped;
		int temps;
		double temp;
		do {
			swapped=false;
			for(int pos=0;pos<(donorCount);pos++)
				if(donation[pos]<donation[pos+1]) {
					temp=donation[pos];
					temps=id[pos];
					donation[pos]=donation[pos+1];
					id[pos]=id[pos+1];
					donation[pos+1]=temp;
					id[pos+1]=temps;
				}
			
		}while(swapped);
		
	}
	/*Method higher
	 * Input:
	 * id,donation-refrences the array of numbers for the id and donnations
	 * Output:
	 * prints the higher donor
	 */
	public static void higher(int[]id,double[]donation,int donorCount,PrintWriter out) {
		int high=id[1];
		double highs=donation[1];
		for(int x=0; x<donorCount;x++)
			if(highs<donation[x]) {
				highs=donation[x];
				high=id[x];
				out.println("Highest donor ID:"+id[x]+" Donation: "+donation[x]);
			}
		
	}
	public static void median(int[]id, double[]donation,int donorCount,PrintWriter out) {
		int bye=(id[2]-id[0])/2;
		int high=id[0];
		double highs=donation[1];
		for(int x=0; x<donorCount;x++)
			if(highs<donation[x]) {
				highs=donation[x];
				high=id[x];
				out.println("median ID:"+id[x]+" Donation: "+donation[x]);
			}
	}
}


