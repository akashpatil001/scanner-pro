package scanner;

import java.util.Scanner;

public class A2 
{
  public static void main(String[] args) 
  {
	int a;
	int b;
	int c;
	System.out.println("the first no. A=");
	System.out.println("the first no. B=");
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	
	c=a;
	a=b;
	b=c;
	System.out.println("the no.after swapping= " + "A="+a   +" B="+b);
	
	
  }
}
