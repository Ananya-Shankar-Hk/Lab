package Ananya;
import java.util.Scanner;
public class prime 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n,flag=0;
		char ch=s.nextLine().charAt(0);
		System.out.println("Enter a number");
		n=s.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				flag=1;
			break;
		}
		if(flag==0)
			System.out.println("The number is prime");
		else
			System.out.println("The number is  not prime");
			
		}
		

	}