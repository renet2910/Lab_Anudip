
public class Son extends Father {//Son class (derived class) extending Father class
	@Override
	public void name() {
		String name="Sahdev";
		System.out.println("Son Name: "+name);
	}
	@Override
	public void property() {
		System.out.println("Son Property: Commercial property");
	}
	@Override
	public void physicalApperance(double height,double weight) {
		System.out.println("Son Physical apperance: Athletic");
		System.out.println("Height: "+height+"ft"+"\nWeight: "+weight+"kg");	
	}
	@Override
	public void nature() {//overrides nature method from Father class
		System.out.println("Son nature: envious");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son=new Son();
		son.name();
		son.property();
		son.physicalApperance(5.7, 49.5);
		son.nature();

	}

}
