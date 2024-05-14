
public class LabSession2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1) Write a program to print months name using switch case
		
		int months=6;
		System.out.println("Month number: "+months);
		System.out.print("Month name: ");
		switch(months){
			case 1 : System.out.print("January");
			break;
			case 2 : System.out.print("February");
			break;
			case 3 : System.out.print("March");
			break;
			case 4 : System.out.print("April");
			break;
			case 5 : System.out.print("May");
			break;
			case 6 : System.out.print("June");
			break;
			case 7 : System.out.print("July");
			break;
			case 8 : System.out.print("August");
			break;
			case 9 : System.out.print("September");
			break;
			case 10 : System.out.print("October");
			break;
			case 11 : System.out.print("November");
			break;
			case 12 : System.out.print("December");
			break;
			default: System.out.print("Invalid month number");
		}
		System.out.println();
		System.out.println();
		//2) write a program to print table of 42
		System.out.println("Table of 42");
		int i=42;
		for(i=1;i<=10;i++)
		{
			System.out.println(42 + " x " + i + " = " + 42*i);
		}
	//3) write a program to check grades of student based on marks
		//(create marks object and check using if else)
		System.out.println();
		
		int marks=34;
		System.out.println("Student's mark: "+marks);
		if(marks>=80)
        {
            System.out.print("Grade A");
        }
        else if(marks>=60 && marks<80)
        {
           System.out.print("Grade B");
        } 
        else if(marks>=40 && marks<60)
        {
            System.out.print("Grade C");
        }
        else
        {
            System.out.print("Grade D");
        }
		System.out.println();
		//4) Write numbers from 1 to 20, if number is 10 skip the number. 
		//and if number is 15 break the loop
		System.out.println();
		System.out.println("4th Question answer:");
		for(int a=1;a<=20;a++)
		{
			if(a==10) {
			continue;//skip 10
			}
			System.out.println(a);
			if(a==15) {
				break;// break loop at 15
				}
			
		}
	//5)Print capital and small alphabets 
		System.out.println();
		System.out.println("capital and small alphabets");
		for(int j=65;j<=90;j++)
		{
			System.out.print((char)j+" ");
		}
		System.out.println();
		for(int k=97;k<=122;k++)
		{
			System.out.print((char)k+" ");
		}
	}

}
