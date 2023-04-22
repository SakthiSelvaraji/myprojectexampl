package myprojet;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int j=s.nextInt();
		int sum=i;
		while(i<=j) {
			if(i%2==0) {
				sum=sum+i;
        	 System.out.println(i);
         }
         i++;
		}
		System.out.println(sum);
		
		}
	}

	


