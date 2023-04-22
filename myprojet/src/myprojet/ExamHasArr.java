package myprojet;

import java.util.ArrayList;  
import java.util.HashMap;
import java.util.Scanner;

public class ExamHasArr {
	public static void main(String[] args) {
		HashMap<String,ArrayList<Young>>OverAll=new HashMap<>();
		ArrayList<Young>arrObj=new ArrayList<>();
		Young youObj;
		Scanner input=new Scanner(System.in);
		int n = input.nextInt(); 
		for(int i=0;i<n;i++) {
			youObj = new Young();
			youObj.id=input.nextInt();
			youObj.name=input.next();
			youObj.adress=input.next();	
			youObj.classname=input.nextInt();
			youObj.ph=input.nextInt();
			arrObj.add(youObj); 
		}
		
			for(String key: OverAll.keySet()) {
				System.out.println(key);
				ArrayList<Young>arr = OverAll.get(key);
				for(Young young:arrObj) {
					System.out.println(young.id+""+young.name+""+young.adress+""+young.classname+""+young.ph	);
				}
}
			}
	}
