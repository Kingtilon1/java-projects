package assignments;//Tilon Bobb 
import java.io.*;
import java.util.Scanner;
public class assignment5 {
	public static void main(String[]args)throws IOException{
		/*Tilon Bobb
		 * Assignment5
		 * This program calls a series of methods to do the following: 
		 * read data into two arrays
		 * print the values stored into the arrays
		 * find the smallest of the  values stored into the array
		 * construct a new array from the total of the original two arrays
		 * compare the values of the two arrays
		 */
		Scanner infile=new Scanner(new File("inputFile.txt"));
		int n= infile.nextInt();
		PrintWriter out= new PrintWriter("outputfileee.txt");

int[] sumscore=new int[50];
int[] score1=new int[50];
int[] score2=new int[50];
readData(score1,score2,n, infile,out);
out.println("Name:Tilon Bobb  Assignment#:5");
out.println();
out.println("Score 1 array ");printArray(n,score1,out);
out.println();
out.println("Score 2 array ");printArray(n,score2,out);
out.println();
out.println("The smallest in the score1 array is "+smallest(n,score1));
out.println("The smallest in the score2 array is "+smallest(n,score2));
out.println();
out.println("The sumscore array: "); construct(n,score1,score2,sumscore,out);
whatsHigher(score1,score2,n,out);
out.close();
	}
public static void readData(int[] nums1, int[]nums2,int n,Scanner infile,PrintWriter out)throws IOException{
	/*Method readData
	 * Input:
	 * int nums1 and nums2-references the elements in the array to be filled and sent to score1 and score2
	 * int n-references the elements in the input file array
	 * Process:
	 * reads n and reads n values into the arrays
	 * Output:
	 * both array nums1 and nums2 is filled
	 */
	int size=nums1.length;//size of the array
	if(n<=0||n>size)
		System.out.println("invalid, please try again");
	else {

		for(int count=0; count<n; count++) {
			nums1[count]=infile.nextInt();
			nums2[count]=infile.nextInt();
			out.println(nums1[count]+" "+nums2[count]);
		}
		
	}
	
}
public static void printArray(int lim, int[]vals,PrintWriter out) {
	/*Method printArray
	 * Input:
	 * lim-references the elements in the n array
	 * vals-references the elements in a separate array and is applied to both score1 and score2 array
	 * Output:
	 * Prints the the values of the elements in the array score1 and score2
	 */
	for(int count=0;count<lim;count++) {
		out.println("["+count+"]= "+vals[count]);
		
	}
}
public static int smallest(int num, int[]arr) {
	/*
	 * input:
	 * num-references number of elements in the array
	 * small-hold the value of the smallest integer
	 * Output:
	 * Method finds the smallest element in the array
	 */
	int small;
	small=arr[0];
	for(int count=1;count<num;count++) {
		if(small>arr[count])
			small=arr[count];
	}
		return small;
	
	
}
public static void construct(int k, int[]old1,int[]old2,int[]sumarr,PrintWriter out){
	/*method construct
	 * input:
	 * k-the number of elements  in the array
	 * old1 and old2-the array of score1 and score2
	 * Output:
	 * adds the total of  each array element in score1 and 2 and assigns them to each element in sumarr[]
	 */
	int count;
	
	for(count=0;count<k;count++){
		sumarr[count]+=old1[count]+old2[count];
		out.println("["+count+"]= "+sumarr[count]);
	}
	
	
}
public static void whatsHigher(int[]score1, int[]score2, int n,PrintWriter out) {
	/*Method whatsHigher
	 * input:
	 * n-the number of elements in the array
	 * score1 and score2-array  of score1 and score2 in the main
	 * Output:
	 * counts how many times score1 and score2 above, below and equal to each other
	 * compares the two arrays and compares which is higher
	 */
	int first, second, equal;
	first=second=equal=0;
	for(int count=0;count<n;count++) {
		if(score1[count]>score2[count]) {
			out.println("In position "+count+" the higher value is in array score1: "+score1[count]+" is higher than "+score2[count]);
			first++;
		}
		 else if(score2[count]>score1[count]) {
			out.println("In position "+count+" the higher value is in array score2: "+score2[count]+" is higher than "+score1[count]);
		second++;
		 }
		 else
			 out.println("In position "+count+" the value is even in both arrays "+score1[count]);
		equal++;
		}
	out.println();
	out.println("Array score1 was higher "+first+" time(s)");
	out.println();
	out.println("Array score2 was higher "+second+" time(s)");
	out.println();
	out.println("The two arrays were equal "+equal+" time(s)");
}
	
}

