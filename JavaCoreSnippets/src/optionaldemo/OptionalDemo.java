/** 
 * _Optional, _OptionalDouble, _mapToInt, _average, _sum
 */

package optionaldemo;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalDemo {
	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Jon Snow", 35));
		persons.add(new Person("Daenarys Targarean", 32));
		persons.add(new Person("Tyrion Lanister", 40));
		
		/** Get the sum of their ages */
		int sum = persons
				.stream()
				.mapToInt(p -> p.getAge())  //mapToInt is used to break a complex object to get a specific value
				.sum();
		
		System.out.println("Sum all ages: "+ sum);
		
		
		/** Get the average of their ages */		
		OptionalDouble average = persons    // OptionalDouble is used prevent division by zero
				.stream()
				.mapToInt(p -> p.getAge())  
				.average();
	
		if (average.isPresent()) {
			System.out.println("Average of all ages: " + average.getAsDouble());
		} else {
			System.out.println("Average not calculated"); //Can occur when average method encounters division by zero
		}
	}
}
