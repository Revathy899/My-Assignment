package week1.day1;

public class Basics {
	public static void main(String[] args) {
		//Max range for series
		int range=8;
		int prevnum=0;
		int currentnum=1;
		int result=0;
		//Print statement to print 0,1 before initializing the loop
		System.out.println("Fibonacci Series :"+ '\n' +prevnum);
		System.out.println(currentnum);
		for (int i = 3; i <= range; i++) {
			result=prevnum+currentnum;
			System.out.println(result);
			prevnum=currentnum;
			currentnum=result;
		}
	}
}


