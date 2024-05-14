import java.util.Scanner;

public class LabSession2M24 {
	public static void patterns(){
		//for increasing pattern
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(
						"*"+" ");
			}System.out.println();
		}
		//for decreasing pattern
		System.out.println("------------------------");
		for (int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(
						"*"+" ");
			}System.out.println();
		}
	}
	//alphabets
	public static void alphabets() {
		System.out.println("small alphabets");
	    for(int i=97;i<=122;i++)//for small alphabets
	    {
	    	System.out.print((char)i+" ");
	    }
	    
	    System.out.println();
	    System.out.println("capital alphabets");
	    
	    for(int j=65;j<=90;j++)//for capital alphabets
	    {
	    	System.out.print((char)j+" ");
	    }
	    System.out.println();
	}
	public static void multiplication() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for which you want to get multiplication table");
		int n=sc.nextInt();
		for(int m=1;m<=10;m++)
		{
			System.out.println(n + " x " + m + " = " + n*m);
		}
	}
	public static void LogicalOperation() {
		Scanner s=new Scanner(System.in);
		String greet=s.next();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LabSession2M24.patterns();
		System.out.println("===========================================");
		LabSession2M24.alphabets();
		System.out.println("===========================================");
		LabSession2M24.multiplication();
		
	}

}
