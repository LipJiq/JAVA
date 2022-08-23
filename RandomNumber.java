import java.lang.Math;
import java.util.Scanner;
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		int x = (int) (Math.random()*10);
		int y = (int) (Math.random()*10);
		
		System.out.println(x + "and" + y);
		System.out.println(" What is the answer for " + x + "-" + y);
		
		int answer = input.nextInt();
		
		if ( x-y == answer)
			System.out.println(" Your answer is correct :) ");
		else
			System.out.println(" Your answer is wrong :( ");
			
	
	}

}
