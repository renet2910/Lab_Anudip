
public class LabSession3M24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a=5,b=4,c=7,largest,smallest;
		if( a >= b && a >= c) {
		    largest = a;
			System.out.println("Largest number: "+largest);
		    }
		else if( b >= a && b >=c) {
		    largest = b;
			System.out.println("Largest number: "+largest);
		    }
		else {
		    largest =c;
			System.out.println("Largest number: "+largest);
		}
		if( a <= b && a <= c) {
		    smallest = a;
			System.out.println("Smallest number: "+smallest
					);
		    }
		else if( b <= a && b <=c) {
		    smallest = b;
			System.out.println("Smallest number: "+smallest);
		    }
		else {
		    smallest =c;
			System.out.println("Smallest number: "+smallest);
		}
		System.out.println("Average of "+a+" "+b+" "+c);
		double average=(a+b+c)/3;
		System.out.println(average);
		System.out.println("Squares of number from 1 to 10");
		for(int i=1;i<=10;i++)
		{
			System.out.println("Sqaure of "+i+" = "+(i*i));
		}
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.println("odd number: "+i);
			}
		}
	}
}
