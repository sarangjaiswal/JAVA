
public class InheritanceExample_Phone implements phone{
	
	@Override
	public void call(){
		System.out.println("I am in Phone -> Call");
	}
	@Override
	public void text(){
		color();
		System.out.println("I am in Phone -> Text");
	}
	private void color(){
		System.out.println("I am in Phone -> Color");
	}
}
