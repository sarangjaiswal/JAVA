package CollectionExamples;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("a");
		a.add("b");
		a.add("c");
		System.out.println(a.size());
		
		for (String string : a) {
			System.out.println(string);
		}
		

	}

}
