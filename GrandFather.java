//inheritance example
//1. Create a class called circle . It contains: Two instance variables: radius (of the type double) and color (of the type String).One public methods: getArea(),simple Constructor  with default value of 1.0 and "red", and parameterized constructor.


public class GrandFather {//GrandFather super class
	public void name() {
		String name="Arjun";
		System.out.println("Grandfather Name: "+name);
	}
	public void property() {
		System.out.println("Grandfather property: No property");
	}
	public void physicalApperance(double height,double weight) {
		System.out.println("Grandfather physical Apperance: Overweight");
		System.out.println("Height: "+height+"ft"+"\nWeight: "+weight+"kg");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandFather grand=new GrandFather();
		grand.name();
		grand.property();
		grand.physicalApperance(5.5, 80.8);

	}

}
