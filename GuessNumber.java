import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*page 187*/
		Scanner input = new Scanner(System.in);
		
		int random1 = (int)(Math.random()*10);
		int answer = 100000000;
	
		
	
		while (answer != random1) {
			
			System.out.println(" Guess the number ");
		    answer = input.nextInt();
			
			if(answer < random1) 
				System.out.println(" Higher "); 
			else if(answer > random1) 
				System.out.println(" Lower ");
				
		}
		
		System.out.println("Correct");
			
	}

}
