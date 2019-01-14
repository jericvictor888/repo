/**
 * _equals vs ==, _String Literal vs _String object
 */

package equalvsequals;

public class EqualsVsEquals {
	public static void main(String[] args) {
		
		/**
		 * String object already overrides the equals() and hashCode() method.
		 * Thus, it will check for the content equality
		 */
		String a = new String("Jon Snow");      
		String b = new String("Jon Snow");
		String c = "Daenarys";
		String d = a;
		
		System.out.println(a==d);   // true because they point to the same reference or memory location
		System.out.println(a==b);   // false because they point to different reference or memory location event of content are the same
		System.out.println("a.equals(b): " + a.equals(b)); //true because of the same content
		System.out.println("a.equals(c): " + a.equals(c)); //false because of different content
		
		
		String x = "Tyrion";
		String y = "Tyrion";
		/**
		 * true because they point to the same memory location
		 * Everytime a string literal is defined it calls String object's intern() method to check if there
		 * is already an existing string (in this case Tyrion) from the reference internal pool of string objects.
		 * Then returns that existing string from the pool. It does not define a new one if there already is.
		 */
		System.out.println(x==y); 
	}
}


