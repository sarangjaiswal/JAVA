package ExceptionHandling;

public class finalandfinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		
		try{
			System.out.println("A");
			i=1/0;
			System.out.println("B");
		}catch(Exception e){
			System.out.println("C");
			System.out.println(e);
			System.out.println("D");
		}finally{
			System.out.println("Clean up");
		}

	}

}
