package CollectionExamples;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, String> table1 = new Hashtable<String, String>();
		
		table1.put("City1", "bangalore");
		table1.put("City2", "mumbai");
		table1.put("City3", "kalyan");

		System.out.println(table1.size());
		System.out.println(table1.get("City1"));
		
		Hashtable<String, String> table2 = new Hashtable<String, String>();
		
		table2.put("City1", "charlotte");
		table2.put("City2", "atlanta");
		table2.put("City3", "florida");
		
		Hashtable<String, Hashtable<String, String>> table = new Hashtable<String, Hashtable<String, String>>();
		
		table.put("India", table1);
		table.put("USA", table2);
		
		System.out.println(table.get("India").get("City3"));

		
		
		
	}

}
