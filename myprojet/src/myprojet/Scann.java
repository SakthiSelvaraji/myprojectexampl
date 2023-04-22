package myprojet;

import java.util.ArrayList;
import java.util.Scanner;

public class Scann {
		int classno;
		String name;
		String fathername;
		String Address;
		int phonenumber;
		public static void main(String args[]) {
			Scann objj;
			
			ArrayList<Scann>obj=new ArrayList<>();
			Scanner input=new Scanner(System.in);
			System.out.println("Enter 5 student details");
			for(int i=0;i<5;i++) {
			System.out.println("Enter the input");
			objj = new Scann();
			objj.classno=input.nextInt();
		    objj.name=input.next();
		    objj.fathername=input.next();
		    objj.Address=input.next();
		    objj.phonenumber=input.nextInt();
			obj.add(objj);
			}
			for(Scann eachId:obj) {
				System.out.println(eachId.classno+""+eachId.name+""+eachId.fathername+""+eachId.Address+""+eachId.phonenumber	);
			}
		}
		

	}


