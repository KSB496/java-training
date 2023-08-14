package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<String>();
		lst.add("Amitabh");
		lst.add("tom");
		lst.add("walker");
		lst.add("dan");
		lst.add("maria");
		lst.add("Ahmed");
		/*for(String s : lst) {
			if(s.charAt(0)=='A') {
				System.out.println(s);
			}		
		}*/
		
		//lst.stream().filter((s) -> s.startsWith("A")).map(String :: toUpperCase).forEach(System.out :: println);
		//lst.stream().sorted().map(String :: toUpperCase).forEach(System.out :: println);
		
		//collect(Collectors.toList()) = to retrieve list, store it
		List<String> data = lst.stream().sorted().map(String :: toUpperCase).collect(Collectors.toList());
		System.out.println(data);
		
		
		//count() = to count the no. of data added to list
		System.out.println(lst.stream().sorted().map(String :: toUpperCase).count());
	}
	
}
