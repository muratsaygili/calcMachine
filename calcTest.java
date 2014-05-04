package calcMachine;

import java.util.Scanner;

public class calcTest {


	public static void main(String[] args) 
	{
		double a,b;
		int secim;
		Scanner scan=new Scanner(System.in);
		calc c1=new calc();
		do
		{			
		System.out.println("Enter first integer:");
		a=scan.nextInt();
		System.out.println("Enter second integer:");
		b=scan.nextInt();
		
		
		System.out.println("Make your choice:");
		System.out.println("1-Summation");
		System.out.println("2-Removal");
		System.out.println("3-Multiplication");
		System.out.println("4-Splitting process");
		System.out.println("5-Exit");
		
		secim=scan.nextInt();

			
		if(secim==1)
		{

			c1.goster(c1.toplama(a, b));
		}
		else if(secim==2)
		{

			c1.goster(c1.cikarma(a, b));
		}
		else if(secim==3)
		{
			c1.goster(c1.carpma(a, b));
		}
		else if(secim==4)
		{
			c1.goster(c1.bolme(a, b));
		}
		else if(secim==5)
		{
			System.out.println("Bye !!");
			secim=-1;
		}
		else
			System.out.println("Uncorrect choice !! Please try again..");
		
		} while (secim!=-1 );
	}
}
