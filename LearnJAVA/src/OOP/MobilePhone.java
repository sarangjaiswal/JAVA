package OOP;

public abstract class MobilePhone implements Phone{
	
	@Override
	public void call(){
		System.out.println("Abstract Class Mobile Phone -> Call");
	}
	
	@Override
	public void text(){
		System.out.println("Abstract Class Mobile Phone -> Text");
	}	
}
