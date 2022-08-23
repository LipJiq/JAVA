import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double payment;
		double wage = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much they pay you?");
		double pay = input.nextDouble();
		
		
		System.out.println("What is your score?");
		double score = input.nextDouble();
		
		
		
		if (score > 90) {
			
			payment = pay*3/100;
			wage = payment + pay;
			
		}
		else  {
			payment = pay*1/100;
			wage = payment + pay;
			
		}
			
		System.out.println(" Your new pay will be " + wage );

	}

}
