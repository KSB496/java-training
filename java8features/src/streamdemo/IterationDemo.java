package streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;



public class IterationDemo {

	public static void main(String[] args) {
		
		/*String[] array = {"Hello","Welcome"};	
		ArrayList<String> a1 = new ArrayList<String>();
		for(String s : array) {
			System.out.print(s.toUpperCase() + " ");
		}*/
		
		/*List<String> lst = Arrays.asList(new String[] {"admin","manager","qa"});
		lst.forEach(i -> i.toUpperCase());*/
		
		/*int sum=0;	
		List<Integer> lst = Arrays.asList(10,5,15,20);
		for(Integer i : lst) {
			if(i>10) {
				sum += i;
			}		
		}
		System.out.println(sum);*/
		
		System.out.println(sumData(Arrays.asList(10,5,15,20)));	

	}
	
	private static int sumData(List<Integer> list) {
	
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
		/*Iterator<Integer> it = list.iterator();
		int sum = 0;
		while(it.hasNext()) {
			int num = it.next();
			
			if(num>10) {
				sum += num;
			}
		}
		return sum;*/
	}

}
