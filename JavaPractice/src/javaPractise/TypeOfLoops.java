package javaPractise;
import java.util.*;

public class TypeOfLoops {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("20");
		list.add("30");
		list.add("40");
		System.out.println(list.size());

		System.out.println("While Loop:");
		Iterator itr = list.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Advanced For Loop:");
		for(Object obj : list) {
			System.out.println(obj);
		}

		System.out.println("for-each loop:");
		int[] numbers = {3, 4, 5, -5, 0, 12};
		int sum = 0;
		for (int number: numbers) {
			sum += number;
		}
		System.out.println("Sum = " + sum);		

		//https://www.javatpoint.com/for-each-loop
		System.out.println(":OR:");
		System.out.println("for-each loop:");
		int arr[]={12,13,14,44};  		  
		for(int i:arr){  
			System.out.println(i);  
		}  

		System.out.println("For Loop:");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}