package myprojet;
import java.util.*;
public class Split {
     

		public static void main(String arg[]) {
			Scanner obj=new Scanner(System.in);
			String a=obj.nextLine();
      	    String []array=a.split("\\s+");
      	    String b=a.replaceAll("\\s+"," ");
      	    for(String word:array) {
      	    	System.out.println(word);
      	    }
      	  System.out.println(b.length());
      	  int vowels=0;
     	 int len=a.length();
     	 for(int i=0;i<len;i++) {
     		 if(a.charAt(i)=='a'|| a.charAt(i)=='e'|| a.charAt(i)=='i'|| a.charAt(i)=='o'|| a.charAt(i)=='u') {
     		 vowels++;
     		 }	
       }
     	System.out.println(vowels);
     	
        	 }
}
