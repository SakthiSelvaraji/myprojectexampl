package myprojet;
import java.util.*;
public class Switch{
public static void main(String[] args) {
		int a,b;
		Scanner scanner;
		scanner =new Scanner(System.in);
		System.out.print("Enter the case: ");
		int operator = scanner.nextInt();
		System.out.println("enter the two numbers");
		a=scanner.nextInt();
		b=scanner.nextInt();
switch(operator) 
{ 
case 1: 
System.out.printf("the add value is " + (a+b)); 
break; 
case 2: 
System.out.printf("the sub value is " + (a-b)); 
break; 
case 3: 
System.out.printf("the multi value is " + (a*b)); 
break; 
case 4: 
System.out.printf("the divi value is " + (a/b)); 
break; 
default: 
System.out.printf("no case is mathching"); 
break;
}
}
}
