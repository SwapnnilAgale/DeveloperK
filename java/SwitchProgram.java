import java.util.Scanner;
public class SwitchProgram {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("1. Check even Number:  ");
	System.out.println("2. Check even Odd:  ");
	System.out.println("Enter your choice");
	
	int ch=sc.nextInt();
	
	switch(ch)
	{
	case 1:
		System.out.println("check even");
		int a=sc.nextInt();
		if(a%2==0)
			System.out.println("Number is Even");
		break;
	case 2:
		System.out.println("check Odd");
		int b=sc.nextInt();
		if(b%2!=0)
			System.out.println("Number is Odd");
		break;
	}
}
}
