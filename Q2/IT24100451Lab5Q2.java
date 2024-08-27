import java.util.Scanner;
public class IT24100451Lab5Q2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of new members introduced :");
		int num=input.nextInt();
		if (num>0){
			switch(num){
				case 0:
					System.out.println("No Price");
					break;
				case 1:
					System.out.println("Pen");
					break;
				case 2:
					System.out.println("Umbrella");
					break;
				case 3:
					System.out.println("Bag");
					break;
				case 4:
					System.out.println("Travelling Chair");
					break;
				default:
					System.out.println("Headphone");
					break;
         }
		}
		else{
			System.out.println("Input Must be 0 or greater");
		}
	}
}