package scanner;

import java.util.Scanner;

public class A
{
 public static void main(String[]args)
 {
	 int a;
	 System.out.println("Enter the value of A=");
	 Scanner s=new Scanner(System.in);
	 a=s.nextInt();
	 if(a%2==0)
	 {
		 System.out.println("no is even");
	 }
	 else
	 {
		 System.out.println("no is odd");
	 }
 }
}
