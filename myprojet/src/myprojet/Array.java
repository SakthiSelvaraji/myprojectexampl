package myprojet;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		int sum=0;
	int a[]=new int[10];
	Scanner obj=new Scanner(System.in);
    for (int i=0;i<10;i++) {
    	a[i]=obj.nextInt();
    	
    }
    for (int i=0;i<5;i++) {
    	if(a[i]%2==1) {
    		sum=sum+a[i];
    		System.out.println("od value"+a[i]);
    	}
    }
    
    for (int i=5;i<10;i++) {
    	if(a[i]%2==0) {
    		sum=sum+a[i];
    		System.out.println("even value"+a[i]);
    	}
    }
   

	
	 System.out.println(sum);
	}
	
}