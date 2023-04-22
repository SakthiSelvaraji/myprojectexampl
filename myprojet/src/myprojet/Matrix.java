package myprojet;

public class Matrix {

	public static void main(String[] args) {
		int a[][]= {{2,3},{3,4}};
		int b[][]= {{4,8},{5,6}};
	    int c[][]=new int [2][2];
   
    for(int i=0;i<2;i++)
    {   
	for(int j=0;j<2;j++)
	{   
		 c[i][j]=a[i][j]+b[i][j];
		 System.out.print(c[i][j]+"\t");
	}
	System.out.println();
}
   }
}
