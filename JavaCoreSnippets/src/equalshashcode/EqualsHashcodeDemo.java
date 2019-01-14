/**
 * _equals, _hashCode
 */
package equalshashcode;

public class EqualsHashcodeDemo {
	public static void main(String[] args) {
		Person p1 = new Person("John");
		Person p2 = new Person("John");
		Person p3 = p1;
		/**
		 * Returns false even if the content are the same
		 * because equals() and hashCode() are not overriden.
		 * equals() default implementation is to check for reference equality
		 */
		System.out.println(p1.equals(p2)); 
		System.out.println(p1.equals(p3)); //returns true because of same reference

						
		Student s1 = new Student("John");
		Student s2 = new Student("John");
		/**
		 * Returns true because equals() and hashCode() are overriden
		 */
		System.out.println(s1.equals(s2)); 

		//////////////////////////////////////////////////////////////////////////		
		
		/**Understanding hashCode()*/
		String x = "John";
		String y = "John";
		
		System.out.println(x.hashCode());   //x hashCode is same with y because of same memory location
		System.out.println(y.hashCode());  
		
		Person px = new Person("John");
		Person py = new Person("John");
		/**
		 * px hashCode is different from py because of different memory location
		 * Person class did not override hashCode method. 
		 * Thus, even if content are the same it still points to different memory location
		 */
		System.out.println(px.hashCode());  
		System.out.println(py.hashCode());
		
	}
}


