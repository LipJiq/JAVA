import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		
		double bmi;
		
		System.out.println("PLease enter your weight");
		double weight=input.nextDouble();
		
		System.out.println("Please enter your height");
		double height=input.nextDouble();
		
		bmi = weight/(height*height);
		System.out.println(bmi);
		if (bmi<18.5)
			System.out.println("UNDERWEIGHT");
		else if (bmi >= 18.6 || bmi <= 24.9)
			System.out.println("NORMAL");
		else if (bmi >= 25 || bmi <= 29.9)
			System.out.println("OVERWEIGHT");
		else if (bmi >= 30 || bmi <= 34.9)
			System.out.println("OBESE");
		else if (bmi > 35)
			System.out.println("EXTREMELY OBESE");
		else 
			System.out.println("Betul2 la");
		

	}

}
