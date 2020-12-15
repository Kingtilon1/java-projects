package assignments;//Tilon Bobb
import java.util.Scanner;//program number 3
import java.io.*;
public class assignment3 {
 public static void main(String[] args)throws IOException {
	 PrintWriter out = new PrintWriter("outputfile.txt");
		Scanner scan=new Scanner(System.in);
		int n;
	 printintroduction(out);
		System.out.println("Please enter an integer value(Enter -1 to stop)");
		n=scan.nextInt();
		out.println(n);
		int  count =0;
		while(n!=-1) { 
			if(iseven(n)) 
				out.println("is it even?: " +iseven(n));
			else
				out.println("is it even?: " +iseven(n));
				out.println();
			
				if(iseven(n))
				out.println("The sum of the first "+n+" even squares are "+sumEvenSquares(n));
			else
				out.println("The sum of the first "+n+" odd squares are "+sumOddNumbers(n));
			out.println();
			out.println();
			System.out.println("Please enter an integer value(Enter -1 to stop)");
			n=scan.nextInt();
			out.println(n);
			count++;
		}
		out.println("The total amount of integers processed was "+count);
		out.flush();
out.close();
	}
 
 
 
 public static boolean iseven(int x) {
	 return((x%2)==0);
	
	 
 }
 public static void printintroduction(PrintWriter out) {
	 out.println("Tilon Bobb");
	 out.println("This program #3");
	 out.println("In this program the user would be able to type in an integer. ");
	out.println(" The program will then determine whether or not the integer is even or odd then");
	 out.println("  the program will compute the sum of the first even or odd squares that was entered. ");
	 out.println(" The program will end when you enter a negative number.");
 }
 public static int sumEvenSquares(int n) {
	 int sum=0;
	 for(int i=1; i<=n; i++)
		 sum+=(2*i)*(2*i);
	 return sum;
 }
 public static int sumOddNumbers(int n) {
	 int osum=0;
	 for(int i=1; i<=n; i++)
		 osum+=(2*i-1);
		 
	 return osum;
 }
 

}
