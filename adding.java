import java.util.Scanner;

public class adding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		
		System.out.println(" What is " + num1 + "+" + num2);
		int answer = input.nextInt();
		
		
		while(num1 + num2 != answer) {
			System.out.println(" Wrong answer. Please try again :) ");
            System.out.println(" What is " + num1 + "+" + num2);
            
            answer = input.nextInt();
            }
		
		System.out.println(" True :) ");
	}
              
}
