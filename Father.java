
public class Father extends GrandFather{//Father class (derived class) extending GrandFather class (base class)
	@Override
	public void name() {//overrides name method from GrandFather class
		String name="Nakul";
		System.out.println("father Name: "+name);
	}
	@Override
	public void property() {//overrides property method from GrandFather class
		System.out.println("father property: Residential property");
	}
	@Override
	public void physicalApperance(double height,double weight) {//overrides physicalApperance method from GrandFather class
		System.out.println("father physical apperance: Overweight");
		System.out.println("Height: "+height+"ft"+"\nWeight: "+weight+"kg");
	}
	public void nature() {
		System.out.println("father nature: Trusting");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father father=new Father();
		father.name();
		father.property();
		father.physicalApperance(5.8, 75.9);
		father.nature();
	}

}
