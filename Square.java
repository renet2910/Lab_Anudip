
public class Square extends Shape{//Square(derived class) class extends Shape class(base class)
	@Override
	public void details(String color) {//overrides details method from shape class
		double side=8;
		 super.details(color);//calling details method from shape class(base class)
	        System.out.println("Square \nside of square: " + side+"\nArea: "+side*side);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square();
		sq.details("Pink");//calling details method of square class

	}

}
