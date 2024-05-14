//inheritance example
public class Rectangle extends Shape{//Rectangle(derived class) class extends Shape class(base class)
	@Override
	public void details(String color) {//overrides details method from shape class
		double height=5,width=8;
		 super.details(color);//calling details method from shape class(base class)
	        System.out.print("Rectangle \nHeight: " + height+"\nWidth: " + width +"\nArea: "+width*height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle();
		rect.details("Blue");//calling details method of Rectangle class
	}

}
