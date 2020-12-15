package assignments;
import java.io.*;
import java.util.Scanner;
public class assignment7 {
	/*Tilon Bobb
	 * assignment7
	 * This program calls a series of methods to do the following
	 * reads Strings from a separate file
	 * breaks the String into its date the month and the two digit year
	 * sends Strings into method which prints the European, American and the full way of printing.
	 */
	public static void main(String[] args)throws IOException{
		Scanner infile=new Scanner(new File("lastinp.txt"));
		PrintWriter out=new PrintWriter("theoutput.txt");
		String[] data=new String[50];
		out.println("Name:Tilon Bobb  Assignment#:7");
		out.println();

		while(infile.hasNext()) {
			String line=readOriginalDate(infile,out);
			out.println(line+" is the original date");
			breakOriginalDate(infile,line,out);
			String x[]=line.split("/");
			String month=x[0];
			String day = x[1];
			String year = x[2];
			printedate3ways(infile,line,month,day,year,out);
		}
			
		infile.close();
		out.close();
	}
	/*Method readOriginalDate
	 * Input:
	 * infile-references Strings in separate file
	 * Output:
	 * String line receives dates from infile
	 */
	public static String readOriginalDate(Scanner infile,PrintWriter out ) {
		
		String line=infile.nextLine();
		
		return line;
	}
	/*Method breakOriginalDate
	 * Input:
	 * infile-holds Strings in separate file
	 * String x[]-references element in the array prior to the"/"
	 * String line-references Strings in separate file
	 * Output:
	 * Month, day, and year is assigned and printed in separate arrays
	 * 
	 */
	public static void breakOriginalDate(Scanner infile,String line,PrintWriter out) {
		String x[]=line.split("/");
		out.println(x[0]+" is the month   "+x[1]+" is the day   " +x[2]+" is the year");
		
		
		
	}
	/*Method printeddate3ways
	 * Input:
	 * month,day,year-references the month,day,year  String
	 * int pos-references String Builderclass and  finds the position of the first occurrence of a "/"
	 * int secpos-references String Builderclass and  finds the position of the last occurrence of a "/"
	 * String line-references Strings in separate file
	 * Output:
	 *Method finds  the first and last  instance of slashes and replaces them with a 
	 * to create the European style of printing
	 * It then has a switch statement that replaces numerical instances for the
	 *  month and replaces it with its worded form
	 *  a replace method is used to insert  "20" before each year
	 *  This is the  American way of printing
	 *  Another switch statement is made to turn every worded month into a digit
	 *  This is called the full way of printing.
	 */
	public static void printedate3ways(Scanner infile,String line, String month, String day, String year,PrintWriter out) {
		StringBuilder mymsg=new StringBuilder(line);
		int pos=mymsg.indexOf("/");
		int secpos=mymsg.lastIndexOf("/");
		mymsg.replace(pos,pos+1,"-");
		mymsg.replace(secpos,secpos+1,"-");
		out.println(mymsg+" is the European way of printing");
		mymsg.replace(secpos+1,secpos+1,"20");
		int num=Integer.parseInt(month);
		switch(num) {
		case 1:
		month="January";
		break;
		case 2:
			month="February";
			break;
		case 3:
			month="March";
			break;
		case 4:
			month="April";
			break;
		case 5:
			month="May";
			break;
		case 6:
			month="June";
			break;
		case 7:
			month="July";
			break;
		case 8:
			month="August";
			break;
		case 9:
			month="September";
			break;
		case 10:
			month="October";
			break;
		case 11:
			month="November";
			break;
		default:
			month="December";
			break;
		
					}
		int nums=Integer.parseInt(year);
		int yo=nums+2000;
		out.println(month+" "+day+" "+yo+" is the American way of printing");
		
		
		switch(month) {
		case "January":
		month="01";
		break;
		case "February":
			month="01";
			break;
		case "March":
			month="3";
			break;
		case "April":
			month="4";
			break;
		case "May":
			month="5";
			break;
		case "June":
			month="6";
			break;
		case "July":
			month="7";
			break;
		case "August":
			month="8";
			break;
		case "September":
			month="9";
			break;
		case "October":
			month="10";
			break;
		case "November":
			month="11";
			break;
		default:
			month="12";
			break;
		
					}
		out.println(month+"-"+day+"-"+yo+" is the full way of printing");
		out.println();
		
		
		
	
	}
}
