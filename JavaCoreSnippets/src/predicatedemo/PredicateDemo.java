/**_Predicate */

package predicatedemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String args[]) {
		Predicate<Integer> pred1 = (i)-> i > 50; // filters greater than 50 
		Predicate<Integer> pred2 = (i)-> i < 50; // filters less than 50
		
		List<Integer> nums = Arrays.asList(12,34,55,76,100,22,81);
		
		System.out.println("Numbers above 50");
		nums.forEach((i)-> { 
			if(pred1.test(i)) {
				System.out.println(i);
			}
		});
		
		System.out.println("Numbers below 50");
		nums.forEach((i)-> { 
			if(pred2.test(i)) {
				System.out.println(i);
			}
		});
		
	}
}
