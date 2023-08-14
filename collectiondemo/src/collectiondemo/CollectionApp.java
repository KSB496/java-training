package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CollectionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		//map.put("USA", new ArrayList(Arrays.asList("Boston","NY","PA")));
		//map.put("CANADA", new ArrayList(Arrays.asList("Alberta","Tornto","Berrie")));
		//map.put("INDIA", new ArrayList(Arrays.asList("Gujarat","Mumbai","Bangalore")));
		
		HashMap<String, ArrayList<Employee>> map1 = new HashMap<String, ArrayList<Employee>>();
		map1.put("USA", new ArrayList(Arrays.asList(new Employee(101, "kajal", "CS"))));
		map1.put("CANADA", new ArrayList(Arrays.asList(new Employee(102, "kishu", "IT"))));
		map1.put("INDIA", new ArrayList(Arrays.asList(new Employee(103, "bela", "Business"))));
		
		//for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
			//System.out.println("iterating cities of countries " + entry.getKey());
			//for(String city : entry.getValue()) {
				//System.out.println(city);
			//}
		//}
		
		for (Map.Entry<String, ArrayList<Employee>> entry : map1.entrySet()) {
			System.out.println("iterating Employees of countries " + entry.getKey());
			for(Employee city : entry.getValue()) {
				System.out.println(city);
			}
		}
	}

}
