import java.util.Scanner;
public class AddingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int num1;
		int sum1 = 0;
		
		do {
		System.out.println(" Enter an integer (the input ends if it is 0) : ");
		num1 = input.nextInt();
		
		sum1 += num1;
		
		} while(num1 != 0);
		
		System.out.println(" The sum is " + sum1 ); 

	}

}
