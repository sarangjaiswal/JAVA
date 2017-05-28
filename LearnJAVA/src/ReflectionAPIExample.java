import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAPIExample {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		String x = "SampleTest";
		Method method = ReflectionAPIExample.class.getMethod(x, String.class);
		method.invoke(method, "Milk");

	}
	
	public static void SampleTest(String item){
		System.out.println("The items is: "+ item);
	}

}
