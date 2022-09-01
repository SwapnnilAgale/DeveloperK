import java.util.*;
public class InputFromUser

{

public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter first Number : ");
int a=sc.nextInt();
System.out.println("Enter Second Number: ");
int b=sc.nextInt();
System.out.println("Enter third Number: ");
int c=sc.nextInt();

int d=a+b+c;
System.out.println("Output for the above addition is: "+d);

Scanner st=new Scanner(System.in);
String str=st.nextLine();
System.out.println("Provide Your String Here :");
System.out.println(str);

}



}



