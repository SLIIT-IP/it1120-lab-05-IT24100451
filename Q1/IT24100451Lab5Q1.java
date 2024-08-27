import java.util.Scanner;
public class IT24100451Lab5Q1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first integer :");
		int num1=input.nextInt();
		System.out.print("Enter the secound integer :");
		int num2=input.nextInt();
		System.out.print("Enter the third integer :");
		int num3=input.nextInt();
		System.out.println("The user entered numbers are : "+num1+" "+num2+" "+num3);
		int min=num1;
		int max=num1;
		if (max<num2){
			max=num2;
		}
		else if (max<num3){
			max=num3;
		}
		if (min>num2){
			min=num2;
		  }
		else if (min>num3){
			min=num3;
		  }
		System.out.println("The Smallest number :"+min);
		System.out.println("The Largest number :"+max);
	}
}