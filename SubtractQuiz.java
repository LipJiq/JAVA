import java.util.Scanner;
public class SubtractQuiz {
/*ms188*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int i = 0;
		int j = 0;
		
		while(i <= 4 ) {
			int random1 = (int)(Math.random()*10);
			int random2 = (int)(Math.random()*10);
			
			i++;
			
			System.out.println(" What is " + random1 + "-" + random2);
			int answer = input.nextInt();
			
			if(random1 - random2 == answer) {
				j++;
				System.out.println(" Correct answer ");
				System.out.println("");
			}
			else if (random1 - random2 != answer) {
				
				System.out.println(" Wrong answer ");
				System.out.println(" It should be " + (random1 - random2));
				System.out.println("");
			}
		}
		
		System.out.println(" You got " + j + "/" + "5");
		

	}

}
