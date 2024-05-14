import java.util.Scanner;
public class Lab_Loops4M24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to print numbers 50 to 1 in reverse in a single line using for loop
		System.out.println("50 to 1 numbers in reverse using for loop");
		for(int i=50;i>=1;i--) //reverse
		{ 
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("===============================================================");
		System.out.println("50 to 1 numbers in reverse using while loop");
		//WAP to print numbers 50 to 1 in reverse in a single line using while loop
		int a=50;
		while(a>=1) {
			System.out.print(a+" ");
			a--;//reverse
		}
		//WAP to print numbers 50 to 1 in reverse in a single line using do while loop
		System.out.println();
		System.out.println("===============================================================");
		System.out.println("50 to 1 numbers in reverse using do while loop");
		int b=50;
		do {
			System.out.print(b+" ");
			b--;//reverse
		}while(b>=1);
		//WAP to print multiplication table of number taken by user using while loop
		System.out.println();
		System.out.println("===============================================================");
		System.out.println("Multipication table");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to print its multiplication table");
		int n=sc.nextInt(); 
		int m=1;
		while(m<=10) {
			System.out.println(n+" x "+m+" = "+n*m);//multiplication
			m++;
		}
		//WAP to print prime numbers from 1 to 100
		System.out.println("===============================================================");
		System.out.println("prime numbers from 1 to 100");
		int num = 100; // Change 'n' to the desired range
        for (int i = 2; i <= num; i++) 
        {
            Boolean isPrime = true;    
            for (int j = 2; j < i; j++) 
            {
                if (i % j == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) 
            {
                System.out.print(i + " ");
            }
        }
	}

}
