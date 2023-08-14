package collectiondemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new TreeMap<Integer, Employee>();
		
		map.put(101, new Employee(1,"John", "NY"));
		map.put(102, new Employee(2,"kishu", "PA"));
		map.put(103, new Employee(3,"bela", "NC"));
		
		System.out.println(map);
		
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
	}
	
	}
}
