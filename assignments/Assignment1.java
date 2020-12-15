package practice1; /*I love java!! TilonBobb*/
// program#2
public class Assignment1 {
// This program evaluates the  formula using numbers -3to 3
	public static void main(String[] args) {
		double x,y;
	System.out.println("Tilon Bobb and this is program number 1");
	System.out.println();
		for(x=-3;x<=3;x+=.5) {
			
		y= (4 *  Math.pow(x, 3) + 8 * Math.pow(x, 2)-31*x-35)/(Math.sqrt(3* Math.pow(x, 2) +1) +2* Math.abs(x-1.5));
		System.out.printf(" x = %3.1f",x);
		System.out.printf(" y = %3.4f",y);
		if (y==0) {
			System.out.println(" Y IS ZERO");
		}
		else if (y>=0) {
			System.out.println(" Y IS POSITIVE");
		}
		else {
			System.out.println(" Y IS NEGATIVE");
	}
		}
		System.out.println("Program is finished"); 
}
}
