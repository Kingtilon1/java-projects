package assignments;
import java.util.Scanner;
import java.io.*;
public class assignment4 {

	public static void main(String[] args) throws IOException {
		int invalid=0; 
		int valid=0;
		int totaleval=0;
		PrintWriter out=new PrintWriter("outputssfile.txt");
		Scanner scan=new Scanner(System.in);
		int  x, y, z;
		System.out.println("Please type  in an integer value to continue, enter  -1 to stop");
		x=scan.nextInt();
		while(x!=-1) {
	    totaleval++;
		System.out.println("Please type in another integer value");
		y=scan.nextInt();
		System.out.println("Please type in the last integer value");
		z=scan.nextInt();
        out.println("is it a valid group?: "+isitavalidgroup(out,x,y,z));
		if(isitavalidgroup(out,x,y,z)) {
			classify(out,x,y,z);
			valid++;
		}
		else {
			invalid++;
		}
		totaleval++;
		System.out.println("Please type  in an integer value, enter  -1 to stop");
		x=scan.nextInt();
		}
		out.println("invalid groups: "+invalid);
		out.println("valid groups: "+valid);
		out.println("total groups evaluated: "+totaleval);
		out.flush();
		out.close();
			
					}
	public static boolean isitavalidgroup(PrintWriter out, int x, int y, int z) {
		boolean first =(200 <= x && x <= 800&& x % 10 ==0);
		boolean second =(200 <= y && y <= 800&& y % 10 ==0);
		boolean third =(200 <= z && z <= 800&& z % 10 ==0);
		if(first && second && third) {
			System.out.println("group is valid");
		return true;
		}
		else {
			if((200 > x || x > 800 || x % 10!=0))
				out.println("invalid score: "+x);
			if((200 > y || y > 800 || y % 10!=0))
				out.println("invalid score: "+y);
			
			if((200 > z || z > 800 || z % 10!=0))
				out.println("invalid score: "+z);
			return false;
		}
	 
		
		
		
		
	}
	public static void classify(PrintWriter out, int x, int y, int z) {
		int totalscore=findtotalscore(x,y,z);
		out.println("Total score is "+totalscore);
		rateonescore(out,x);
		rateonescore(out,y);
		rateonescore(out,z);
		ratethegroup(out,x,y,z);
		
	}
	public static int rateonescore(PrintWriter out, int score) {
		if(score<500)
			out.println(score+" is less than 500");
		else if(score>=500&&score<800)
			out.println(score+ " is more than 500 but less than 800");
		else if(score==800)
			out.println(score+" is a perfect score. Congrats");
		return score;
		
	}
	public static void ratethegroup (PrintWriter out, int x, int y, int z) {
		int  total=findtotalscore(x,y,z);  
		if(total>=2100 && x>=700 &&  y>=700 &&  z>=700)
			out.println("Group status: outstanding");
		else if(total>=2100 && (x+y>=1400) || (x+z>=1400)||(y+z>=1400))
			out.println("Group status: very good");
		else if(total>=2100 && x>=700 || y>=700 || z>=700)
			out.println("Group status: lop-sided");
		else if(total<2100 && x<500 && y<500 && z <500)
			out.println("Group status: weak");
		else 
			out.println("Group status erratic");
		
		
	}
	public static int findtotalscore( int x, int y, int  z) {
		int totalscore= x+y+z;
		return totalscore;
	}

}
