/**
 * _Stream, _SequentialStream, _filter, _Array Stream
 */
package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		Predicate<Integer> pred = (num)-> num > 50; 

		List<Integer> arr = Arrays.asList(23,11,53,54,78);
		
		arr.stream()
		   .filter(pred)             //filters number above 50     
		   .forEach((num)-> System.out.println(num)); //displays the result of filter
	
	
        /** Demo to convert array to stream */	
		Integer[] ar = {1,2,3,4};
		
		Stream<Integer> stream1 = Stream.of(ar);  //one way to convert array to stream
		Stream<Integer> stream2 = Arrays.stream(ar); //another way to convert array to stream
		
	}

}
