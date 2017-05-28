
public class Inheritance_MobilePhone extends InheritanceExample_Phone{

	public void roaming(){
		System.out.println("I am in MobilePhone -> Roaming");
	}
	
	//Over riding the parent's call function.
	public void call(){
		System.out.println("I am in MobilePhone -> Call");
	}


}
