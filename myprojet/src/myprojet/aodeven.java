package myprojet;

import java.util.Scanner;

public class aodeven {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int i=obj.nextInt();
		while(i<=10){
			if(i%2==1) {
        	 System.out.println(i);
         }
			
		}
		i++;
	}
}