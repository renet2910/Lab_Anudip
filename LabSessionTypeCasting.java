
public class LabSessionTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("1. Convert all the integer type data(byte,short,int,long) to floating point(float,double) type data and vice versa");
		
		long l=785555544;
		short s=799;
		byte b=12;
		int i=773;
		
	    float f=6354.44f;
	    double d=45475.54d;
	    
	    
	    
	    System.out.println("long value: "+l);
	    System.out.println("short value: "+s);
	    System.out.println("byte value: "+b);
	    System.out.println("int value: "+i);
	    System.out.println("float value: "+f);
	    System.out.println("double value: "+d);
	    
	    //floating conversion
	    float f1=(float)i;
	    System.out.println("int to float: "+f1);
	    
	    double d1=(double)i;
	    System.out.println("int to double: "+d1);
	    
	    
	    f1=(float)b;
	    System.out.println("byte to float: "+f1);
	    
	    d1=(double)b;
	    System.out.println("byte to double: "+d1);
	    
	    f1=l;
	    System.out.println("long to float: "+f1);
	    
	    d1=(double)l;
	    System.out.println("long to double: "+d1);
	    
	    f1=(float)s;
	    System.out.println("short to float: "+f1);
	    
	    d1=(double)s;
	    System.out.println("short to double: "+d1);
	    
	    //Integer conversion
	    int i1=(int)f;
	    System.out.println("float to int: " +i1);
	    
	    byte b1=(byte)f;
	    System.out.println("float to byte: " +b1);
	    
	    short s1=(short)f;
	    System.out.println("float to short: " +s1);
	    
	    long l1=(long)f;
	    System.out.println("float to long: " +l1);
	    
	    i1=(int)d;
	    System.out.println("double to int: "+i1);
	    
	     b1=(byte)d;
	    System.out.println("double to byte: "+b1);
	    
	     s1=(short)d;
	    System.out.println("double to short: "+s1);
	    
	    l1=(long)d;
	    System.out.println("double to long: "+l1);
	    
	    	    
	    System.out.println("2. Convert the character type data into int , float and tell the difference in both");
	    char c='R';
	    System.out.println("Character: "+c);

	    int i3=(int)c;
	    System.out.println("char to int: "+i3);
	    
	    float f3=(float)c;
	    System.out.println("char to float: "+f3);
	    
	    System.out.println("The difference is int data type does'nt takes the value after decimal point");

	    System.out.println("3. Print alphabets Uppercase and lowercase using loops and casting");
	    System.out.println("Uppercase");
	    for(int m=65;m<=90;m++)
	    {
	    	System.out.print((char)m+" ");
	    }
	    
	    System.out.println();
	    System.out.println("Lowercase");
	    
	    for(int p=97;p<=122;p++)
	    {
	    	System.out.print((char)p+" ");
	    }
	    
	}

}
