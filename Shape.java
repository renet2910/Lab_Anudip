//Inheritance example
//3. Demonstrate the example of Single, hierarchical inheritance using shapes as a base class.
public class Shape {//super class
	public void details(String color) {
        System.out.println("Color: " + color);
        System.out.print("Shape: ");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Shape();
		shape.details(null);//calling details method of shape class

	}

}
