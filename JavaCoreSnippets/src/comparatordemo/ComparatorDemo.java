/**
 * _Comparator , _Lambda, _ForEach
 */
package comparatordemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		Comparator<String> compAsc = (str1, str2)-> str1.compareTo(str2); // arrange to ascending
		Comparator<String> compDesc = (str1, str2)-> str2.compareTo(str1); //arrange to descending
		
		List<String> arr = Arrays.asList("winter","spring","fall");
		
		Collections.sort(arr, compAsc);		
		arr.forEach((str)-> System.out.println(str));
		
		Collections.sort(arr, compDesc);
		arr.forEach((str)-> System.out.println(str));
	}
}
