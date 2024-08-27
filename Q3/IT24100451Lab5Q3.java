import java.util.Scanner;
public class IT24100451Lab5Q3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		final double perDayPrice=48000.00;
		final int discount10=3;
		final int discount20=5;
		final double discount10Percent=0.10;
		final double discount20Percent=0.20;
		System.out.print("Enter Start Date(1-31): ");
		int startDate=input.nextInt();
		System.out.print("Enter End Date(1-31): ");
		int endDate=input.nextInt();
		if(startDate<1 || startDate>31 || endDate<1 || endDate>31){
			System.out.println("Error : Start date and end date cannot be less than 1 or greater than 31.");}
		else{
			if(startDate<endDate){
				int reservedDays=endDate-startDate;
				double discount=0.0;
				if(reservedDays>=discount10){
				discount=discount10Percent;
				}
				if(reservedDays>=discount20){
					discount=discount20Percent;
				}
				double totalAmount=reservedDays*perDayPrice*(1-discount);
				System.out.println("Room Charge Per Day : "+perDayPrice);
				System.out.println("Number of Days : "+reservedDays);
				System.out.println("Total Amount to be Paid : "+totalAmount);}
			else{
				System.out.println("Error : Start date must be less than End date.");
			}
		}
	}
}