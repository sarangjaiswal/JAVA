
public class Inheritance_MainPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceExample_Phone p = new InheritanceExample_Phone();
		p.call();
		p.text();
		//p.color(); cannot call this function since its private
		
		System.out.println("------------------------------------");
		
		Inheritance_MobilePhone m = new Inheritance_MobilePhone();
		m.call();
		m.text();
		m.roaming();

	}

}
