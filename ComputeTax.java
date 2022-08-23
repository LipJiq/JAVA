import java.util.Scanner;
public class ComputeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		int tax = 0;
		int temp1 = 0;
		
		System.out.println(" (0-single filer, 1-married jointly or qualifying widow(er),\r\n"
				+ "2-married separately, 3-head of household)");
		
		System.out.println("Enter the filing status: ");
		int status = input.nextInt();
		
		if (status == 0) {
			System.out.println("Enter the taxable income");
			int income = input.nextInt();
			
			if(income >=0 || income <= 8350) {
				tax = (int)(income*0.1);
				income = tax + income;			
			}
			else if (income >=8351 || income <= 33950) {
				tax = (int)(income*0.15);
				income = tax + income;
			}
			else if (income >=33951 || income <= 82250) {
				tax = (int)(income*0.25);
				income = tax + income;
			}
			else if (income >=82251 || income <= 171550) {
				tax = (int)(income*0.28);
				income = tax + income;
			}
			else if (income >=171551 || income <= 372950) {
				tax = (int)(income*0.33);
				income = tax + income;
			}
			else if (income >=372951){
				tax = (int)(income*0.35);
				income = tax + income;
			}   
			
			System.out.println(" Your tax will be " + tax);
		
		}
		
	}

}
