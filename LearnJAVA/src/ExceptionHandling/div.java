package ExceptionHandling;

public class div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			System.out.println("A");
			int i = 1/0;
			System.out.println(i);
			System.out.println("B");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("C");
	}

}
