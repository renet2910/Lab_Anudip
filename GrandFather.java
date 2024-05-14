//inheritance example
//2. Create a class GrandFather with methods name, property , physicalApperance. describe each properties of Grandfather in the class properly in the main method
// create Father class extending GrandFather and decribe each properties of father deriving from Grandfather(use Override annotation) in the main method 
//create Son class extending Father and decribe each properties of a Son deriving from Father(use Override annotation) in the main method 

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
