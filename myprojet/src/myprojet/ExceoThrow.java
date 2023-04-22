package myprojet;

public class ExceoThrow {

	public static void main(String[] args) {
		  
		try {
			ExceoThrow obj=new ExceoThrow();
			obj.div();
		}
		catch(Exception e) {
			System.out.println("plz check the divient value");
		}
		System.out.println("other lines");
	}
		void div() throws Exception {
        {
	         int a=10,b=2;
			System.out.println(a/b);
}
}
}