package assignments;//Tilon Bobb
import  java.util.Scanner;//program#2
 
public class assignment2 {
//This program reads in the id,the sales,rejections,and quotas of salesmen and calculates sales percentage- 
	//calculates bonus and compares the sales to the quota to see if you reached or missed the quota
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Tilon Bobb and this is assignment 2 ");
		System.out.println();
		double id,bought,didnt,quota;
		int count=0;
		System.out.println("Please enter id");
		id=scan.nextDouble();
		while(id!=-1) {
			System.out.println("How many people bought?");
			bought=scan.nextDouble();
			System.out.println("How many people didn't?");
			didnt=scan.nextDouble();
			System.out.println("Please write the  quota.");
			quota=scan.nextDouble();
			double  total =bought+didnt;
			System.out.println("id "+id);
			
			System.out.println(bought+" bought "+ didnt+" didn't");
			
			System.out.println("quota  "+quota);
		
			System.out.println("total customers  "+total);
			
			double more=quota-bought;
			if(bought<quota) {
				System.out.println(more +" below quota, try  harder.");
				
			}
			else {
				System.out.println("Made quota, congratulations");
				
			}
			double percent= bought/total;
			System.out.printf("sales percentage is %.3f\n",percent);
		
			double bonus= (bought+bought)-didnt;
			if(bonus>0) {
				System.out.println("bonus = "+bonus);
				System.out.println();
			}
			else {
				System.out.println("bonus = 0");
				
			}
			if(bought>didnt) {
				System.out.println("More bought than didn't ");
			}
			else {
				System.out.println("more didnt buy");
			}
			System.out.println();
			System.out.println();
			count++;
			System.out.println("Please enter id");
			id=scan.nextDouble();
			
	}
		System.out.println("We have processed a total of "+count+" employees");
		scan.close();

}
 }