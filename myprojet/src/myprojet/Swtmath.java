package myprojet;

import java.util.Scanner;

public class Swtmath {

	public static void add(int a, int b) {
		System.out.printf("the add value is " + (a+b)); 
     	}
		public static void sub(int a, int b) {
		System.out.printf("the sub value is " + (a-b));
		}
		
		public static void mul(int a, int b) { 
		System.out.printf("the multi value is " + (a*b));
		}
		public static void div(int a, int b) {
		System.out.printf("the divi value is " + (a/b)); 
		}	

	public static void operation(int a,int b,int operation) {
		
	}
	public static void main(String arg[]) {
		System.out.println("enter the 1.add number");
		System.out.println("enter the 2.sub number");
		System.out.println("enter the 3.mul number");
		System.out.println("enter the 4.dev number");
		int a,b;
		int operator;
		Scanner scanner;
		scanner =new Scanner(System.in);
		System.out.print("Enter the case: ");
	    operator = scanner.nextInt();
		System.out.println("enter the two numbers");
		a=scanner.nextInt();
		b=scanner.nextInt();
switch(operator) 
{
case 1:
	add(a,b);
	break;
case 2:
	sub(a,b);
	break;
case 3:
	mul(a,b);
	break;
case 4:
	div(a,b);
	break;
	default:
		System.out.println("no case matching");
}
		
}
}
