package myprojet;

import java.util.Scanner;

public class Remindre {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int j=s.nextInt();
		while(i<=j) {
			if(i%2==0) {
				System.out.println(i);
				
			}
			i++;
		}
System.out.println(0);
	}

}
