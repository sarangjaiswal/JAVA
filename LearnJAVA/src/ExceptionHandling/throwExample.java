package ExceptionHandling;

public class throwExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throw new Exception ("Some Exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is caught");
			System.out.println(e.getMessage());
		}

	}

}
